package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC10392l;
import defpackage.AbstractC3343l;
import defpackage.C10819l;
import defpackage.C12186l;
import defpackage.C13772l;
import defpackage.C13975l;
import defpackage.C15445l;
import defpackage.C15655l;
import defpackage.C1652l;
import defpackage.C16543l;
import defpackage.C17334l;
import defpackage.C2183l;
import defpackage.C2187l;
import defpackage.C2582l;
import defpackage.C2782l;
import defpackage.C3365l;
import defpackage.C4652l;
import defpackage.C4746l;
import defpackage.C6319l;
import defpackage.C6664l;
import defpackage.C6760l;
import defpackage.C7854l;
import defpackage.C9912l;
import defpackage.ExecutorServiceC18081l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C1652l c1652lLoadAd = C4652l.loadAd(C2782l.class);
        c1652lLoadAd.yandex(C12186l.loadAd(C7854l.class));
        c1652lLoadAd.mopub = new C13975l(15);
        C4652l c4652lLoadAd = c1652lLoadAd.loadAd();
        C1652l c1652lLoadAd2 = C4652l.loadAd(ExecutorServiceC18081l.class);
        c1652lLoadAd2.mopub = new C10819l(16);
        C4652l c4652lLoadAd2 = c1652lLoadAd2.loadAd();
        C1652l c1652lLoadAd3 = C4652l.loadAd(C16543l.class);
        c1652lLoadAd3.yandex(new C12186l(2, 0, C2187l.class));
        c1652lLoadAd3.mopub = new C13975l(17);
        C4652l c4652lLoadAd3 = c1652lLoadAd3.loadAd();
        C1652l c1652lLoadAd4 = C4652l.loadAd(C6319l.class);
        c1652lLoadAd4.yandex(new C12186l(1, 1, ExecutorServiceC18081l.class));
        c1652lLoadAd4.mopub = new C15655l(18);
        C4652l c4652lLoadAd4 = c1652lLoadAd4.loadAd();
        C1652l c1652lLoadAd5 = C4652l.loadAd(C15445l.class);
        c1652lLoadAd5.mopub = new C2183l(20);
        C4652l c4652lLoadAd5 = c1652lLoadAd5.loadAd();
        C1652l c1652lLoadAd6 = C4652l.loadAd(C13772l.class);
        c1652lLoadAd6.yandex(C12186l.loadAd(C15445l.class));
        c1652lLoadAd6.mopub = new C6760l(22);
        C4652l c4652lLoadAd6 = c1652lLoadAd6.loadAd();
        C1652l c1652lLoadAd7 = C4652l.loadAd(C17334l.class);
        c1652lLoadAd7.yandex(C12186l.loadAd(C7854l.class));
        c1652lLoadAd7.mopub = new C9912l(24);
        C4652l c4652lLoadAd7 = c1652lLoadAd7.loadAd();
        C1652l c1652lLoadAd8 = C4652l.loadAd(C2187l.class);
        c1652lLoadAd8.crashlytics = 1;
        c1652lLoadAd8.yandex(new C12186l(1, 1, C17334l.class));
        c1652lLoadAd8.mopub = new C2582l(24);
        C4652l c4652lLoadAd8 = c1652lLoadAd8.loadAd();
        C3365l c3365l = AbstractC3343l.f7125l;
        Object[] objArr = {C6664l.loadAd, c4652lLoadAd, c4652lLoadAd2, c4652lLoadAd3, c4652lLoadAd4, c4652lLoadAd5, c4652lLoadAd6, c4652lLoadAd7, c4652lLoadAd8};
        AbstractC10392l.ads(9, objArr);
        return new C4746l(9, objArr);
    }
}
