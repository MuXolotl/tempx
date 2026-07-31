package defpackage;

import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٖ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17970l implements InterfaceC14094l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f35134l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final UUID f35135l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC17970l f35136l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Thread f35137l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f35138l;

    public AbstractC17970l(String str, AbstractC17970l abstractC17970l, C9226l c9226l) {
        this.f35138l = str;
        this.f35136l = abstractC17970l;
        this.f35135l = abstractC17970l.f35135l;
        this.f35134l = abstractC17970l.f35134l;
        this.f35137l = Thread.currentThread();
    }

    public static String yandex(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C9226l c9226lLoadAd = AbstractC10540l.loadAd();
        InterfaceC14094l interfaceC14094l = c9226lLoadAd.loadAd;
        String str = this.f35138l;
        if (interfaceC14094l == null) {
            throw new C17072l(AbstractC9361l.ad(new StringBuilder(str.length() + EnergyProfile.EVCONNECTOR_TYPE_OTHER), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."), 13);
        }
        if (this == interfaceC14094l) {
            AbstractC10540l.yandex(c9226lLoadAd, ((AbstractC17970l) interfaceC14094l).f35136l);
            this.f35137l = null;
            return;
        }
        String str2 = ((AbstractC17970l) interfaceC14094l).f35138l;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        AbstractC9361l.appmetrica(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new C17072l(sb.toString(), 14);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:76:0x020e  */
    public final String toString() {
        int i;
        int i2;
        C15380l c15380l;
        Iterator it;
        C4377l c4377l;
        int i3;
        C5687l c5687l;
        AtomicReference atomicReference = AbstractC10540l.yandex;
        AbstractC17970l abstractC17970l = this;
        int i4 = 0;
        int length = 0;
        while (abstractC17970l != null) {
            i4++;
            length += abstractC17970l.f35138l.length();
            abstractC17970l = abstractC17970l.f35136l;
            if (abstractC17970l != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            AbstractC17970l abstractC17970l2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = abstractC17970l2.f35138l;
                abstractC17970l2 = abstractC17970l2.f35136l;
            }
            C13698l c13698lYandex = AbstractC13675l.yandex();
            int i6 = 1;
            AbstractC10199l it2 = (i4 != 0 ? i4 != 1 ? AbstractC8481l.metrica(i4, (Object[]) strArr.clone()) : new C12950l(strArr[0]) : C13825l.f26967l).iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                c13698lYandex.mo3668catch(it2.next(), Integer.valueOf(i7));
                i7++;
            }
            C15333l c15333lMetrica = c13698lYandex.metrica(true);
            int i8 = c15333lMetrica.f29969l;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                c15380l = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) c15333lMetrica.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                C2934l c2934l = new C2934l(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    c2934l.f6389l += i6;
                    int i14 = iArr[i12];
                    while (true) {
                        C5687l c5687l2 = null;
                        while (true) {
                            if (c2934l.f6389l <= 0) {
                                i3 = i6;
                                break;
                            }
                            int i15 = c2934l.f6384l;
                            c5687l = (C5687l) c2934l.f6385l;
                            i3 = i6;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((C5687l) c5687l.amazon.get(Integer.valueOf(iArr[c2934l.f6386l]))).yandex;
                            int i17 = c2934l.f6384l;
                            if (iArr[i16 + i17] == i14) {
                                if (c5687l2 != null) {
                                    c5687l2.crashlytics = (C5687l) c2934l.f6385l;
                                }
                                c2934l.f6384l = i17 + 1;
                                c2934l.mopub();
                                break;
                            }
                            C5687l c5687l3 = (C5687l) ((C5687l) c2934l.f6385l).amazon.get(Integer.valueOf(iArr[c2934l.f6386l]));
                            int i18 = c5687l3.yandex;
                            int i19 = i13;
                            C5687l c5687l4 = new C5687l(i18, (c2934l.f6384l + i18) - 1);
                            ((C5687l) c2934l.f6385l).amazon.put(Integer.valueOf(iArr[c2934l.f6386l]), c5687l4);
                            int i20 = c5687l4.loadAd + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = c5687l4.amazon;
                            map.put(numValueOf, c5687l3);
                            c5687l3.yandex = i20;
                            if (c5687l2 != null) {
                                c5687l2.crashlytics = c5687l4;
                            }
                            map.put(Integer.valueOf(i14), new C5687l(i12, 1073741824));
                            c2934l.f6389l--;
                            c2934l.admob();
                            c5687l2 = c5687l4;
                            i6 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = c5687l.amazon;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (c5687l2 != null) {
                                c5687l2.crashlytics = (C5687l) c2934l.f6385l;
                            }
                            c2934l.f6386l = i12;
                            c2934l.f6384l++;
                            c2934l.mopub();
                            break;
                        }
                        ((C5687l) c2934l.f6385l).amazon.put(numValueOf2, new C5687l(i12, 1073741824));
                        if (c5687l2 != null) {
                            c5687l2.crashlytics = (C5687l) c2934l.f6385l;
                        }
                        c2934l.f6389l += i13;
                        c2934l.admob();
                        i6 = i3;
                    }
                    i12++;
                    i6 = i3;
                }
                int i21 = i6;
                ArrayDeque arrayDeque = new ArrayDeque();
                C5687l c5687l5 = (C5687l) c2934l.f6390l;
                C4377l c4377l2 = new C4377l(c5687l5, 0, -1, -1);
                arrayDeque.push(c4377l2);
                while (!arrayDeque.isEmpty()) {
                    C4377l c4377l3 = (C4377l) arrayDeque.pop();
                    Iterator it3 = c4377l3.amazon.amazon.values().iterator();
                    while (it3.hasNext()) {
                        C5687l c5687l6 = (C5687l) it3.next();
                        int i22 = c4377l3.loadAd;
                        int i23 = c4377l3.crashlytics;
                        int i24 = c5687l6.yandex;
                        C5687l c5687l7 = c5687l5;
                        int i25 = c5687l6.loadAd;
                        if (c2934l.firebase(i22, i23, i24, i25)) {
                            it = it3;
                        } else {
                            if (c5687l6.amazon.isEmpty()) {
                                int i26 = c5687l6.yandex;
                                it = it3;
                                if (c2934l.firebase(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (c4377l2.yandex < c4377l.yandex) {
                                    c4377l2 = c4377l;
                                }
                                arrayDeque.push(c4377l);
                                c5687l5 = c5687l7;
                                it3 = it;
                                i21 = 1;
                            } else {
                                it = it3;
                            }
                            c4377l = new C4377l(c5687l6, i21, c5687l6.yandex, i25);
                            if (c4377l2.yandex < c4377l.yandex) {
                                c4377l2 = c4377l;
                            }
                            arrayDeque.push(c4377l);
                            c5687l5 = c5687l7;
                            it3 = it;
                            i21 = 1;
                        }
                        c4377l = new C4377l(c5687l6, c4377l3.yandex + i21, i22, i23);
                        if (c4377l2.yandex < c4377l.yandex) {
                            c4377l2 = c4377l;
                        }
                        arrayDeque.push(c4377l);
                        c5687l5 = c5687l7;
                        it3 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, c4377l2.crashlytics + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = c4377l2.loadAd;
                    i2 = iMin - i;
                    c5687l5 = (C5687l) c5687l5.amazon.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (c5687l5 == null) {
                        break;
                    }
                    for (int i28 = c5687l5.yandex; i28 < c5687l5.loadAd + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                C15380l c15380l2 = new C15380l(i, iMin, i29, 8);
                if (i2 * i29 < i9) {
                    c15380l = null;
                } else {
                    c15380l = c15380l2;
                }
            }
            String strConcat = "";
            if (c15380l != null) {
                int i30 = c15380l.loadAd;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = c15380l.crashlytics;
                int i32 = c15380l.amazon;
                int i33 = ((i31 - i30) * i32) + i30;
                strConcat = i33 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        AbstractC17970l abstractC17970l3 = this;
        while (abstractC17970l3 != null) {
            String str = abstractC17970l3.f35138l;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            abstractC17970l3 = abstractC17970l3.f35136l;
            if (abstractC17970l3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public AbstractC17970l(String str, UUID uuid, String str2, C9226l c9226l) {
        this.f35138l = str;
        this.f35136l = null;
        this.f35135l = uuid;
        this.f35134l = str2;
        c9226l.getClass();
        this.f35137l = Thread.currentThread();
    }
}
