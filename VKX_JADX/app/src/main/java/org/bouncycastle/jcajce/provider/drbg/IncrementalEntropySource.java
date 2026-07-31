package org.bouncycastle.jcajce.provider.drbg;

import defpackage.InterfaceC13380l;

/* JADX INFO: loaded from: classes3.dex */
interface IncrementalEntropySource extends InterfaceC13380l {
    @Override // defpackage.InterfaceC13380l
    /* synthetic */ int entropySize();

    @Override // defpackage.InterfaceC13380l
    /* synthetic */ byte[] getEntropy();

    byte[] getEntropy(long j);

    /* synthetic */ boolean isPredictionResistant();
}
