package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lَُؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10751l implements InterfaceC14833l {
    public int admob;
    public final InterfaceC5304l amazon;
    public InterfaceC2053l billing;
    public final C16391l loadAd;
    public final boolean purchase;
    public final String yandex;
    public static final Pattern subs = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern isPro = Pattern.compile("MPEGTS:(-?\\d+)");
    public final C13143l crashlytics = new C13143l();
    public byte[] mopub = new byte[1024];

    public C10751l(String str, C16391l c16391l, InterfaceC5304l interfaceC5304l, boolean z) {
        this.yandex = str;
        this.loadAd = c16391l;
        this.amazon = interfaceC5304l;
        this.purchase = z;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        if (this.purchase) {
            interfaceC2053l = new C11919l(interfaceC2053l, this.amazon);
        }
        this.billing = interfaceC2053l;
        interfaceC2053l.tapsense(new C9828l(-9223372036854775807L));
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        C11826l c11826l = (C11826l) interfaceC10430l;
        c11826l.billing(this.mopub, 0, 6, false);
        byte[] bArr = this.mopub;
        C13143l c13143l = this.crashlytics;
        c13143l.m3565private(6, bArr);
        if (AbstractC4904l.yandex(c13143l)) {
            return true;
        }
        c11826l.billing(this.mopub, 6, 3, false);
        c13143l.m3565private(9, this.mopub);
        return AbstractC4904l.yandex(c13143l);
    }

    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        String strVip;
        this.billing.getClass();
        int length = (int) interfaceC10430l.getLength();
        int i = this.admob;
        byte[] bArr = this.mopub;
        if (i == bArr.length) {
            this.mopub = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.mopub;
        int i2 = this.admob;
        int i3 = interfaceC10430l.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.admob + i3;
            this.admob = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        C13143l c13143l = new C13143l(this.mopub);
        AbstractC4904l.amazon(c13143l);
        String strVip2 = c13143l.vip(StandardCharsets.UTF_8);
        long jM3970import = 0;
        long jCrashlytics = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strVip2)) {
                while (true) {
                    String strVip3 = c13143l.vip(StandardCharsets.UTF_8);
                    if (strVip3 == null) {
                        break;
                    }
                    if (AbstractC4904l.yandex.matcher(strVip3).matches()) {
                        do {
                            strVip = c13143l.vip(StandardCharsets.UTF_8);
                            if (strVip == null) {
                                break;
                            }
                        } while (!strVip.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC14398l.yandex.matcher(strVip3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    mopub(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jCrashlytics2 = AbstractC4904l.crashlytics(strGroup);
                String str = AbstractC15323l.yandex;
                long jLoadAd = this.loadAd.loadAd(AbstractC15323l.m3970import((jM3970import + jCrashlytics2) - jCrashlytics, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                InterfaceC8979l interfaceC8979lMopub = mopub(jLoadAd - jCrashlytics2);
                byte[] bArr3 = this.mopub;
                int i5 = this.admob;
                C13143l c13143l2 = this.crashlytics;
                c13143l2.m3565private(i5, bArr3);
                interfaceC8979lMopub.purchase(this.admob, c13143l2);
                interfaceC8979lMopub.yandex(jLoadAd, 1, this.admob, 0, null);
                return -1;
            }
            if (strVip2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = subs.matcher(strVip2);
                if (!matcher3.find()) {
                    throw C17655l.yandex(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strVip2));
                }
                Matcher matcher4 = isPro.matcher(strVip2);
                if (!matcher4.find()) {
                    throw C17655l.yandex(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strVip2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jCrashlytics = AbstractC4904l.crashlytics(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j = Long.parseLong(strGroup3);
                String str2 = AbstractC15323l.yandex;
                jM3970import = AbstractC15323l.m3970import(j, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strVip2 = c13143l.vip(StandardCharsets.UTF_8);
        }
    }

    public final InterfaceC8979l mopub(long j) {
        InterfaceC8979l interfaceC8979lStartapp = this.billing.startapp(0, 3);
        C12984l c12984l = new C12984l();
        c12984l.vip = AbstractC3825l.vip("text/vtt");
        c12984l.amazon = this.yandex;
        c12984l.subscription = j;
        AbstractC9029l.license(c12984l, interfaceC8979lStartapp);
        this.billing.firebase();
        return interfaceC8979lStartapp;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
