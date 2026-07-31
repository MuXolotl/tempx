package defpackage;

import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٍٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7892l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f16460l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f16461l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C1332l f16462l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Map f16463l;

    public C7892l(C1332l c1332l, long j, int i, Map map) {
        this.f16462l = c1332l;
        this.f16461l = j;
        this.f16460l = i;
        this.f16463l = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9671l interfaceC9671lSubs = ((C14076l) ((InterfaceC3327l) obj)).subs(AbstractC18202l.yandex.loadAd(InterfaceC9671l.class));
        C1332l c1332l = this.f16462l;
        c1332l.yandex();
        C5501l c5501l = c1332l.f3423l;
        InterfaceC7832l interfaceC7832l = c1332l.f3419l;
        if (interfaceC9671lSubs != null) {
            C1332l f36799l = ((InterfaceC2851l) interfaceC9671lSubs).getF36705l();
            if (f36799l == null) {
                interfaceC9671lSubs = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lSubs, this.f16460l, this.f16463l);
            } else if (!AbstractC8576l.yandex(f36799l.f3419l, interfaceC7832l)) {
                C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                return null;
            }
        } else {
            interfaceC9671lSubs = null;
        }
        C1332l f36799l2 = interfaceC9671lSubs != null ? ((InterfaceC2851l) interfaceC9671lSubs).getF36705l() : null;
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarInmobi = c3585l.inmobi(f36799l2);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, this.f16461l, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, false);
        Unit unit = Unit.INSTANCE;
        c3585l.tapsense();
        return Unit.INSTANCE;
    }
}
