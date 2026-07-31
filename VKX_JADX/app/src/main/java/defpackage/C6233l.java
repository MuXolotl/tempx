package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙؔ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6233l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4530l f13164l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13165l;

    public /* synthetic */ C6233l(C4530l c4530l, int i) {
        this.f13165l = i;
        this.f13164l = c4530l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        String strAmazon;
        int i2;
        int i3 = this.f13165l;
        C4530l c4530l = this.f13164l;
        switch (i3) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    EnumC11781l enumC11781l = c4530l.yandex;
                    switch (enumC11781l != null ? AbstractC5741l.yandex[enumC11781l.ordinal()] : -1) {
                        case 1:
                            i = R.string.auth2_method_sms_method_title;
                            break;
                        case 2:
                            i = R.string.auth2_method_push_method_title;
                            break;
                        case 3:
                            i = R.string.auth2_method_email_method_title;
                            break;
                        case 4:
                            i = R.string.auth2_method_codegen_method_title;
                            break;
                        case 5:
                            i = R.string.auth2_method_callreset_method_title;
                            break;
                        case 6:
                            i = R.string.auth2_password_method_title;
                            break;
                        default:
                            i = R.string.auth2_method_reserve_method_title;
                            break;
                    }
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    EnumC11781l enumC11781l2 = c4530l.yandex;
                    String str = c4530l.amazon;
                    if (str == null) {
                        str = "";
                    }
                    switch (enumC11781l2 != null ? AbstractC5741l.yandex[enumC11781l2.ordinal()] : -1) {
                        case 1:
                        case 2:
                        case 3:
                            c6956l2.m2123default(-2128981090);
                            strAmazon = AbstractC11999l.amazon(R.string.auth2_method_with_info, new Object[]{str}, c6956l2);
                            c6956l2.startapp(false);
                            break;
                        case 4:
                            strAmazon = AbstractC12900l.mopub(c6956l2, 1455334387, R.string.auth2_method_codegen_method_desc, c6956l2, false);
                            break;
                        case 5:
                            strAmazon = AbstractC12900l.mopub(c6956l2, 1455330837, R.string.auth2_method_callreset_method_desc, c6956l2, false);
                            break;
                        case 6:
                            strAmazon = AbstractC12900l.mopub(c6956l2, 1455337901, R.string.auth2_password_method_desc, c6956l2, false);
                            break;
                        default:
                            strAmazon = AbstractC12900l.mopub(c6956l2, 1455346643, R.string.auth2_method_reserve_method_desc, c6956l2, false);
                            break;
                    }
                    AbstractC13010l.loadAd(strAmazon, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    EnumC11781l enumC11781l3 = c4530l.yandex;
                    switch (enumC11781l3 != null ? AbstractC5741l.yandex[enumC11781l3.ordinal()] : -1) {
                        case 1:
                            i2 = R.drawable.ic_message_outline_28;
                            break;
                        case 2:
                            i2 = R.drawable.ic_smartphone_outline_28;
                            break;
                        case 3:
                            i2 = R.drawable.ic_mail_outline_28;
                            break;
                        case 4:
                            i2 = R.drawable.ic_pincode_lock_outline_28;
                            break;
                        case 5:
                            i2 = R.drawable.ic_phone_outline_28;
                            break;
                        case 6:
                            i2 = R.drawable.key_outline_28;
                            break;
                        default:
                            i2 = R.drawable.ic_article_outline_28;
                            break;
                    }
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(i2, 0, c6956l3), null, null, 0L, c6956l3, 56, 12);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
