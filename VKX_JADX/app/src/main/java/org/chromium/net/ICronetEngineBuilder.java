package org.chromium.net;

import java.util.Collections;
import java.util.Date;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ICronetEngineBuilder {
    public static final int CONNECTION_MIGRATION_OPTIONS = 1;
    public static final int DNS_OPTIONS = 2;
    public static final int QUIC_OPTIONS = 3;

    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i, int i2);

    public abstract ExperimentalCronetEngine build();

    public abstract ICronetEngineBuilder enableHttp2(boolean z);

    public abstract ICronetEngineBuilder enableHttpCache(int i, long j);

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z);

    public abstract ICronetEngineBuilder enableQuic(boolean z);

    public abstract ICronetEngineBuilder enableSdch(boolean z);

    public abstract String getDefaultUserAgent();

    public Set<Integer> getSupportedConfigOptions() {
        return Collections.EMPTY_SET;
    }

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public abstract ICronetEngineBuilder setUserAgent(String str);

    public ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        return this;
    }

    public ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        return this;
    }

    public ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        return this;
    }

    public ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
