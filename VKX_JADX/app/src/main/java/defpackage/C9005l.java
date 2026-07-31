package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: renamed from: lٌۘۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9005l {
    public final String admob;
    public final long amazon;
    public final C5900l billing;
    public final boolean crashlytics;
    public final HashMap firebase;
    public final C9005l isPro;
    public final String loadAd;
    public final String[] mopub;
    public final long purchase;
    public ArrayList remoteconfig;
    public final HashMap smaato;
    public final String subs;
    public final String yandex;

    public C9005l(String str, String str2, long j, long j2, C5900l c5900l, String[] strArr, String str3, String str4, C9005l c9005l) {
        this.yandex = str;
        this.loadAd = str2;
        this.subs = str4;
        this.billing = c5900l;
        this.mopub = strArr;
        this.crashlytics = str2 != null;
        this.amazon = j;
        this.purchase = j2;
        str3.getClass();
        this.admob = str3;
        this.isPro = c9005l;
        this.firebase = new HashMap();
        this.smaato = new HashMap();
    }

    public static SpannableStringBuilder purchase(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C13116l c13116l = new C13116l();
            c13116l.yandex = new SpannableStringBuilder();
            c13116l.loadAd = null;
            treeMap.put(str, c13116l);
        }
        CharSequence charSequence = ((C13116l) treeMap.get(str)).yandex;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public static C9005l yandex(String str) {
        return new C9005l(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:148:0x021b  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:165:0x0269  */
    /* JADX WARN: Code duplicated, block: B:168:0x0281  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:172:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02be  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public final void admob(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        C9005l c9005l;
        int i2;
        C5900l c5900lMopub;
        int i3;
        float f;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i4;
        RelativeSizeSpan relativeSizeSpan;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        if (billing(j)) {
            String str2 = this.admob;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.smaato.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.firebase;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C13116l c13116l = (C13116l) treeMap.get(str4);
                    c13116l.getClass();
                    C10479l c10479l = (C10479l) map2.get(str3);
                    c10479l.getClass();
                    int i10 = c10479l.isPro;
                    C5900l c5900lMopub2 = AbstractC1889l.mopub(this.billing, this.mopub, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c13116l.yandex;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c13116l.yandex = spannableStringBuilder;
                        c13116l.loadAd = null;
                    }
                    if (c5900lMopub2 != null) {
                        int i11 = c5900lMopub2.admob;
                        int i12 = 1;
                        if (((i11 == -1 && c5900lMopub2.subs == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (c5900lMopub2.subs == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = c5900lMopub2.admob;
                            if (i13 != -1) {
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (c5900lMopub2.subs == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (c5900lMopub2.subs == -1) {
                                i9 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (c5900lMopub2.subs == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (c5900lMopub2.billing == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c5900lMopub2.mopub == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c5900lMopub2.crashlytics) {
                            if (!c5900lMopub2.crashlytics) {
                                C8339l.smaato("Font color has not been defined.");
                                return;
                            }
                            AbstractC5006l.loadAd(spannableStringBuilder, new ForegroundColorSpan(c5900lMopub2.loadAd), iIntValue, iIntValue2);
                        }
                        if (c5900lMopub2.purchase) {
                            if (!c5900lMopub2.purchase) {
                                C8339l.smaato("Background color has not been defined.");
                                return;
                            }
                            AbstractC5006l.loadAd(spannableStringBuilder, new BackgroundColorSpan(c5900lMopub2.amazon), iIntValue, iIntValue2);
                        }
                        if (c5900lMopub2.yandex != null) {
                            AbstractC5006l.loadAd(spannableStringBuilder, new TypefaceSpan(c5900lMopub2.yandex), iIntValue, iIntValue2);
                        }
                        C4171l c4171l = c5900lMopub2.ads;
                        if (c4171l != null) {
                            int i14 = c4171l.yandex;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = c4171l.loadAd;
                            }
                            int i15 = c4171l.crashlytics;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            AbstractC5006l.loadAd(spannableStringBuilder, new C13866l(i14, i6, i15), iIntValue, iIntValue2);
                        }
                        int i16 = c5900lMopub2.remoteconfig;
                        if (i16 == 2) {
                            C9005l c9005l2 = this.isPro;
                            while (true) {
                                if (c9005l2 == null) {
                                    c9005l2 = null;
                                    break;
                                }
                                C5900l c5900lMopub3 = AbstractC1889l.mopub(c9005l2.billing, c9005l2.mopub, map3);
                                if (c5900lMopub3 != null && c5900lMopub3.remoteconfig == 1) {
                                    break;
                                } else {
                                    c9005l2 = c9005l2.isPro;
                                }
                            }
                            if (c9005l2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c9005l2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c9005l = null;
                                        break;
                                    }
                                    C9005l c9005l3 = (C9005l) arrayDeque.pop();
                                    C5900l c5900lMopub4 = AbstractC1889l.mopub(c9005l3.billing, c9005l3.mopub, map3);
                                    if (c5900lMopub4 != null && c5900lMopub4.remoteconfig == 3) {
                                        c9005l = c9005l3;
                                        break;
                                    }
                                    for (int iCrashlytics = c9005l3.crashlytics() - 1; iCrashlytics >= 0; iCrashlytics--) {
                                        arrayDeque.push(c9005l3.loadAd(iCrashlytics));
                                    }
                                }
                                if (c9005l != null) {
                                    if (c9005l.crashlytics() == 1) {
                                        i2 = 0;
                                        if (c9005l.loadAd(0).loadAd != null) {
                                            String str5 = c9005l.loadAd(0).loadAd;
                                            String str6 = AbstractC15323l.yandex;
                                            C5900l c5900lMopub5 = AbstractC1889l.mopub(c9005l.billing, c9005l.mopub, map3);
                                            int i17 = c5900lMopub5 != null ? c5900lMopub5.vip : -1;
                                            if (i17 == -1 && (c5900lMopub = AbstractC1889l.mopub(c9005l2.billing, c9005l2.mopub, map3)) != null) {
                                                i17 = c5900lMopub.vip;
                                            }
                                            spannableStringBuilder.setSpan(new C14711l(str5, i17), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    AbstractC6427l.firebase("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (c5900lMopub2.adcel == 1) {
                                AbstractC5006l.loadAd(spannableStringBuilder, new C3146l(), iIntValue, iIntValue2);
                            }
                            i3 = c5900lMopub2.isPro;
                            f = 100.0f;
                            if (i3 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                AbstractC5006l.loadAd(spannableStringBuilder, new AbsoluteSizeSpan((int) c5900lMopub2.firebase, true), iIntValue, iIntValue2);
                            } else if (i3 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                AbstractC5006l.loadAd(spannableStringBuilder, new RelativeSizeSpan(c5900lMopub2.firebase), iIntValue, iIntValue2);
                            } else if (i3 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float f4 = c5900lMopub2.firebase / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i18 = i2;
                                sizeChange = f4;
                                i4 = i18;
                                while (i4 < length) {
                                    float f5 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i4];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i5 = i4;
                                    } else {
                                        i5 = i4;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i4 = i5 + 1;
                                    f = f5;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.yandex)) {
                                f3 = c5900lMopub2.subscription;
                                if (f3 != Float.MAX_VALUE) {
                                    c13116l.adcel = (f3 * (-90.0f)) / f2;
                                }
                                alignment = c5900lMopub2.metrica;
                                if (alignment != null) {
                                    c13116l.crashlytics = alignment;
                                }
                                alignment2 = c5900lMopub2.startapp;
                                if (alignment2 != null) {
                                    c13116l.amazon = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new C2678l(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (c5900lMopub2.adcel == 1) {
                            AbstractC5006l.loadAd(spannableStringBuilder, new C3146l(), iIntValue, iIntValue2);
                        }
                        i3 = c5900lMopub2.isPro;
                        f = 100.0f;
                        if (i3 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            AbstractC5006l.loadAd(spannableStringBuilder, new AbsoluteSizeSpan((int) c5900lMopub2.firebase, true), iIntValue, iIntValue2);
                        } else if (i3 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            AbstractC5006l.loadAd(spannableStringBuilder, new RelativeSizeSpan(c5900lMopub2.firebase), iIntValue, iIntValue2);
                        } else if (i3 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float f6 = c5900lMopub2.firebase / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i19 = i2;
                            sizeChange = f6;
                            i4 = i19;
                            while (i4 < length) {
                                float f7 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i4];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                }
                                i4 = i5 + 1;
                                f = f7;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.yandex)) {
                            f3 = c5900lMopub2.subscription;
                            if (f3 != Float.MAX_VALUE) {
                                c13116l.adcel = (f3 * (-90.0f)) / f2;
                            }
                            alignment = c5900lMopub2.metrica;
                            if (alignment != null) {
                                c13116l.crashlytics = alignment;
                            }
                            alignment2 = c5900lMopub2.startapp;
                            if (alignment2 != null) {
                                c13116l.amazon = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < crashlytics()) {
                loadAd(i20).admob(j, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }

    public final void amazon(TreeSet treeSet, boolean z) {
        String str = this.yandex;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.subs != null)) {
            long j = this.amazon;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.purchase;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.remoteconfig == null) {
            return;
        }
        for (int i = 0; i < this.remoteconfig.size(); i++) {
            ((C9005l) this.remoteconfig.get(i)).amazon(treeSet, z || zEquals);
        }
    }

    public final boolean billing(long j) {
        long j2 = this.amazon;
        long j3 = this.purchase;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final int crashlytics() {
        ArrayList arrayList = this.remoteconfig;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final C9005l loadAd(int i) {
        ArrayList arrayList = this.remoteconfig;
        if (arrayList != null) {
            return (C9005l) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void mopub(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.admob;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (billing(j) && "div".equals(this.yandex) && (str2 = this.subs) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < crashlytics(); i++) {
            loadAd(i).mopub(j, str, arrayList);
        }
    }

    public final void subs(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.firebase;
        map.clear();
        HashMap map2 = this.smaato;
        map2.clear();
        String str2 = this.yandex;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.admob;
        String str4 = "".equals(str3) ? str : str3;
        if (this.crashlytics && z) {
            SpannableStringBuilder spannableStringBuilderPurchase = purchase(str4, treeMap);
            String str5 = this.loadAd;
            str5.getClass();
            spannableStringBuilderPurchase.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            purchase(str4, treeMap).append('\n');
            return;
        }
        if (billing(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C13116l) entry.getValue()).yandex;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < crashlytics(); i++) {
                loadAd(i).subs(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderPurchase2 = purchase(str4, treeMap);
                int length = spannableStringBuilderPurchase2.length() - 1;
                while (length >= 0 && spannableStringBuilderPurchase2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderPurchase2.charAt(length) != '\n') {
                    spannableStringBuilderPurchase2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C13116l) entry2.getValue()).yandex;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
