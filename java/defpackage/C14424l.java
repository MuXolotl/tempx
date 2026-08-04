package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٓۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14424l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C9879l f28238l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28239l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f28240l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14424l(C9879l c9879l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f28239l = i;
        this.f28238l = c9879l;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        String str;
        int i = this.f28239l;
        C9879l c9879l = this.f28238l;
        Object obj2 = this.f28240l;
        switch (i) {
            case 0:
                C11134l c11134l = (C11134l) obj2;
                AbstractC2829l.crashlytics(obj);
                C14267l c14267lFirebase = c9879l.firebase();
                String strCrashlytics = c11134l.yandex.crashlytics();
                InterfaceC17817l interfaceC17817l = c11134l.yandex;
                boolean z = (interfaceC17817l instanceof C7839l) || (interfaceC17817l instanceof C1407l);
                boolean z2 = interfaceC17817l instanceof InterfaceC2841l;
                boolean z3 = interfaceC17817l instanceof C3086l;
                C3086l c3086l = z3 ? (C3086l) interfaceC17817l : null;
                String str2 = c3086l != null ? c3086l.yandex : null;
                C3086l c3086l2 = z3 ? (C3086l) interfaceC17817l : null;
                c9879l.metrica(C14267l.yandex(c14267lFirebase, null, 0, null, strCrashlytics, null, false, false, z, false, z2, str2, AbstractC8576l.yandex(c3086l2 != null ? c3086l2.yandex : null, "common"), false, 0, 0, 29047));
                return Unit.INSTANCE;
            case 1:
                InterfaceC15432l interfaceC15432l = (InterfaceC15432l) obj2;
                AbstractC2829l.crashlytics(obj);
                AbstractC18643l abstractC18643l = c9879l.isPro().loadAd;
                AudioTrack audioTrack = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
                if (audioTrack == null) {
                    return Unit.INSTANCE;
                }
                if (audioTrack.loadAd == interfaceC15432l.yandex() && audioTrack.crashlytics == interfaceC15432l.loadAd()) {
                    Boolean bool = c9879l.firebase().yandex.billing;
                    Boolean bool2 = c9879l.firebase().yandex.mopub;
                    if (interfaceC15432l instanceof C18393l) {
                        bool = Boolean.TRUE;
                    } else if (interfaceC15432l instanceof C15553l) {
                        bool = Boolean.FALSE;
                    } else if (interfaceC15432l instanceof C15442l) {
                        bool2 = Boolean.TRUE;
                    } else {
                        if (!(interfaceC15432l instanceof C15085l)) {
                            C18725l.billing();
                            return null;
                        }
                        bool2 = Boolean.FALSE;
                    }
                    c9879l.metrica(C14267l.yandex(c9879l.firebase(), C14974l.yandex(c9879l.firebase().yandex, bool, bool2, 31), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                }
                return Unit.INSTANCE;
            case 2:
                C6946l c6946l = (C6946l) obj2;
                AbstractC2829l.crashlytics(obj);
                C14267l c14267lFirebase2 = c9879l.firebase();
                int i2 = c6946l.yandex;
                int i3 = i2 < 0 ? 0 : i2;
                int i4 = c6946l.loadAd;
                c9879l.metrica(C14267l.yandex(c14267lFirebase2, null, 0, null, null, null, false, false, false, false, false, null, false, false, i3, i4 < 1 ? 1 : i4, 8191));
                return Unit.INSTANCE;
            case 3:
                C14759l c14759l = (C14759l) obj2;
                AbstractC2829l.crashlytics(obj);
                int iOrdinal = c14759l.yandex.ordinal();
                if (iOrdinal != 0) {
                    EnumC15095l enumC15095l = EnumC15095l.f29628l;
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        C18725l.billing();
                        return null;
                    }
                    c9879l.vip(enumC15095l);
                } else {
                    c9879l.vip(EnumC15095l.f29627l);
                    c9879l.vip.subs(1.0f);
                    C13530l c13530l = c9879l.yandex.f36642l;
                    AppActivity appActivity = c13530l.yandex;
                    CustomBottomSheetBehavior customBottomSheetBehavior = c13530l.amazon;
                    if (customBottomSheetBehavior != null && customBottomSheetBehavior.f645private == 3) {
                        customBottomSheetBehavior.premium(true);
                        CustomBottomSheetBehavior customBottomSheetBehavior2 = c13530l.amazon;
                        if (customBottomSheetBehavior2 == null) {
                            customBottomSheetBehavior2 = null;
                        }
                        customBottomSheetBehavior2.appmetrica(5);
                    }
                    ((ViewGroup.MarginLayoutParams) ((LinearLayout) appActivity.f36640l.f15739l).getLayoutParams()).bottomMargin = 0;
                    ((LinearLayout) appActivity.f36640l.f15739l).requestLayout();
                }
                C14267l c14267lFirebase3 = c9879l.firebase();
                EnumC11447l enumC11447l = c14759l.yandex;
                boolean z4 = c14759l.loadAd;
                C16076l c16076l = VKXApplication.f36632l;
                C16076l c16076l2 = c16076l != null ? c16076l : null;
                c16076l2.getClass();
                c9879l.metrica(C14267l.yandex(c14267lFirebase3, null, 0, enumC11447l, null, (EnumC12501l) c16076l2.admob(new C18606l(c16076l2, 6)), false, z4, false, false, false, null, false, false, 0, 0, 32683));
                return Unit.INSTANCE;
            case 4:
                AbstractC2829l.crashlytics(obj);
                C1100l c1100l = ((C5075l) obj2).yandex;
                long j = c1100l.crashlytics;
                c9879l.subs.setValue(new C0217l((int) (j / 1000), (int) (c1100l.yandex / 1000), c1100l.purchase, c1100l.amazon, Math.abs(((int) (j / 1000)) - c9879l.subs().yandex) >= 1500));
                return Unit.INSTANCE;
            case 5:
                C1725l c1725l = (C1725l) obj2;
                AbstractC2829l.crashlytics(obj);
                C10086l c10086l = c9879l.purchase;
                C10086l c10086l2 = c9879l.isPro;
                if (((C10235l) c10086l.getValue()) != null) {
                    c9879l.purchase.setValue(null);
                    c9879l.yandex.f36642l.amazon(false);
                }
                C10507l c10507l = c1725l.yandex;
                AbstractC18643l abstractC18643l2 = c1725l.loadAd;
                C9879l.billing(c9879l, c10507l.loadAd);
                AbstractC18643l abstractC18643l3 = c10507l.loadAd;
                AbstractC18643l abstractC18643l4 = c10507l.loadAd;
                String str3 = c10507l.yandex;
                c9879l.admob.setValue(new C3981l(abstractC18643l2 != null ? 1 : 0, AbstractC8669l.m2420volatile(new AbstractC18643l[]{abstractC18643l2, abstractC18643l3, c1725l.crashlytics})));
                if (!c9879l.isPro().yandex.equals(str3)) {
                    c9879l.mopub.setValue(c10507l);
                    C14267l c14267lFirebase4 = c9879l.firebase();
                    String loadAd = abstractC18643l4.getLoadAd();
                    AudioTrack audioTrack2 = abstractC18643l4 instanceof AudioTrack ? (AudioTrack) abstractC18643l4 : null;
                    if (audioTrack2 != null) {
                        String strLicense = audioTrack2.license();
                        if (strLicense.length() > 0) {
                            str = strLicense;
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    String yandex = abstractC18643l4.getCrashlytics();
                    InterfaceC16858l interfaceC16858l = abstractC18643l4 instanceof InterfaceC16858l ? (InterfaceC16858l) abstractC18643l4 : null;
                    boolean z5 = interfaceC16858l != null && interfaceC16858l.getMetrica();
                    InterfaceC9764l interfaceC9764l = abstractC18643l4 instanceof InterfaceC9764l ? (InterfaceC9764l) abstractC18643l4 : null;
                    Boolean boolValueOf = interfaceC9764l != null ? Boolean.valueOf(interfaceC9764l.getSmaato()) : null;
                    InterfaceC10594l interfaceC10594l = abstractC18643l4 instanceof InterfaceC10594l ? (InterfaceC10594l) abstractC18643l4 : null;
                    c9879l.metrica(C14267l.yandex(c14267lFirebase4, new C14974l(str3, loadAd, str, yandex, z5, boolValueOf, interfaceC10594l != null ? Boolean.valueOf(interfaceC10594l.getRemoteconfig()) : null), c1725l.amazon, null, null, null, false, false, false, AbstractC1214l.loadAd(abstractC18643l4), false, null, false, false, 0, 0, 32508));
                    c9879l.subs.setValue(C0217l.yandex(c9879l.subs(), 0, 0.0f));
                    c10086l2.setValue(new C6678l(((C6678l) c10086l2.getValue()).yandex, c1725l.amazon));
                }
                return Unit.INSTANCE;
            case 6:
                AbstractC2829l.crashlytics(obj);
                c9879l.metrica(C14267l.yandex(c9879l.firebase(), null, 0, null, null, ((C7106l) obj2).yandex, false, false, false, false, false, null, false, false, 0, 0, 32751));
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                c9879l.metrica(C14267l.yandex(c9879l.firebase(), null, 0, null, null, null, ((C12879l) obj2).yandex, false, false, false, false, null, false, false, 0, 0, 28639));
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f28239l) {
            case 0:
                C14424l c14424l = new C14424l(this.f28238l, interfaceC14029l, 0);
                c14424l.f28240l = obj;
                return c14424l;
            case 1:
                C14424l c14424l2 = new C14424l(this.f28238l, interfaceC14029l, 1);
                c14424l2.f28240l = obj;
                return c14424l2;
            case 2:
                C14424l c14424l3 = new C14424l(this.f28238l, interfaceC14029l, 2);
                c14424l3.f28240l = obj;
                return c14424l3;
            case 3:
                C14424l c14424l4 = new C14424l(this.f28238l, interfaceC14029l, 3);
                c14424l4.f28240l = obj;
                return c14424l4;
            case 4:
                C14424l c14424l5 = new C14424l(this.f28238l, interfaceC14029l, 4);
                c14424l5.f28240l = obj;
                return c14424l5;
            case 5:
                C14424l c14424l6 = new C14424l(this.f28238l, interfaceC14029l, 5);
                c14424l6.f28240l = obj;
                return c14424l6;
            case 6:
                C14424l c14424l7 = new C14424l(this.f28238l, interfaceC14029l, 6);
                c14424l7.f28240l = obj;
                return c14424l7;
            default:
                C14424l c14424l8 = new C14424l(this.f28238l, interfaceC14029l, 7);
                c14424l8.f28240l = obj;
                return c14424l8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28239l) {
            case 0:
                return ((C14424l) ads((InterfaceC14029l) obj2, (C11134l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C14424l) ads((InterfaceC14029l) obj2, (InterfaceC15432l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C14424l) ads((InterfaceC14029l) obj2, (C6946l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C14424l) ads((InterfaceC14029l) obj2, (C14759l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C14424l) ads((InterfaceC14029l) obj2, (C5075l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C14424l) ads((InterfaceC14029l) obj2, (C1725l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C14424l) ads((InterfaceC14029l) obj2, (C7106l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C14424l) ads((InterfaceC14029l) obj2, (C12879l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
