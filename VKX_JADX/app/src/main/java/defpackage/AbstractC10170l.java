package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًَۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10170l extends AbstractC11832l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2278l f20696l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2278l f20697l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3498l f20698l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2278l f20699l;

    public AbstractC10170l(C16412l c16412l, C3498l c3498l) {
        int i = 0;
        if (c16412l == null) {
            advert(0);
            throw null;
        }
        int i2 = 1;
        if (c3498l == null) {
            advert(1);
            throw null;
        }
        this.f20698l = c3498l;
        this.f20697l = new C2278l(c16412l, new C1515l(this, i));
        this.f20696l = new C2278l(c16412l, new C1515l(this, i2));
        this.f20699l = new C2278l(c16412l, new C1515l(this, 2));
    }

    public static /* synthetic */ void advert(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC17477l, defpackage.InterfaceC15234l
    public final AbstractC15211l ad() {
        AbstractC15211l abstractC15211l = (AbstractC15211l) this.f20697l.invoke();
        if (abstractC15211l != null) {
            return abstractC15211l;
        }
        advert(20);
        throw null;
    }

    @Override // defpackage.InterfaceC10900l
    /* JADX INFO: renamed from: appmetrica, reason: merged with bridge method [inline-methods] */
    public InterfaceC17477l isPro(C2201l c2201l) {
        if (c2201l != null) {
            return c2201l.yandex.purchase() ? this : new C14525l(this, c2201l);
        }
        advert(18);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    public final C3498l getName() {
        C3498l c3498l = this.f20698l;
        if (c3498l != null) {
            return c3498l;
        }
        advert(2);
        throw null;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.license(this, obj);
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final InterfaceC7637l mo2889instanceof(AbstractC10794l abstractC10794l) {
        AbstractC3759l.admob(AbstractC11125l.crashlytics(this));
        InterfaceC7637l interfaceC7637lMopub = mopub(abstractC10794l, C14945l.amazon);
        if (interfaceC7637lMopub != null) {
            return interfaceC7637lMopub;
        }
        advert(16);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘؓؖ, reason: contains not printable characters */
    public InterfaceC7637l mo2890l() {
        AbstractC3759l.admob(AbstractC11125l.crashlytics(this));
        InterfaceC7637l interfaceC7637lPro = pro(C14945l.amazon);
        if (interfaceC7637lPro != null) {
            return interfaceC7637lPro;
        }
        advert(17);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؗۨؑ, reason: contains not printable characters */
    public List mo2891l() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        advert(6);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final C7073l mo2892l() {
        C7073l c7073l = (C7073l) this.f20699l.invoke();
        if (c7073l != null) {
            return c7073l;
        }
        advert(5);
        throw null;
    }

    @Override // defpackage.InterfaceC17477l
    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public InterfaceC7637l mo2893l() {
        InterfaceC7637l interfaceC7637l = (InterfaceC7637l) this.f20696l.invoke();
        if (interfaceC7637l != null) {
            return interfaceC7637l;
        }
        advert(4);
        throw null;
    }

    @Override // defpackage.AbstractC11832l
    public InterfaceC7637l mopub(AbstractC10794l abstractC10794l, C14945l c14945l) {
        if (!abstractC10794l.purchase()) {
            return new C17650l(pro(c14945l), new C2201l(abstractC10794l));
        }
        InterfaceC7637l interfaceC7637lPro = pro(c14945l);
        if (interfaceC7637lPro != null) {
            return interfaceC7637lPro;
        }
        advert(12);
        throw null;
    }

    @Override // defpackage.AbstractC11832l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC8371l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC11832l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC17477l mo864l() {
        return this;
    }

    @Override // defpackage.AbstractC11832l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC15234l mo864l() {
        return this;
    }
}
