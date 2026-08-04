package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: lٌٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15130l implements InterfaceC14046l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C15130l() {
        this.yandex = 14;
    }

    @Override // defpackage.InterfaceC14046l
    public final void yandex(C12398l c12398l, Object obj, C6344l c6344l) throws C2584l {
        int i = 0;
        switch (this.yandex) {
            case 0:
                C16105l c16105l = (C16105l) obj;
                String str = c12398l.loadAd;
                try {
                    c16105l.yandex = Float.parseFloat(str);
                    return;
                } catch (NumberFormatException unused) {
                    throw C2584l.yandex("EXT-X-START", 33, str);
                }
            case 1:
                ((C16105l) obj).loadAd = AbstractC17551l.isPro(c12398l, "EXT-X-START");
                return;
            case 2:
                C16576l c16576l = (C16576l) obj;
                String strSubs = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA");
                if (!AbstractC6052l.isPro.matcher(strSubs).matches()) {
                    throw C2584l.yandex("EXT-X-MEDIA", 15, c12398l.toString());
                }
                c16576l.isPro = strSubs;
                return;
            case 3:
                C16576l c16576l2 = (C16576l) obj;
                String[] strArrSplit = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA").split(AbstractC6052l.yandex);
                if (strArrSplit.length == 0) {
                    throw C2584l.yandex("EXT-X-MEDIA", 4, c12398l.toString());
                }
                c16576l2.firebase = Arrays.asList(strArrSplit);
                return;
            case 4:
                C16576l c16576l3 = (C16576l) obj;
                String[] strArrSplit2 = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA").split("/");
                if (strArrSplit2.length == 0 || strArrSplit2[0].isEmpty()) {
                    throw C2584l.yandex("EXT-X-MEDIA", 3, c12398l.toString());
                }
                c16576l3.smaato = AbstractC17551l.admob(strArrSplit2[0], "EXT-X-MEDIA");
                return;
            case 5:
                C16576l c16576l4 = (C16576l) obj;
                EnumC7009l enumC7009l = (EnumC7009l) EnumC7009l.f14702l.get(c12398l.loadAd);
                if (enumC7009l == null) {
                    throw C2584l.yandex("EXT-X-MEDIA", 16, c12398l.toString());
                }
                c16576l4.yandex = enumC7009l;
                return;
            case 6:
                ((C16576l) obj).loadAd = AbstractC17551l.crashlytics(AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA"), (EnumC6690l) c6344l.f13303l);
                return;
            case 7:
                C16576l c16576l5 = (C16576l) obj;
                String strSubs2 = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA");
                if (strSubs2.isEmpty()) {
                    throw C2584l.yandex("EXT-X-MEDIA", 5, c12398l.toString());
                }
                c16576l5.crashlytics = strSubs2;
                return;
            case 8:
                ((C16576l) obj).amazon = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA");
                return;
            case 9:
                ((C16576l) obj).purchase = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA");
                return;
            case 10:
                C16576l c16576l6 = (C16576l) obj;
                String strSubs3 = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MEDIA");
                if (strSubs3.isEmpty()) {
                    throw C2584l.yandex("EXT-X-MEDIA", 6, c12398l.toString());
                }
                c16576l6.billing = strSubs3;
                return;
            case 11:
                C16576l c16576l7 = (C16576l) obj;
                boolean zIsPro = AbstractC17551l.isPro(c12398l, "EXT-X-MEDIA");
                c16576l7.mopub = zIsPro;
                C5390l c5390l = (C5390l) c6344l.f13307l;
                c5390l.f11538l = zIsPro;
                if (zIsPro) {
                    if (c5390l.f11544l) {
                        throw C2584l.yandex("EXT-X-MEDIA", 1, c12398l.toString());
                    }
                    c16576l7.admob = true;
                    return;
                }
                return;
            case 12:
                boolean zIsPro2 = AbstractC17551l.isPro(c12398l, "EXT-X-MEDIA");
                ((C16576l) obj).admob = zIsPro2;
                C5390l c5390l2 = (C5390l) c6344l.f13307l;
                c5390l2.f11544l = !zIsPro2;
                if (c5390l2.f11538l && !zIsPro2) {
                    throw C2584l.yandex("EXT-X-MEDIA", 1, c12398l.toString());
                }
                return;
            case 13:
                ((C16576l) obj).subs = AbstractC17551l.isPro(c12398l, "EXT-X-MEDIA");
                return;
            case 14:
                return;
            case 15:
                ((C8718l) obj).mopub = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-I-FRAME-STREAM-INF");
                return;
            case 16:
                ((C9123l) obj).billing = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-STREAM-INF");
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C9123l) obj).admob = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-STREAM-INF");
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C9123l c9123l = (C9123l) obj;
                String str2 = c12398l.loadAd;
                if (str2.equals("NONE")) {
                    return;
                }
                c9123l.subs = AbstractC17551l.subs(str2, "EXT-X-STREAM-INF");
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C10150l c10150l = (C10150l) obj;
                EnumC17267l enumC17267l = (EnumC17267l) EnumC17267l.f33497l.get(c12398l.loadAd);
                if (enumC17267l == null) {
                    throw C2584l.yandex("EXT-X-KEY", 11, c12398l.toString());
                }
                c10150l.yandex = enumC17267l;
                return;
            case 20:
                ((C10150l) obj).loadAd = AbstractC17551l.crashlytics(AbstractC17551l.subs(c12398l.loadAd, "EXT-X-KEY"), (EnumC6690l) c6344l.f13303l);
                return;
            case 21:
                C10150l c10150l2 = (C10150l) obj;
                String str3 = c12398l.loadAd;
                ArrayList arrayList = new ArrayList();
                Matcher matcher = AbstractC6052l.crashlytics.matcher(str3.toUpperCase(Locale.US));
                if (!matcher.matches()) {
                    throw C2584l.yandex("EXT-X-KEY", 12, str3);
                }
                String strGroup = matcher.group(1);
                if (strGroup.length() % 2 != 0) {
                    throw C2584l.yandex("EXT-X-KEY", 12, str3);
                }
                while (i < strGroup.length()) {
                    int i2 = i + 2;
                    arrayList.add(Byte.valueOf((byte) (Short.parseShort(strGroup.substring(i, i2), 16) & 255)));
                    i = i2;
                }
                if (arrayList.size() != 16 && arrayList.size() != 32) {
                    throw C2584l.yandex("EXT-X-KEY", 13, c12398l.toString());
                }
                c10150l2.crashlytics = arrayList;
                return;
            case 22:
                ((C10150l) obj).amazon = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-KEY");
                return;
            case 23:
                C10150l c10150l3 = (C10150l) obj;
                String[] strArrSplit3 = AbstractC17551l.subs(c12398l.loadAd, "EXT-X-KEY").split("/");
                ArrayList arrayList2 = new ArrayList();
                int length = strArrSplit3.length;
                while (i < length) {
                    try {
                        arrayList2.add(Integer.valueOf(Integer.parseInt(strArrSplit3[i])));
                        i++;
                    } catch (NumberFormatException unused2) {
                        throw C2584l.yandex("EXT-X-KEY", 14, c12398l.toString());
                    }
                }
                c10150l3.purchase = arrayList2;
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C14848l) obj).yandex = AbstractC17551l.crashlytics(AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MAP"), (EnumC6690l) c6344l.f13303l);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C14848l c14848l = (C14848l) obj;
                Matcher matcher2 = AbstractC6052l.startapp.matcher(AbstractC17551l.subs(c12398l.loadAd, "EXT-X-MAP"));
                if (!matcher2.matches()) {
                    throw C2584l.yandex("EXT-X-MAP", 20, c12398l.toString());
                }
                c14848l.loadAd = AbstractC17551l.billing(matcher2);
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C16105l c16105l2 = (C16105l) obj;
                String str4 = c12398l.loadAd;
                try {
                    c16105l2.yandex = Float.parseFloat(str4);
                    return;
                } catch (NumberFormatException unused3) {
                    throw C2584l.yandex("EXT-X-START", 33, str4);
                }
            default:
                ((C16105l) obj).loadAd = AbstractC17551l.isPro(c12398l, "EXT-X-START");
                return;
        }
    }

    public /* synthetic */ C15130l(InterfaceC7233l interfaceC7233l, int i) {
        this.yandex = i;
    }
}
