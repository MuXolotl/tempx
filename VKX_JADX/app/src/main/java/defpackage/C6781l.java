package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: lؙ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6781l implements InterfaceC17215l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f14206l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f14207l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f14208l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13143l f14209l = new C13143l();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f14210l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f14211l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final float f14212l;

    public C6781l(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f14206l = 0;
            this.f14211l = -1;
            this.f14210l = "sans-serif";
            this.f14208l = false;
            this.f14212l = 0.85f;
            this.f14207l = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f14206l = bArr[24];
        this.f14211l = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f14210l = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f14207l = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f14208l = z;
        if (z) {
            this.f14212l = AbstractC15323l.subs(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f14212l = 0.85f;
        }
    }

    public static void loadAd(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    public static void yandex(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ InterfaceC2743l isPro(int i, int i2, byte[] bArr) {
        return AbstractC0653l.billing(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC17215l
    public final void startapp(byte[] bArr, int i, int i2, C8807l c8807l, InterfaceC18679l interfaceC18679l) {
        String strAdvert;
        int i3;
        C13143l c13143l = this.f14209l;
        c13143l.m3565private(i + i2, bArr);
        c13143l.m3562for(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        AbstractC12442l.admob(c13143l.yandex() >= 2);
        int iM3567synchronized = c13143l.m3567synchronized();
        if (iM3567synchronized == 0) {
            strAdvert = "";
        } else {
            int i7 = c13143l.loadAd;
            Charset charsetM3570volatile = c13143l.m3570volatile();
            int i8 = iM3567synchronized - (c13143l.loadAd - i7);
            if (charsetM3570volatile == null) {
                charsetM3570volatile = StandardCharsets.UTF_8;
            }
            strAdvert = c13143l.advert(i8, charsetM3570volatile);
        }
        if (strAdvert.isEmpty()) {
            C9258l c9258l = AbstractC1186l.f3181l;
            interfaceC18679l.accept(new C8755l(-9223372036854775807L, -9223372036854775807L, C13708l.f26763l));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strAdvert);
        loadAd(spannableStringBuilder, this.f14206l, 0, 0, spannableStringBuilder.length(), 16711680);
        yandex(spannableStringBuilder, this.f14211l, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f14210l;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fSubs = this.f14212l;
        while (c13143l.yandex() >= 8) {
            int i9 = c13143l.loadAd;
            int iRemoteconfig = c13143l.remoteconfig();
            int iRemoteconfig2 = c13143l.remoteconfig();
            if (iRemoteconfig2 == 1937013100) {
                AbstractC12442l.admob(c13143l.yandex() >= i6 ? i4 : i5);
                int iM3567synchronized2 = c13143l.m3567synchronized();
                int i10 = i5;
                while (i10 < iM3567synchronized2) {
                    AbstractC12442l.admob(c13143l.yandex() >= 12 ? i4 : i5);
                    int iM3567synchronized3 = c13143l.m3567synchronized();
                    int iM3567synchronized4 = c13143l.m3567synchronized();
                    c13143l.m3568throw(i6);
                    int i11 = i10;
                    int iSignatures = c13143l.signatures();
                    c13143l.m3568throw(i4);
                    int iRemoteconfig3 = c13143l.remoteconfig();
                    if (iM3567synchronized4 > spannableStringBuilder.length()) {
                        StringBuilder sbSignature = AbstractC2812l.Signature("Truncating styl end (", iM3567synchronized4, ") to cueText.length() (");
                        sbSignature.append(spannableStringBuilder.length());
                        sbSignature.append(").");
                        AbstractC6427l.vip("Tx3gParser", sbSignature.toString());
                        iM3567synchronized4 = spannableStringBuilder.length();
                    }
                    if (iM3567synchronized3 >= iM3567synchronized4) {
                        AbstractC6427l.vip("Tx3gParser", AbstractC12589l.applovin(iM3567synchronized3, iM3567synchronized4, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        int i12 = iM3567synchronized4;
                        loadAd(spannableStringBuilder, iSignatures, this.f14206l, iM3567synchronized3, i12, 0);
                        yandex(spannableStringBuilder, iRemoteconfig3, this.f14211l, iM3567synchronized3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iRemoteconfig2 == 1952608120 && this.f14208l) {
                i3 = 2;
                AbstractC12442l.admob(c13143l.yandex() >= 2);
                fSubs = AbstractC15323l.subs(c13143l.m3567synchronized() / this.f14207l, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            c13143l.m3562for(i9 + iRemoteconfig);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        interfaceC18679l.accept(new C8755l(-9223372036854775807L, -9223372036854775807L, AbstractC1186l.isVip(new C17456l(spannableStringBuilder, null, null, null, fSubs, 0, 0, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0))));
    }

    @Override // defpackage.InterfaceC17215l
    public final /* synthetic */ void reset() {
    }
}
