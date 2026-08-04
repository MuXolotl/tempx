package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;

/* JADX INFO: renamed from: lٍٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17483l implements InterfaceC2329l, InterfaceC14681l, InterfaceC13077l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f34049l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final NativePointer f34050l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC7832l f34051l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5501l f34052l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC1388l f34053l;

    public C17483l(long j, InterfaceC1388l interfaceC1388l, InterfaceC7832l interfaceC7832l, C5501l c5501l, LongPointerWrapper longPointerWrapper) {
        this.f34051l = interfaceC7832l;
        this.f34050l = longPointerWrapper;
        this.f34049l = j;
        this.f34053l = interfaceC1388l;
        this.f34052l = c5501l;
    }

    @Override // defpackage.InterfaceC14681l
    public final void amazon() {
        C1332l f36736l;
        InterfaceC2851l interfaceC2851lYandex = yandex();
        if (interfaceC2851lYandex == null || (f36736l = interfaceC2851lYandex.getF36705l()) == null) {
            return;
        }
        f36736l.amazon();
    }

    @Override // defpackage.InterfaceC13077l
    public final InterfaceC2257l vip() {
        long ptr$cinterop_release = ((LongPointerWrapper) this.f34050l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C0093l(new LongPointerWrapper(realmcJNI.realm_query_find_all(ptr$cinterop_release), false, 2, null), this.f34049l, this.f34053l, this.f34052l);
    }

    public final InterfaceC2851l yandex() {
        C3535l c3535lYandex;
        realm_value_t realm_value_tVar = new realm_value_t();
        boolean[] zArr = {false};
        long ptr$cinterop_release = ((LongPointerWrapper) this.f34050l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_query_find_first(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar, zArr);
        if (!zArr[0]) {
            c3535lYandex = null;
        } else {
            if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 10) {
                throw new IllegalStateException(("Query did not return link but " + realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar)).toString());
            }
            c3535lYandex = AbstractC10340l.yandex(realm_value_tVar);
        }
        if (c3535lYandex == null) {
            return null;
        }
        return AbstractC6710l.isPro(c3535lYandex, this.f34053l, this.f34052l, this.f34051l);
    }
}
