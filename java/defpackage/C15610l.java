package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15610l implements InterfaceC4182l {
    public final C0098l loadAd;
    public final C10038l yandex;

    public C15610l(C7757l c7757l) {
        this.yandex = new C10038l(c7757l, C2782l.f6050l, new C10933l(null));
        C16412l c16412l = c7757l.yandex;
        c16412l.getClass();
        this.loadAd = new C0098l(c16412l, new ConcurrentHashMap(3, 1.0f, 2), new C2911l(7), 0);
    }

    public final C16760l amazon(C2312l c2312l) {
        ((C7757l) this.yandex.f20463l).loadAd.getClass();
        C11239l c11239l = new C11239l(this, new C1553l(c2312l), 3);
        C0098l c0098l = this.loadAd;
        c0098l.getClass();
        Object objInvoke = c0098l.invoke(new C16165l(c2312l, c11239l));
        if (objInvoke != null) {
            return (C16760l) objInvoke;
        }
        C0098l.yandex(3);
        throw null;
    }

    @Override // defpackage.InterfaceC4182l
    public final void crashlytics(C2312l c2312l, ArrayList arrayList) {
        arrayList.add(amazon(c2312l));
    }

    @Override // defpackage.InterfaceC4182l
    public final boolean loadAd(C2312l c2312l) {
        ((C7757l) this.yandex.f20463l).loadAd.getClass();
        return false;
    }

    @Override // defpackage.InterfaceC4182l
    public final Collection remoteconfig(C2312l c2312l, Function1 function1) {
        List list = (List) amazon(c2312l).f32765l.invoke();
        return list == null ? C2580l.f5619l : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C7757l) this.yandex.f20463l).metrica;
    }

    @Override // defpackage.InterfaceC4182l
    public final List yandex(C2312l c2312l) {
        return Collections.singletonList(amazon(c2312l));
    }
}
