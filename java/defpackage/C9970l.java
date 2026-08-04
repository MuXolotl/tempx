package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lٍۧۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9970l {
    public final C6731l admob;
    public final C14187l mopub;
    public final Object subs;
    public final C11911l yandex;
    public final ArrayList loadAd = new ArrayList();
    public final ArrayList crashlytics = new ArrayList();
    public final ArrayList amazon = new ArrayList();
    public final ArrayList purchase = new ArrayList();
    public final ArrayList billing = new ArrayList();

    public C9970l(C14187l c14187l, C6731l c6731l, Object obj, C11911l c11911l) {
        this.yandex = c11911l;
        this.mopub = c14187l;
        this.admob = c6731l;
        this.subs = obj;
    }

    public final void loadAd(List list, C12222l c12222l, String str, Function2 function2, Function4 function4) {
        list.add(new C1278l(new C2831l(c12222l, this, str, new C3469l(function4, null, 1), function2, 5)));
    }

    public final C6731l yandex() {
        return this.admob;
    }
}
