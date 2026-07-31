package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC14055l;
import defpackage.AbstractC1872l;
import defpackage.C12186l;
import defpackage.C12638l;
import defpackage.C1652l;
import defpackage.C18450l;
import defpackage.C2782l;
import defpackage.C4652l;
import defpackage.C6928l;
import defpackage.C7472l;
import defpackage.InterfaceC1444l;
import defpackage.InterfaceC2028l;
import defpackage.InterfaceC2293l;
import defpackage.InterfaceC8866l;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Llؗؕۗ;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C4652l> getComponents() {
        C1652l c1652lYandex = C4652l.yandex(new C12638l(InterfaceC1444l.class, AbstractC1872l.class));
        c1652lYandex.yandex(new C12186l(new C12638l(InterfaceC1444l.class, Executor.class), 1, 0));
        c1652lYandex.mopub = C18450l.f36027l;
        C4652l c4652lLoadAd = c1652lYandex.loadAd();
        C1652l c1652lYandex2 = C4652l.yandex(new C12638l(InterfaceC2028l.class, AbstractC1872l.class));
        c1652lYandex2.yandex(new C12186l(new C12638l(InterfaceC2028l.class, Executor.class), 1, 0));
        c1652lYandex2.mopub = C2782l.f6063l;
        C4652l c4652lLoadAd2 = c1652lYandex2.loadAd();
        C1652l c1652lYandex3 = C4652l.yandex(new C12638l(InterfaceC8866l.class, AbstractC1872l.class));
        c1652lYandex3.yandex(new C12186l(new C12638l(InterfaceC8866l.class, Executor.class), 1, 0));
        c1652lYandex3.mopub = C6928l.f14513l;
        C4652l c4652lLoadAd3 = c1652lYandex3.loadAd();
        C1652l c1652lYandex4 = C4652l.yandex(new C12638l(InterfaceC2293l.class, AbstractC1872l.class));
        c1652lYandex4.yandex(new C12186l(new C12638l(InterfaceC2293l.class, Executor.class), 1, 0));
        c1652lYandex4.mopub = C7472l.f15461l;
        return AbstractC14055l.remoteconfig(c4652lLoadAd, c4652lLoadAd2, c4652lLoadAd3, c1652lYandex4.loadAd());
    }
}
