package org.bouncycastle.jcajce.provider.drbg;

import defpackage.AbstractC8151l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
class EntropyGatherer implements Runnable {
    private static final Logger LOG = Logger.getLogger(EntropyGatherer.class.getName());
    private final IncrementalEntropySource baseRandom;
    private final AtomicReference<byte[]> entropy;
    private final long pause = getPause();
    private final AtomicBoolean seedAvailable;

    public EntropyGatherer(IncrementalEntropySource incrementalEntropySource, AtomicBoolean atomicBoolean, AtomicReference<byte[]> atomicReference) {
        this.baseRandom = incrementalEntropySource;
        this.seedAvailable = atomicBoolean;
        this.entropy = atomicReference;
    }

    private static long getPause() {
        String strLoadAd = AbstractC8151l.loadAd("org.bouncycastle.drbg.gather_pause_secs");
        if (strLoadAd != null) {
            try {
                return Long.parseLong(strLoadAd) * 1000;
            } catch (Exception unused) {
            }
        }
        return 5000L;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.entropy.set(this.baseRandom.getEntropy(this.pause));
            this.seedAvailable.set(true);
        } catch (InterruptedException unused) {
            Logger logger = LOG;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("entropy request interrupted - exiting");
            }
            Thread.currentThread().interrupt();
        }
    }
}
