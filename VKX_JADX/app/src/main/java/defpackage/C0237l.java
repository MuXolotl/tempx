package defpackage;

import androidx.car.app.model.Alert;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0237l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f1220l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1221l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1222l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f1223l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f1224l;

    public /* synthetic */ C0237l(C17219l c17219l, int i, Map map, C3585l c3585l) {
        this.f1222l = 2;
        this.f1220l = c17219l;
        this.f1221l = i;
        this.f1224l = map;
        this.f1223l = c3585l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f1222l;
        int i2 = 0;
        Object obj2 = this.f1223l;
        int i3 = this.f1221l;
        Object obj3 = this.f1224l;
        Object obj4 = this.f1220l;
        switch (i) {
            case 0:
                C6467l c6467l = (C6467l) obj3;
                C7661l c7661l = (C7661l) obj2;
                if (obj == ((C8610l) obj4)) {
                    C8339l.smaato("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof InterfaceC2763l) {
                    int i4 = c6467l.yandex - i3;
                    int iAmazon = c7661l.amazon(obj);
                    c7661l.mopub(Math.min(i4, iAmazon >= 0 ? c7661l.crashlytics[iAmazon] : Alert.DURATION_SHOW_INDEFINITELY), obj);
                }
                return Unit.INSTANCE;
            case 1:
                C17713l c17713l = (C17713l) obj4;
                InterfaceC7448l interfaceC7448l = (InterfaceC7448l) obj3;
                AbstractC10113l abstractC10113l = (AbstractC10113l) obj2;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                int i5 = c17713l.f34525l;
                C15271l c15271l = c17713l.f34526l;
                C4991l c4991l = c17713l.f34524l;
                C11224l c11224l = (C11224l) c17713l.f34527l.invoke();
                c15271l.yandex(EnumC7283l.f15125l, AbstractC5578l.loadAd(abstractC9601l, i5, c4991l, c11224l != null ? c11224l.yandex : null, interfaceC7448l.getLayoutDirection() == EnumC9931l.f20222l, abstractC10113l.f20592l), i3, abstractC10113l.f20592l);
                AbstractC9601l.smaato(abstractC9601l, abstractC10113l, Math.round(-c15271l.yandex.admob()), 0);
                return Unit.INSTANCE;
            case 2:
                C17219l c17219l = (C17219l) obj4;
                Map map = (Map) obj3;
                C3585l c3585l = (C3585l) obj2;
                InterfaceC9671l interfaceC9671lSubs = ((C14076l) ((InterfaceC3327l) obj)).subs(AbstractC18202l.yandex.loadAd(InterfaceC11343l.class));
                C5501l c5501l = (C5501l) c17219l.f33423l;
                InterfaceC7832l interfaceC7832l = (InterfaceC7832l) c17219l.f33427l;
                if (interfaceC9671lSubs != null) {
                    C1332l f36749l = ((InterfaceC2851l) interfaceC9671lSubs).getF36799l();
                    if (f36749l == null) {
                        interfaceC9671lSubs = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lSubs, i3, map);
                    } else if (!AbstractC8576l.yandex(f36749l.f3419l, interfaceC7832l)) {
                        C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                        return null;
                    }
                } else {
                    interfaceC9671lSubs = null;
                }
                C1332l f36749l2 = interfaceC9671lSubs != null ? ((InterfaceC2851l) interfaceC9671lSubs).getF36799l() : null;
                LongPointerWrapper longPointerWrapper = (LongPointerWrapper) c17219l.f33426l;
                realm_value_t realm_value_tVarInmobi = c3585l.inmobi(f36749l2);
                boolean[] zArr = new boolean[1];
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i6 = AbstractC9795l.yandex;
                realmcJNI.realm_set_insert(ptr$cinterop_release, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, new long[1], zArr);
                return Boolean.valueOf(zArr[0]);
            default:
                AbstractC10113l[] abstractC10113lArr = (AbstractC10113l[]) obj4;
                C5062l c5062l = (C5062l) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj;
                int length = abstractC10113lArr.length;
                int i7 = 0;
                while (i2 < length) {
                    AbstractC10113l abstractC10113l2 = abstractC10113lArr[i2];
                    int i8 = i7 + 1;
                    Object objSignature = abstractC10113l2.Signature();
                    C1809l c1809l = objSignature instanceof C1809l ? (C1809l) objSignature : null;
                    AbstractC13831l abstractC13831l = c1809l != null ? c1809l.crashlytics : null;
                    abstractC9601l2.mopub(abstractC10113l2, iArr[i7], abstractC13831l != null ? abstractC13831l.loadAd(i3, abstractC10113l2.f20591l, EnumC9931l.f20223l) : c5062l.loadAd.yandex(abstractC10113l2.f20591l, i3), 0.0f);
                    i2++;
                    i7 = i8;
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0237l(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f1222l = i2;
        this.f1220l = obj;
        this.f1224l = obj2;
        this.f1223l = obj3;
        this.f1221l = i;
    }

    public /* synthetic */ C0237l(AbstractC10113l[] abstractC10113lArr, C5062l c5062l, int i, int[] iArr) {
        this.f1222l = 3;
        this.f1220l = abstractC10113lArr;
        this.f1224l = c5062l;
        this.f1221l = i;
        this.f1223l = iArr;
    }
}
