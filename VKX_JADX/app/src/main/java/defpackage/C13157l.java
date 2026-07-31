package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘؘْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13157l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f25768l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f25769l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f25770l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f25771l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C8688l f25772l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f25773l;

    public C13157l() {
        super(0);
        this.f25772l = new C8688l(new C4217l(this, 11));
        this.f25773l = AbstractC8020l.smaato(AbstractC8619l.remoteconfig.yandex());
        this.f25771l = AbstractC8020l.smaato(AbstractC8619l.vip.yandex());
        this.f25770l = AbstractC8020l.smaato(AbstractC8619l.metrica.yandex());
        Boolean bool = Boolean.FALSE;
        this.f25769l = AbstractC8020l.smaato(bool);
        this.f25768l = AbstractC8020l.smaato(bool);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m3571abstract(final int i, final int i2, final int i3, final boolean z, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i4) {
        c6956l.m2133new(1956729039);
        int i5 = i4 | (c6956l.amazon(i) ? 4 : 2) | (c6956l.amazon(i2) ? 32 : 16) | (c6956l.amazon(i3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192);
        byte b = 0;
        if (c6956l.m2127for(i5 & 1, (i5 & 8339) != 8338)) {
            int i6 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC14566l.amazon(-1724606415, new C4314l(i2, 3, b), c6956l), interfaceC17242l, null, AbstractC14566l.amazon(-815944242, new C4314l(i3, 4, b), c6956l), AbstractC14566l.amazon(-513056851, new C4314l(i, 5, b), c6956l), null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510), c6956l, ((i5 >> 9) & 112) | 27654, 420);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i, i2, i3, z, interfaceC17242l, i4) { // from class: lؙؑؔ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ int f1057l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ int f1058l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ boolean f1060l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ int f1061l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f1062l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    this.f1059l.m3571abstract(this.f1058l, this.f1057l, this.f1061l, this.f1060l, this.f1062l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m3572import(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(446617176);
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            AbstractC11028l.loadAd(AbstractC4072l.vip, AbstractC4072l.metrica, interfaceC17242l, c6956l, 438);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(this, interfaceC17242l, i, 12);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m3573instanceof(EnumC4948l enumC4948l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1894096974);
        int i2 = (c6956l.amazon(enumC4948l.ordinal()) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC17122l.purchase(interfaceC17242l, 0.0f, AbstractC14566l.amazon(211390215, new C7442l(enumC4948l, this, 7), c6956l), c6956l, ((i2 >> 3) & 14) | 384);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) this, (Object) enumC4948l, interfaceC17242l, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        List listRemoteconfig;
        C5073l c5073l;
        ?? r1;
        C13863l c13863l;
        C6956l c6956l2;
        int i2;
        C6956l c6956l3;
        C6956l c6956l4 = c6956l;
        c6956l4.m2133new(1663329021);
        int i3 = 2;
        int i4 = i | (c6956l4.admob(this) ? 4 : 2);
        byte b = 0;
        int i5 = 1;
        if (c6956l4.m2127for(i4 & 1, (i4 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l4);
            InterfaceC15829l interfaceC15829l = (InterfaceC15829l) this.f25772l.getValue();
            Object objM2132native = c6956l4.m2132native();
            C13863l c13863l2 = C1867l.yandex;
            if (objM2132native == c13863l2) {
                objM2132native = new C13206l(25);
                c6956l4.m2147try(objM2132native);
            }
            Function1 function1 = (Function1) objM2132native;
            Object objM2132native2 = c6956l4.m2132native();
            int i6 = 3;
            if (objM2132native2 == c13863l2) {
                objM2132native2 = new C17095l(i6, (InterfaceC14029l) null, b);
                c6956l4.m2147try(objM2132native2);
            }
            C18454l c18454l = C18454l.f36052l;
            C5073l c5073lCrashlytics = AbstractC8265l.crashlytics(interfaceC15829l, function1, (Function3) objM2132native2, C18454l.purchase(), c6956l4, 48);
            C10086l c10086l = this.f25771l;
            boolean zAmazon = c6956l4.amazon(((EnumC4948l) c10086l.getValue()).ordinal());
            Object objM2132native3 = c6956l4.m2132native();
            if (zAmazon || objM2132native3 == c13863l2) {
                int iOrdinal = ((EnumC4948l) c10086l.getValue()).ordinal();
                if (iOrdinal == 0) {
                    listRemoteconfig = AbstractC14055l.remoteconfig(new C9872l(R.drawable.ic_headphones_wave_outline_28, R.string.eq3_section_equalizer, R.string.eq3_section_equalizer_description, new C4217l(this, b), new C13206l(27)), new C9872l(R.drawable.ic_wrench_outline_28, R.string.eq3_section_compressor, R.string.eq3_section_compressor_description, new C4217l(this, 15), new C13206l(28)), new C9872l(R.drawable.ic_sound_wave_slash_outline_28, R.string.eq3_section_limiter, R.string.eq3_section_limiter_description, new C4217l(this, 16), new C13206l(29)), new C9872l(R.drawable.ic_volume_outline_28, R.string.eq3_section_balancer, R.string.eq3_section_balancer_description, new C4217l(this, i5), new C13206l(22)), new C9872l(R.drawable.ic_add_square_outline_28, R.string.eq3_section_legacy_bass_boost, R.string.eq3_section_legacy_bass_boost_description, new C4217l(this, i3), new C13206l(23)), new C9872l(R.drawable.ic_add_square_outline_28, R.string.eq3_section_legacy_preset_reverb, R.string.eq3_section_legacy_preset_reverb_description, new C4217l(this, 6), new C13206l(24)));
                } else {
                    if (iOrdinal != 1) {
                        C18725l.billing();
                        return;
                    }
                    listRemoteconfig = Collections.singletonList(new C9872l(R.drawable.ic_link_outline_28, R.string.eq3_section_system, R.string.eq3_section_system_description, new C4217l(this, 12), new C13206l(26)));
                }
                objM2132native3 = listRemoteconfig;
                c6956l4.m2147try(objM2132native3);
            }
            List list = (List) objM2132native3;
            int i7 = 13;
            if (((Boolean) this.f25769l.getValue()).booleanValue()) {
                c6956l4.m2123default(1197764094);
                boolean zAdmob = c6956l4.admob(this);
                Object objM2132native4 = c6956l4.m2132native();
                if (zAdmob || objM2132native4 == c13863l2) {
                    objM2132native4 = new C4217l(this, i7);
                    c6956l4.m2147try(objM2132native4);
                }
                c13863l = c13863l2;
                c5073l = c5073lCrashlytics;
                r1 = 0;
                AbstractC16291l.yandex((Function0) objM2132native4, AbstractC14566l.amazon(1931127184, new C6041l(this, i3, b), c6956l4), null, AbstractC14566l.amazon(-264101682, new C6041l(this, i6, b), c6956l4), null, AbstractC4072l.crashlytics, AbstractC4072l.amazon, null, 0L, 0L, 0L, 0L, null, c6956l, 1772592, 0, 16276);
                c6956l2 = c6956l;
            } else {
                c5073l = c5073lCrashlytics;
                r1 = 0;
                c13863l = c13863l2;
                c6956l4.m2123default(1192005317);
                c6956l2 = c6956l4;
            }
            c6956l2.startapp(r1);
            int i8 = 14;
            if (((Boolean) this.f25768l.getValue()).booleanValue()) {
                c6956l2.m2123default(1198781018);
                boolean zAdmob2 = c6956l2.admob(this);
                Object objM2132native5 = c6956l2.m2132native();
                if (zAdmob2 || objM2132native5 == c13863l) {
                    objM2132native5 = new C4217l(this, i8);
                    c6956l2.m2147try(objM2132native5);
                }
                C5073l c5073l2 = c5073l;
                c5073l = c5073l2;
                i2 = 14;
                AbstractC16291l.yandex((Function0) objM2132native5, AbstractC14566l.amazon(-1017733497, new C6041l(this, 4, r1), c6956l2), null, AbstractC14566l.amazon(-1803731387, new Cpublic(this, c5073l2, 13), c6956l2), null, AbstractC4072l.mopub, AbstractC4072l.admob, null, 0L, 0L, 0L, 0L, null, c6956l, 1772592, 0, 16276);
                c6956l3 = c6956l;
            } else {
                i2 = 14;
                c6956l2.m2123default(1192005317);
                c6956l3 = c6956l2;
            }
            c6956l3.startapp(r1);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1649326017, new Cpublic(c13072lYandex, this, i2), c6956l3), null, null, null, 0, 0L, 0L, ((C15700l) c6956l3.isPro(AbstractC18678l.yandex)).amazon(c6956l3), AbstractC14566l.amazon(1725535884, new C11223l(c13072lYandex, this, list, c5073l, 4), c6956l3), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6041l(this, i);
        }
    }
}
