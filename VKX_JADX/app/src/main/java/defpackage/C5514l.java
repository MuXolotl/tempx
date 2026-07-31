package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘؙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5514l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f11781l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f11782l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11783l;

    public /* synthetic */ C5514l(C4487l c4487l, C15012l c15012l, C18196l c18196l) {
        this.f11783l = 4;
        this.f11782l = c15012l;
        this.f11781l = c18196l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        C11224l c11224lAmazon;
        C17812l c17812l;
        C3625l c3625l;
        C15263l c15263l;
        String str;
        int iM3321extends;
        int i = this.f11783l;
        int i2 = 4;
        int i3 = 2;
        int i4 = 0;
        Object obj = this.f11781l;
        Object obj2 = this.f11782l;
        switch (i) {
            case 0:
                AbstractC5941l.m1889for((Context) obj2, (TextClassification) obj);
                return Unit.INSTANCE;
            case 1:
                C10304l c10304l = (C10304l) obj2;
                C9987l c9987l = (C9987l) obj;
                c10304l.f20995l.amazon();
                if (c10304l.f29462l && ((C12771l) ((InterfaceC2229l) AbstractC13402l.loadAd(c10304l, AbstractC4751l.Signature))).loadAd()) {
                    i3 = 1;
                }
                int i5 = c9987l.f20387l;
                int i6 = i3 * i5;
                c9987l.f20387l = i5 * (-1);
                return Integer.valueOf(i6);
            case 2:
                C4240l c4240l = (C4240l) obj;
                if (!((C12217l) obj2).subs) {
                    C12044l c12044l = c4240l.f8684l;
                    if (c12044l.f29462l) {
                        c12044l.f23965l.m2026l(7);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                C16173l c16173l = (C16173l) obj2;
                long j2 = ((C4999l) ((InterfaceC8714l) obj).getValue()).yandex;
                C1187l c1187lSubs = c16173l.subs();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (c1187lSubs != null) {
                    long j3 = c1187lSubs.yandex;
                    C3625l c3625lRemoteconfig = c16173l.remoteconfig();
                    if (c3625lRemoteconfig != null && c3625lRemoteconfig.f7563l.length() != 0) {
                        EnumC1826l enumC1826l = (EnumC1826l) c16173l.adcel.getValue();
                        int i7 = enumC1826l == null ? -1 : AbstractC15487l.yandex[enumC1826l.ordinal()];
                        if (i7 != -1) {
                            if (i7 == 1 || i7 == 2) {
                                long j4 = c16173l.vip().loadAd;
                                int i8 = C12814l.crashlytics;
                                j = j4 >> 32;
                            } else {
                                if (i7 != 3) {
                                    C18725l.billing();
                                    return null;
                                }
                                long j5 = c16173l.vip().loadAd;
                                int i9 = C12814l.crashlytics;
                                j = j5 & 4294967295L;
                            }
                            int i10 = (int) j;
                            C17812l c17812l2 = c16173l.amazon;
                            if (c17812l2 != null && (c11224lAmazon = c17812l2.amazon()) != null && (c17812l = c16173l.amazon) != null && (c3625l = c17812l.yandex.yandex) != null) {
                                int iPurchase = AbstractC8576l.purchase(c16173l.loadAd.admob(i10), 0, c3625l.f7563l.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c11224lAmazon.amazon(j3) >> 32));
                                C0327l c0327l = c11224lAmazon.yandex;
                                C6222l c6222l = c0327l.loadAd;
                                int iAmazon = c6222l.amazon(iPurchase);
                                float fMopub = c0327l.mopub(iAmazon);
                                float fAdmob = c0327l.admob(iAmazon);
                                float fAmazon = AbstractC8576l.amazon(fIntBitsToFloat, Math.min(fMopub, fAdmob), Math.max(fMopub, fAdmob));
                                if (C4999l.loadAd(j2, 0L) || Math.abs(fIntBitsToFloat - fAmazon) <= ((int) (j2 >> 32)) / 2) {
                                    float fBilling = c6222l.billing(iAmazon);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fAmazon)) << 32) | (((long) Float.floatToRawIntBits(((c6222l.loadAd(iAmazon) - fBilling) / 2.0f) + fBilling)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C1187l(jFloatToRawIntBits);
            case 4:
                C18196l c18196l = (C18196l) obj;
                AbstractC12494l abstractC12494l = (AbstractC12494l) ((C15012l) obj2).yandex;
                if (abstractC12494l instanceof C14754l) {
                    C15263l c15263l2 = ((C14754l) abstractC12494l).crashlytics;
                    if (c15263l2 != null) {
                        ((C8250l) c15263l2.f29858l).invoke((MainArtist) c15263l2.f29857l);
                    } else {
                        try {
                            c18196l.yandex(((C14754l) abstractC12494l).yandex);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((abstractC12494l instanceof C7409l) && (c15263l = ((C7409l) abstractC12494l).crashlytics) != null) {
                    ((C8250l) c15263l.f29858l).invoke((MainArtist) c15263l.f29857l);
                }
                return Unit.INSTANCE;
            case 5:
                AbstractC10999l.mopub((InterfaceC2262l) obj2, null, 0, new C17972l(obj, (InterfaceC14029l) (false ? 1 : 0), 29), 3);
                return Unit.INSTANCE;
            case 6:
                C16328l c16328l = (C16328l) obj2;
                InterfaceC1832l interfaceC1832l = (InterfaceC1832l) obj;
                C5667l c5667lLoadAd = c16328l.yandex.loadAd();
                C6644l c6644l = (C6644l) c16328l.purchase.getValue();
                C16535l c16535l = new C16535l((byte) 0, 3);
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                int i11 = 0;
                while (i4 < c5667lLoadAd.f12057l.length()) {
                    int iCodePointAt = Character.codePointAt(c5667lLoadAd, i4);
                    int iYandex = interfaceC1832l.yandex(i11, iCodePointAt);
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (iYandex != iCodePointAt) {
                        c16535l.firebase(sb.length(), sb.length() + iCharCount, Character.charCount(iYandex));
                        z = true;
                    }
                    sb.appendCodePoint(iYandex);
                    i4 += iCharCount;
                    i11++;
                    z = z;
                }
                CharSequence string = z ? sb.toString() : c5667lLoadAd;
                if (string == c5667lLoadAd) {
                    return null;
                }
                long jPurchase = C2183l.purchase(c5667lLoadAd.f12061l, c16535l, c6644l);
                C12814l c12814l = c5667lLoadAd.f12060l;
                return new C0209l(new C5667l(string, jPurchase, c12814l != null ? new C12814l(C2183l.purchase(c12814l.yandex, c16535l, c6644l)) : null, null, null, null, null, 120), c16535l);
            case 7:
                C13550l c13550l = (C13550l) obj2;
                Function1 function1 = (Function1) obj;
                int i12 = c13550l.purchase + 1;
                c13550l.purchase = i12;
                if (i12 > 10) {
                    c13550l.purchase = 0;
                    function1.invoke(2);
                }
                return Unit.INSTANCE;
            case 8:
                Function1 function2 = (Function1) obj2;
                AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
                String str2 = audioStreamMix.yandex;
                AudioStreamMix.Link link = audioStreamMix.amazon;
                if (link == null || (str = link.loadAd) == null) {
                    str = audioStreamMix.loadAd;
                }
                function2.invoke(new C16935l(new C3086l(6, str2, null, str, null)));
                return Unit.INSTANCE;
            case 9:
                ((C5124l) obj2).m1698l((AbstractC0301l) obj);
                return Unit.INSTANCE;
            case 10:
                C2540l c2540l = (C2540l) obj;
                String str3 = c2540l.f5525l;
                if (((ArrayList) obj2).isEmpty() || (iM3321extends = AbstractC12024l.m3321extends(str3, '/', c2540l.f5537l.f33556l.length() + 3, 4)) == -1) {
                    return "";
                }
                int iM3346throw = AbstractC12024l.m3346throw(str3, new char[]{'?', '#'}, iM3321extends, false);
                return iM3346throw == -1 ? str3.substring(iM3321extends) : str3.substring(iM3321extends, iM3346throw);
            case 11:
                EnumC10788l enumC10788l = (EnumC10788l) obj2;
                View view = (View) obj;
                C7206l c7206l = C7206l.yandex;
                boolean zCrashlytics = C7206l.crashlytics(enumC10788l);
                String str4 = enumC10788l.f21812l;
                if (zCrashlytics) {
                    C7206l.amazon = false;
                    c7206l.loadAd();
                } else {
                    Activity activityMopub = C9967l.mopub(view.getContext());
                    if (activityMopub != null) {
                        C7206l.amazon = true;
                        int iYandex2 = AbstractC13209l.yandex(R.attr.global_accent);
                        int i13 = AbstractC14093l.purchase(iYandex2) > 0.5d ? R.color.google_black : R.color.white;
                        C10024l c10024l = new C10024l(activityMopub);
                        c10024l.crashlytics = 0.5f;
                        c10024l.yandex = AbstractC5573l.ads(TypedValue.applyDimension(1, -2.1474836E9f, Resources.getSystem().getDisplayMetrics()));
                        c10024l.amazon = AbstractC5573l.ads(TypedValue.applyDimension(1, -2.1474836E9f, Resources.getSystem().getDisplayMetrics()));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(enumC10788l.f21813l);
                        sb2.append(str4.length() > 0 ? "\n\n".concat(str4) : "");
                        c10024l.subscription = sb2.toString();
                        c10024l.tapsense = activityMopub.getColor(i13);
                        c10024l.Signature = 15.0f;
                        c10024l.license = 8388611;
                        c10024l.f20422class = 2;
                        c10024l.firebase = AbstractC5573l.ads(TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()));
                        c10024l.vip = 0.5f;
                        c10024l.purchase = AbstractC5573l.ads(TypedValue.applyDimension(1, 12.0f, Resources.getSystem().getDisplayMetrics()));
                        c10024l.billing = AbstractC5573l.ads(TypedValue.applyDimension(1, 12.0f, Resources.getSystem().getDisplayMetrics()));
                        c10024l.mopub = AbstractC5573l.ads(TypedValue.applyDimension(1, 12.0f, Resources.getSystem().getDisplayMetrics()));
                        c10024l.admob = AbstractC5573l.ads(TypedValue.applyDimension(1, 12.0f, Resources.getSystem().getDisplayMetrics()));
                        c10024l.ads = TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics());
                        c10024l.adcel = iYandex2;
                        c10024l.f20433static = 5;
                        c10024l.f20439volatile = (AbstractActivityC14666l) activityMopub;
                        c10024l.f20431package = true;
                        c10024l.inmobi = false;
                        c10024l.f20425else = false;
                        c10024l.f20438throws = true;
                        c10024l.advert = true;
                        c10024l.signatures = new C7598l(TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()), TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()), TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()), TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()));
                        c10024l.isVip = AbstractC14093l.subs(-16777216, 127);
                        c10024l.f20436synchronized = false;
                        c10024l.f20424default = 2;
                        VKXApplication.Companion companion = VKXApplication.f36628l;
                        c10024l.premium = new C8895l(VKXApplication.Companion.yandex(8.0f), VKXApplication.Companion.yandex(8.0f));
                        c10024l.appmetrica = new C14440l(new C8467l(14, enumC10788l));
                        new C14262l(activityMopub, c10024l);
                        C14262l c14262l = new C14262l(activityMopub, c10024l);
                        C16052l c16052l = new C16052l(view);
                        if (c14262l.loadAd(view)) {
                            view.post(new RunnableC10613l(c14262l, view, c16052l, i2));
                        }
                    }
                }
                return Unit.INSTANCE;
            case 12:
                ((C14451l) obj2).f465l.amazon(((C8813l) obj).crashlytics(), 1, null);
                return Unit.INSTANCE;
            default:
                C17398l c17398l = (C17398l) obj2;
                AbstractC9033l.loadAd(c17398l, c17398l.isVip(), false, new C15556l(c17398l, (AudioTrack) obj, false ? 1 : 0, 9));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C5514l(Object obj, Object obj2, int i) {
        this.f11783l = i;
        this.f11782l = obj;
        this.f11781l = obj2;
    }
}
