package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًّۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12834l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25229l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25230l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25231l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f25232l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f25233l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f25234l;

    public /* synthetic */ C12834l(C5434l c5434l, int i, Map map, C3585l c3585l, realm_value_t realm_value_tVar) {
        this.f25229l = c5434l;
        this.f25230l = i;
        this.f25233l = map;
        this.f25232l = c3585l;
        this.f25234l = realm_value_tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9671l interfaceC9671lSubs;
        int i = this.f25231l;
        int i2 = 0;
        Object obj2 = this.f25234l;
        Object obj3 = this.f25232l;
        Object obj4 = this.f25233l;
        int i3 = this.f25230l;
        Object obj5 = this.f25229l;
        switch (i) {
            case 0:
                AbstractC10113l[] abstractC10113lArr = (AbstractC10113l[]) obj5;
                C1853l c1853l = (C1853l) obj4;
                InterfaceC7448l interfaceC7448l = (InterfaceC7448l) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                int length = abstractC10113lArr.length;
                int i4 = 0;
                while (i2 < length) {
                    AbstractC10113l abstractC10113l = abstractC10113lArr[i2];
                    int i5 = i4 + 1;
                    Object objSignature = abstractC10113l.Signature();
                    C1809l c1809l = objSignature instanceof C1809l ? (C1809l) objSignature : null;
                    EnumC9931l layoutDirection = interfaceC7448l.getLayoutDirection();
                    AbstractC13831l abstractC13831l = c1809l != null ? c1809l.crashlytics : null;
                    abstractC9601l.mopub(abstractC10113l, abstractC13831l != null ? abstractC13831l.loadAd(i3, abstractC10113l.f20592l, layoutDirection) : c1853l.loadAd.yandex(abstractC10113l.f20592l, i3, layoutDirection), iArr[i4], 0.0f);
                    i2++;
                    i4 = i5;
                }
                return Unit.INSTANCE;
            default:
                C5434l c5434l = (C5434l) obj5;
                Map map = (Map) obj4;
                C3585l c3585l = (C3585l) obj3;
                realm_value_t realm_value_tVar = (realm_value_t) obj2;
                InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj;
                boolean z = c5434l.f11650l;
                if (z) {
                    interfaceC9671lSubs = ((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC11343l.class));
                } else {
                    if (z) {
                        C18725l.billing();
                        return null;
                    }
                    interfaceC9671lSubs = ((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC7457l.class));
                }
                C5501l c5501l = c5434l.f11649l;
                InterfaceC7832l interfaceC7832l = c5434l.f11648l;
                if (interfaceC9671lSubs != null) {
                    C1332l f36799l = ((InterfaceC2851l) interfaceC9671lSubs).getF36799l();
                    if (f36799l == null) {
                        interfaceC9671lSubs = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lSubs, i3, map);
                    } else if (!AbstractC8576l.yandex(f36799l.f3419l, interfaceC7832l)) {
                        C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                        return null;
                    }
                } else {
                    interfaceC9671lSubs = null;
                }
                realm_value_t realm_value_tVarInmobi = c3585l.inmobi(interfaceC9671lSubs != null ? ((InterfaceC2851l) interfaceC9671lSubs).getF36799l() : null);
                LongPointerWrapper longPointerWrapper = c5434l.f11651l;
                realm_value_t realm_value_tVar2 = new realm_value_t();
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i6 = AbstractC9795l.yandex;
                realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar, realm_value_tVar2.yandex, realm_value_tVar2, new boolean[1]);
                boolean[] zArr = new boolean[1];
                realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVar.yandex, realm_value_tVar, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, new long[1], zArr);
                return new C8195l(c5434l.purchase(realm_value_tVar2, realm_value_tVar), Boolean.valueOf(zArr[0]));
        }
    }

    public /* synthetic */ C12834l(AbstractC10113l[] abstractC10113lArr, C1853l c1853l, int i, InterfaceC7448l interfaceC7448l, int[] iArr) {
        this.f25229l = abstractC10113lArr;
        this.f25233l = c1853l;
        this.f25230l = i;
        this.f25232l = interfaceC7448l;
        this.f25234l = iArr;
    }
}
