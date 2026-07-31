package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lًٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16982l implements InterfaceC17215l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Pattern f33105l = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final Pattern f33104l = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final StringBuilder f33108l = new StringBuilder();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f33107l = new ArrayList();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13143l f33106l = new C13143l();

    public static long loadAd(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    public static C17456l yandex(Spanned spanned, String str) {
        int i;
        int i2;
        float f;
        if (str == null) {
            return new C17456l(spanned, null, null, null, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                i = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                i = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i = 1;
                } else {
                    i = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                i = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i = 1;
                } else {
                    i = 2;
                }
                break;
            default:
                i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                i2 = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                i2 = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                i2 = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                break;
            default:
                i2 = 1;
                break;
        }
        float f2 = 0.92f;
        if (i == 0) {
            f = 0.08f;
        } else if (i == 1) {
            f = 0.5f;
        } else {
            if (i != 2) {
                C11983l.crashlytics();
                return null;
            }
            f = 0.92f;
        }
        if (i2 == 0) {
            f2 = 0.08f;
        } else if (i2 == 1) {
            f2 = 0.5f;
        } else if (i2 != 2) {
            C11983l.crashlytics();
            return null;
        }
        return new C17456l(spanned, null, null, null, f2, 0, i2, f, i, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    @Override // defpackage.InterfaceC17215l
    public final void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        String str;
        C16982l c16982l = this;
        long j = c8807l.loadAd;
        C13143l c13143l = c16982l.f33106l;
        c13143l.m3565private(i + i2, bArr);
        c13143l.m3562for(i);
        Charset charsetM3570volatile = c13143l.m3570volatile();
        if (charsetM3570volatile == null) {
            charsetM3570volatile = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !c8807l.yandex) ? null : new ArrayList();
        while (true) {
            String strVip = c13143l.vip(charsetM3570volatile);
            if (strVip == null) {
                break;
            }
            if (!strVip.isEmpty()) {
                try {
                    Integer.parseInt(strVip);
                    String strVip2 = c13143l.vip(charsetM3570volatile);
                    if (strVip2 == null) {
                        AbstractC6427l.vip("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f33105l.matcher(strVip2);
                    if (matcher.matches()) {
                        long jLoadAd = loadAd(matcher, 1);
                        long jLoadAd2 = loadAd(matcher, 6);
                        StringBuilder sb = c16982l.f33108l;
                        long j3 = j2;
                        sb.setLength(0);
                        ArrayList arrayList2 = c16982l.f33107l;
                        arrayList2.clear();
                        for (String strVip3 = c13143l.vip(charsetM3570volatile); !TextUtils.isEmpty(strVip3); strVip3 = c13143l.vip(charsetM3570volatile)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strVip3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f33104l.matcher(strTrim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                Matcher matcher3 = matcher2;
                                String strGroup = matcher3.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher3.start() - i3;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i3 += length;
                                matcher2 = matcher3;
                                j = j;
                            }
                            sb.append(sb2.toString());
                        }
                        long j4 = j;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (j4 == j3 || jLoadAd2 >= j4) {
                            interfaceC18679l.accept(new C8755l(jLoadAd, jLoadAd2 - jLoadAd, AbstractC1186l.isVip(yandex(spannedFromHtml, str))));
                        } else if (arrayList != null) {
                            arrayList.add(new C8755l(jLoadAd, jLoadAd2 - jLoadAd, AbstractC1186l.isVip(yandex(spannedFromHtml, str))));
                        }
                        c16982l = this;
                        j2 = j3;
                        j = j4;
                    } else {
                        AbstractC6427l.vip("SubripParser", "Skipping invalid timing: ".concat(strVip2));
                        c16982l = this;
                    }
                } catch (NumberFormatException unused) {
                    AbstractC6427l.vip("SubripParser", "Skipping invalid index: ".concat(strVip));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC18679l.accept((C8755l) it.next());
            }
        }
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ void reset() {
    }
}
