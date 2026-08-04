package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًۜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8276l {
    public final C7073l admob;
    public C6561l crashlytics;
    public final /* synthetic */ C13437l firebase;
    public final AbstractC18041l isPro;
    public int loadAd;
    public int purchase;
    public final C3498l subs;
    public InterfaceC8371l yandex;
    public InterfaceC10696l amazon = null;
    public AbstractC10794l billing = AbstractC10794l.yandex;
    public boolean mopub = true;

    public C8276l(C13437l c13437l) {
        this.firebase = c13437l;
        this.yandex = c13437l.Signature();
        this.loadAd = c13437l.startapp();
        this.crashlytics = c13437l.admob();
        this.purchase = c13437l.mo367while();
        this.admob = c13437l.f26358l;
        this.subs = c13437l.getName();
        this.isPro = c13437l.yandex();
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i == 1) {
            objArr[1] = "setOwner";
        } else if (i == 2) {
            objArr[1] = "setOriginal";
        } else if (i == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i == 5) {
            objArr[1] = "setReturnType";
        } else if (i == 7) {
            objArr[1] = "setModality";
        } else if (i == 9) {
            objArr[1] = "setVisibility";
        } else if (i == 11) {
            objArr[1] = "setKind";
        } else if (i == 19) {
            objArr[1] = "setName";
        } else if (i == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i == 16) {
            objArr[1] = "setSubstitution";
        } else if (i != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [lًؓ۟, lٍُؖ, lؗٔٝ] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [lُۢۛ] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [lًؓ۟] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable, lْٗۖ] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [lٍُؖ, lُۢۛ] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r4v15, types: [lٔۡ۠] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [l٘ٛۢ] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v11, types: [lٔۡ۠] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, lًۤؑ, lَۥٛ, lٍؘِ, lْٗۖ] */
    public final C13437l loadAd() throws C12948l {
        C7073l c7073l;
        C7073l c7073l2;
        ?? c11425l;
        ?? c1710l;
        C2201l c2201l;
        Function0 function0;
        AbstractC18041l abstractC18041lAdmob;
        InterfaceC8371l interfaceC8371l = this.yandex;
        int i = this.loadAd;
        C6561l c6561l = this.crashlytics;
        InterfaceC10696l interfaceC10696l = this.amazon;
        int i2 = this.purchase;
        C3498l c3498l = this.subs;
        C13437l c13437l = this.firebase;
        ?? Mo1004l = c13437l.mo1004l(interfaceC8371l, i, c6561l, interfaceC10696l, i2, c3498l);
        List typeParameters = c13437l.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        C2201l c2201lSubs = AbstractC6363l.subs(typeParameters, this.billing, Mo1004l, arrayList);
        AbstractC18041l abstractC18041l = this.isPro;
        AbstractC18041l abstractC18041lAdmob2 = c2201lSubs.admob(3, abstractC18041l);
        C7073l c7073l3 = null;
        if (abstractC18041lAdmob2 != null) {
            int i3 = 2;
            AbstractC18041l abstractC18041lAdmob3 = c2201lSubs.admob(2, abstractC18041l);
            if (abstractC18041lAdmob3 != null) {
                Mo1004l.mo1491l(abstractC18041lAdmob3);
            }
            C7073l c7073l4 = this.admob;
            if (c7073l4 != null) {
                C7073l c7073lIsPro = c7073l4.isPro(c2201lSubs);
                if (c7073lIsPro != null) {
                    c7073l = c7073lIsPro;
                }
            } else {
                c7073l = null;
            }
            C7073l c7073l5 = c13437l.f26355l;
            if (c7073l5 == null || (abstractC18041lAdmob = c2201lSubs.admob(2, c7073l5.yandex())) == null) {
                c7073l2 = null;
            } else {
                c7073l5.m2169l();
                c7073l2 = new C7073l(Mo1004l, new C17630l(Mo1004l, abstractC18041lAdmob), c7073l5.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c13437l.f26359l.iterator();
            while (true) {
                int i4 = 1;
                if (!it.hasNext()) {
                    break;
                }
                C7073l c7073l6 = (C7073l) it.next();
                AbstractC18041l abstractC18041lAdmob4 = c2201lSubs.admob(i3, c7073l6.yandex());
                if (abstractC18041lAdmob4 != null) {
                    C3498l c3498lM2061l = ((C6653l) c7073l6.m2169l()).m2061l();
                    c7073l6.m2169l();
                    c7073l3 = new C7073l(Mo1004l, new C6653l(Mo1004l, abstractC18041lAdmob4, c3498lM2061l, i4), c7073l6.getAnnotations());
                }
                if (c7073l3 != null) {
                    arrayList2.add(c7073l3);
                }
                c7073l3 = c7073l3;
                i3 = 2;
            }
            ?? r19 = c7073l3;
            Mo1004l.m3646l(abstractC18041lAdmob2, arrayList, c7073l, c7073l2, arrayList2);
            C11425l c11425l2 = c13437l.f26362l;
            C6162l c6162l = InterfaceC5706l.f12087l;
            if (c11425l2 == null) {
                c11425l = r19;
            } else {
                InterfaceC3841l annotations = c11425l2.getAnnotations();
                int i5 = this.loadAd;
                C6561l c6561lAdmob = c13437l.f26362l.admob();
                if (this.purchase == 2 && AbstractC6004l.purchase(AbstractC6004l.mopub(c6561lAdmob.yandex.subscription()))) {
                    c6561lAdmob = AbstractC6004l.admob;
                }
                C6561l c6561l2 = c6561lAdmob;
                C11425l c11425l3 = c13437l.f26362l;
                boolean z = c11425l3.f8330l;
                boolean z2 = c11425l3.f8325l;
                boolean z3 = c11425l3.f8327l;
                int i6 = this.purchase;
                InterfaceC10696l interfaceC10696l2 = this.amazon;
                c11425l = new C11425l(Mo1004l, annotations, i5, c6561l2, z, z2, z3, i6, interfaceC10696l2 == null ? r19 : interfaceC10696l2.crashlytics(), c6162l);
            }
            if (c11425l != 0) {
                C11425l c11425l4 = c13437l.f26362l;
                AbstractC18041l abstractC18041l2 = c11425l4.f22991l;
                c11425l.f8324l = C13437l.m3643l(c2201lSubs, c11425l4);
                c11425l.m3086l(abstractC18041l2 != null ? c2201lSubs.admob(3, abstractC18041l2) : r19);
            }
            C1710l c1710l2 = c13437l.f26365l;
            if (c1710l2 == null) {
                c1710l = r19;
            } else {
                InterfaceC3841l annotations2 = c1710l2.getAnnotations();
                int i7 = this.loadAd;
                C6561l c6561lAdmob2 = c13437l.f26365l.admob();
                if (this.purchase == 2 && AbstractC6004l.purchase(AbstractC6004l.mopub(c6561lAdmob2.yandex.subscription()))) {
                    c6561lAdmob2 = AbstractC6004l.admob;
                }
                C6561l c6561l3 = c6561lAdmob2;
                C1710l c1710l3 = c13437l.f26365l;
                boolean z4 = c1710l3.f8330l;
                boolean z5 = c1710l3.f8325l;
                boolean z6 = c1710l3.f8327l;
                int i8 = this.purchase;
                InterfaceC10696l interfaceC10696l3 = this.amazon;
                c1710l = new C1710l(Mo1004l, annotations2, i7, c6561l3, z4, z5, z6, i8, interfaceC10696l3 == null ? r19 : interfaceC10696l3.amazon(), c6162l);
            }
            if (c1710l != 0) {
                c2201l = c2201lSubs;
                List listM2894l = AbstractC10175l.m2894l(c1710l, c13437l.f26365l.mo1007finally(), c2201l, false, false, null);
                if (listM2894l == null) {
                    listM2894l = Collections.singletonList(C1710l.m1005l(c1710l, AbstractC3759l.purchase(this.yandex).vip(), ((C17538l) c13437l.f26365l.mo1007finally().get(0)).getAnnotations()));
                }
                if (listM2894l.size() != 1) {
                    C18073l.admob();
                    return r19;
                }
                c1710l.f8324l = C13437l.m3643l(c2201l, c13437l.f26365l);
                C17538l c17538l = (C17538l) listM2894l.get(0);
                if (c17538l == null) {
                    C1710l.m1006l(6);
                    throw r19;
                }
                c1710l.f4098l = c17538l;
            } else {
                c2201l = c2201lSubs;
            }
            C15249l c15249l = c13437l.f26368l;
            ?? c15249l2 = c15249l == null ? r19 : new C15249l(c15249l.getAnnotations());
            C15249l c15249l3 = c13437l.f26354l;
            Mo1004l.m3647l(c11425l, c1710l, c15249l2, c15249l3 == null ? r19 : new C15249l(c15249l3.getAnnotations()));
            if (this.mopub) {
                int i9 = C4853l.f9907l;
                C4853l c4853lCrashlytics = AbstractC11621l.crashlytics();
                Iterator it2 = c13437l.license().iterator();
                while (it2.hasNext()) {
                    c4853lCrashlytics.add(((InterfaceC10696l) it2.next()).isPro(c2201l));
                }
                Mo1004l.f26369l = c4853lCrashlytics;
            }
            if (c13437l.mo1492synchronized() && (function0 = c13437l.f26370l) != null) {
                Mo1004l.m3645l(c13437l.f26360l, function0);
            }
            return Mo1004l;
        }
        return null;
    }
}
