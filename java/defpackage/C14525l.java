package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٓۤٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14525l extends AbstractC11832l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C2201l f28424l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2201l f28425l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC11832l f28426l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ArrayList f28427l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ArrayList f28428l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C2868l f28429l;

    public C14525l(AbstractC11832l abstractC11832l, C2201l c2201l) {
        this.f28426l = abstractC11832l;
        this.f28425l = c2201l;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void advert(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[1] = "getContextReceivers";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getConstructors";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[1] = "substitute";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[1] = "getKind";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[1] = "getModality";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[1] = "getVisibility";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        InterfaceC8371l interfaceC8371lSignature = this.f28426l.Signature();
        if (interfaceC8371lSignature != null) {
            return interfaceC8371lSignature;
        }
        advert(22);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC15234l
    public final AbstractC15211l ad() {
        C16017l c16017lAds;
        List listAmazon = AbstractC12008l.amazon(metrica().getParameters());
        InterfaceC3841l annotations = getAnnotations();
        if (annotations.isEmpty()) {
            C16017l.f31395l.getClass();
            c16017lAds = C16017l.f31394l;
        } else {
            C13645l c13645l = C16017l.f31395l;
            List listSingletonList = Collections.singletonList(new C7687l(annotations));
            c13645l.getClass();
            c16017lAds = C13645l.ads(listSingletonList);
        }
        return AbstractC3605l.subscription(mo2890l(), c16017lAds, metrica(), listAmazon, false);
    }

    @Override // defpackage.InterfaceC17477l
    public final Collection adcel() {
        Collection<C5786l> collectionAdcel = this.f28426l.adcel();
        ArrayList arrayList = new ArrayList(collectionAdcel.size());
        for (C5786l c5786l : collectionAdcel) {
            C5786l c5786l2 = c5786l;
            c5786l2.getClass();
            C18220l c18220lM2898l = c5786l2.m2898l(C2201l.loadAd);
            c18220lM2898l.f35682l = c5786l.mo864l();
            C5786l c5786l3 = c5786l;
            c18220lM2898l.isVip(c5786l3.startapp());
            c18220lM2898l.remoteconfig(c5786l3.admob());
            c18220lM2898l.amazon(c5786l3.mo367while());
            c18220lM2898l.f35668l = false;
            arrayList.add(((C5786l) c18220lM2898l.f35675l.mo768l(c18220lM2898l)).isPro(appmetrica()));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l, defpackage.InterfaceC10389l
    public final C6561l admob() {
        C6561l c6561lAdmob = this.f28426l.admob();
        if (c6561lAdmob != null) {
            return c6561lAdmob;
        }
        advert(27);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean ads() {
        return this.f28426l.ads();
    }

    public final C2201l appmetrica() {
        if (this.f28424l == null) {
            C2201l c2201l = this.f28425l;
            if (c2201l.yandex.purchase()) {
                this.f28424l = c2201l;
            } else {
                List parameters = this.f28426l.metrica().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.f28428l = arrayList;
                this.f28424l = AbstractC6363l.subs(parameters, c2201l.yandex, this, arrayList);
                ArrayList arrayList2 = this.f28428l;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((InterfaceC16902l) obj).mo2181l()) {
                        arrayList3.add(obj);
                    }
                }
                this.f28427l = arrayList3;
            }
        }
        return this.f28424l;
    }

    @Override // defpackage.InterfaceC10233l
    public final InterfaceC5706l billing() {
        return InterfaceC5706l.f12087l;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return this.f28426l.mo750case();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: final */
    public final C5786l mo751final() {
        return this.f28426l.mo751final();
    }

    @Override // defpackage.InterfaceC2853l
    public final InterfaceC3841l getAnnotations() {
        InterfaceC3841l annotations = this.f28426l.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        advert(19);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    public final C3498l getName() {
        C3498l name = this.f28426l.getName();
        if (name != null) {
            return name;
        }
        advert(20);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.license(this, obj);
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: instanceof */
    public final InterfaceC7637l mo2889instanceof(AbstractC10794l abstractC10794l) {
        AbstractC3759l.admob(AbstractC11125l.crashlytics(this));
        return mopub(abstractC10794l, C14945l.amazon);
    }

    @Override // defpackage.InterfaceC10900l
    public final InterfaceC10233l isPro(C2201l c2201l) {
        if (c2201l != null) {
            AbstractC10794l abstractC10794l = c2201l.yandex;
            return abstractC10794l.purchase() ? this : new C14525l(this, C2201l.purchase(abstractC10794l, appmetrica().yandex));
        }
        advert(23);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC10607l
    public final List isVip() {
        appmetrica();
        ArrayList arrayList = this.f28427l;
        if (arrayList != null) {
            return arrayList;
        }
        advert(30);
        throw null;
    }

    @Override // defpackage.AbstractC11832l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC17477l mo864l() {
        InterfaceC17477l interfaceC17477lMo864l = this.f28426l.mo864l();
        if (interfaceC17477lMo864l != null) {
            return interfaceC17477lMo864l;
        }
        advert(21);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final InterfaceC7637l mo2890l() {
        AbstractC3759l.admob(AbstractC11125l.crashlytics(this.f28426l));
        return pro(C14945l.amazon);
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final int mo752l() {
        int iMo752l = this.f28426l.mo752l();
        if (iMo752l != 0) {
            return iMo752l;
        }
        advert(25);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؗۨؑ */
    public final List mo2891l() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        advert(17);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘِٞ */
    public final AbstractC5645l mo753l() {
        AbstractC5645l abstractC5645lMo753l = this.f28426l.mo753l();
        if (abstractC5645lMo753l == null) {
            return null;
        }
        boolean z = abstractC5645lMo753l instanceof C6065l;
        C2201l c2201l = this.f28425l;
        if (z) {
            C6065l c6065l = (C6065l) abstractC5645lMo753l;
            C3498l c3498l = c6065l.yandex;
            AbstractC15211l abstractC15211l = (AbstractC15211l) c6065l.loadAd;
            if (abstractC15211l != null && !c2201l.yandex.purchase()) {
                abstractC15211l = (AbstractC15211l) appmetrica().admob(1, abstractC15211l);
            }
            return new C6065l(c3498l, abstractC15211l);
        }
        if (!(abstractC5645lMo753l instanceof C6682l)) {
            C18725l.billing();
            return null;
        }
        ArrayList<C8195l> arrayList = ((C6682l) abstractC5645lMo753l).yandex;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        for (C8195l c8195l : arrayList) {
            C3498l c3498l2 = (C3498l) c8195l.f17098l;
            AbstractC15211l abstractC15211l2 = (AbstractC15211l) ((InterfaceC0583l) c8195l.f17097l);
            if (abstractC15211l2 != null && !c2201l.yandex.purchase()) {
                abstractC15211l2 = (AbstractC15211l) appmetrica().admob(1, abstractC15211l2);
            }
            arrayList2.add(new C8195l(c3498l2, abstractC15211l2));
        }
        return new C6682l(arrayList2);
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘۛؕ */
    public final C7073l mo2892l() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘْؒ */
    public final InterfaceC7637l mo2893l() {
        InterfaceC7637l interfaceC7637lMo2893l = this.f28426l.mo2893l();
        if (interfaceC7637lMo2893l != null) {
            return interfaceC7637lMo2893l;
        }
        advert(28);
        throw null;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return this.f28426l.mo754l();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lْٗٔ */
    public final boolean mo755l() {
        return this.f28426l.mo755l();
    }

    @Override // defpackage.InterfaceC15234l
    public final InterfaceC1925l metrica() {
        InterfaceC1925l interfaceC1925lMetrica = this.f28426l.metrica();
        if (this.f28425l.yandex.purchase()) {
            if (interfaceC1925lMetrica != null) {
                return interfaceC1925lMetrica;
            }
            advert(0);
            throw null;
        }
        if (this.f28429l == null) {
            C2201l c2201lAppmetrica = appmetrica();
            Collection collectionYandex = interfaceC1925lMetrica.yandex();
            ArrayList arrayList = new ArrayList(collectionYandex.size());
            Iterator it = collectionYandex.iterator();
            while (it.hasNext()) {
                arrayList.add(c2201lAppmetrica.admob(1, (AbstractC18041l) it.next()));
            }
            this.f28429l = new C2868l(this, this.f28428l, arrayList, C16412l.purchase);
        }
        C2868l c2868l = this.f28429l;
        if (c2868l != null) {
            return c2868l;
        }
        advert(1);
        throw null;
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l mopub(AbstractC10794l abstractC10794l, C14945l c14945l) {
        InterfaceC7637l interfaceC7637lMopub = this.f28426l.mopub(abstractC10794l, c14945l);
        if (!this.f28425l.yandex.purchase()) {
            return new C17650l(interfaceC7637lMopub, appmetrica());
        }
        if (interfaceC7637lMopub != null) {
            return interfaceC7637lMopub;
        }
        advert(7);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: new */
    public final InterfaceC7637l mo756new() {
        InterfaceC7637l interfaceC7637lMo756new = this.f28426l.mo756new();
        if (interfaceC7637lMo756new != null) {
            return interfaceC7637lMo756new;
        }
        advert(15);
        throw null;
    }

    @Override // defpackage.AbstractC11832l
    public final InterfaceC7637l pro(C14945l c14945l) {
        InterfaceC7637l interfaceC7637lPro = this.f28426l.pro(c14945l);
        if (!this.f28425l.yandex.purchase()) {
            return new C17650l(interfaceC7637lPro, appmetrica());
        }
        if (interfaceC7637lPro != null) {
            return interfaceC7637lPro;
        }
        advert(14);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    public final boolean purchase() {
        return this.f28426l.purchase();
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC5436l
    public final int startapp() {
        int iStartapp = this.f28426l.startapp();
        if (iStartapp != 0) {
            return iStartapp;
        }
        advert(26);
        throw null;
    }

    @Override // defpackage.InterfaceC10607l
    public final boolean subscription() {
        return this.f28426l.subscription();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: throws */
    public final boolean mo757throws() {
        return this.f28426l.mo757throws();
    }

    @Override // defpackage.InterfaceC5436l
    public final boolean vip() {
        return this.f28426l.vip();
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: volatile */
    public final boolean mo758volatile() {
        return this.f28426l.mo758volatile();
    }
}
