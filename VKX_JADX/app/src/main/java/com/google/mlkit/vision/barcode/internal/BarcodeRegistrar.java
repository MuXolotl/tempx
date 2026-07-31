package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14904l;
import defpackage.C12186l;
import defpackage.C13411l;
import defpackage.C16222l;
import defpackage.C1652l;
import defpackage.C16936l;
import defpackage.C4652l;
import defpackage.C6319l;
import defpackage.C7854l;
import defpackage.C8271l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(C8271l.class);
        c1652lLoadAd.yandex(C12186l.loadAd(C7854l.class));
        c1652lLoadAd.mopub = new C16222l(17);
        C4652l c4652lLoadAd = c1652lLoadAd.loadAd();
        C1652l c1652lLoadAd2 = C4652l.loadAd(C13411l.class);
        c1652lLoadAd2.yandex(C12186l.loadAd(C8271l.class));
        c1652lLoadAd2.yandex(C12186l.loadAd(C6319l.class));
        c1652lLoadAd2.yandex(C12186l.loadAd(C7854l.class));
        c1652lLoadAd2.mopub = new C16936l(19);
        return AbstractC14904l.smaato(c4652lLoadAd, c1652lLoadAd2.loadAd());
    }
}
