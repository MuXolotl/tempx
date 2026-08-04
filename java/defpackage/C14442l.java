package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: lٓ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14442l implements InterfaceC4452l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final List f28287l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C2012l f28288l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final CharSequence f28289l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11090l f28290l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f28291l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C4816l f28292l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC16061l f28293l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final List f28294l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final int f28295l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C17909l f28296l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC13490l f28297l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f28298l;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:233:0x0444  */
    /* JADX WARN: Code duplicated, block: B:245:0x0483  */
    /* JADX WARN: Code duplicated, block: B:246:0x048e  */
    /* JADX WARN: Code duplicated, block: B:248:0x049a  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:252:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:253:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:255:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:256:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:258:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:261:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:263:0x0508  */
    /* JADX WARN: Code duplicated, block: B:271:0x051a  */
    /* JADX WARN: Code duplicated, block: B:275:0x0524  */
    /* JADX WARN: Code duplicated, block: B:285:0x053f  */
    /* JADX WARN: Code duplicated, block: B:291:0x054b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0586  */
    /* JADX WARN: Code duplicated, block: B:296:0x058c  */
    /* JADX WARN: Code duplicated, block: B:299:0x059a  */
    /* JADX WARN: Code duplicated, block: B:302:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:304:0x05cc A[LOOP:7: B:303:0x05ca->B:304:0x05cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:309:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:311:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:313:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:314:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:316:0x0605  */
    /* JADX WARN: Code duplicated, block: B:327:0x063c  */
    /* JADX WARN: Code duplicated, block: B:332:0x0659  */
    /* JADX WARN: Code duplicated, block: B:334:0x0665  */
    /* JADX WARN: Code duplicated, block: B:341:0x0679  */
    /* JADX WARN: Code duplicated, block: B:395:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:397:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:399:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:406:0x07df  */
    /* JADX WARN: Code duplicated, block: B:420:0x0833  */
    /* JADX WARN: Code duplicated, block: B:422:0x0844  */
    /* JADX WARN: Code duplicated, block: B:423:0x0848  */
    /* JADX WARN: Code duplicated, block: B:425:0x0853  */
    /* JADX WARN: Code duplicated, block: B:428:0x085d A[LOOP:5: B:427:0x085b->B:428:0x085d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:431:0x086e  */
    /* JADX WARN: Code duplicated, block: B:433:0x0879  */
    /* JADX WARN: Code duplicated, block: B:435:0x0887 A[LOOP:6: B:434:0x0885->B:435:0x0887, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:438:0x0894  */
    /* JADX WARN: Code duplicated, block: B:442:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:453:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:433:0x0879, please report this as an issue */
    public C14442l(String str, C11090l c11090l, List list, List list2, InterfaceC16061l interfaceC16061l, InterfaceC13490l interfaceC13490l) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        C6886l c6886l;
        int i2;
        Typeface typeface;
        CharSequence charSequenceMopub;
        int i3;
        C13299l c13299l;
        List list3;
        C9077l c9077l;
        ArrayList arrayList;
        int size;
        int i4;
        List list4;
        C14264l c14264l;
        AbstractC17569l abstractC17569l;
        boolean z;
        C14264l c14264l2;
        C3091l c3091l;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        C14264l c14264lCrashlytics;
        int i10;
        ArrayList arrayList2;
        C14264l c14264l3;
        int i11;
        int i12;
        int i13;
        C9077l c9077l2;
        int size5;
        int i14;
        boolean z2;
        InterfaceC13490l interfaceC13490l2;
        List list5;
        C13299l c13299l2;
        int size6;
        int i15;
        C15012l c15012l;
        int i16;
        long j;
        long jLoadAd;
        int size7;
        int i17;
        C15012l c15012l2;
        InterfaceC18302l interfaceC18302l;
        List list6;
        int i18;
        int i19;
        Object c6458l;
        C15012l c15012l3;
        Object obj2;
        InterfaceC13490l interfaceC13490l3;
        C9077l c9077l3;
        int i20;
        int i21;
        int i22;
        C15012l c15012l4;
        Object obj3;
        C14264l c14264l4;
        boolean z3;
        int i23;
        long j2;
        long j3;
        long jLoadAd2;
        float fCrashlytics;
        long jLoadAd3;
        float fCrashlytics2;
        C4361l c4361l;
        CharSequence charSequence;
        C4361l c4361l2;
        this.f28291l = str;
        this.f28290l = c11090l;
        this.f28287l = list;
        this.f28294l = list2;
        this.f28293l = interfaceC16061l;
        this.f28297l = interfaceC13490l;
        float fLoadAd = interfaceC13490l.loadAd();
        int i24 = 1;
        C2012l c2012l = new C2012l(1);
        ((TextPaint) c2012l).density = fLoadAd;
        c2012l.loadAd = C9867l.loadAd;
        c2012l.crashlytics = 3;
        c2012l.amazon = C0387l.amazon;
        this.f28288l = c2012l;
        boolean zYandex = AbstractC13359l.yandex(c11090l);
        C14264l c14264l5 = c11090l.yandex;
        C9077l c9077l4 = c11090l.loadAd;
        if (zYandex) {
            C16543l c16543l = C5351l.yandex;
            C16543l c16543l2 = C5351l.yandex;
            InterfaceC12244l interfaceC12244lAdcel = (InterfaceC12244l) c16543l2.f32482l;
            if (interfaceC12244lAdcel == null) {
                if (C12304l.amazon()) {
                    interfaceC12244lAdcel = c16543l2.adcel();
                    c16543l2.f32482l = interfaceC12244lAdcel;
                } else {
                    interfaceC12244lAdcel = AbstractC16358l.yandex;
                }
            }
            zBooleanValue = ((Boolean) interfaceC12244lAdcel.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.f28298l = zBooleanValue;
        int i25 = c9077l4.loadAd;
        C10537l c10537l = c14264l5.firebase;
        if (i25 == 4) {
            i = 2;
        } else if (i25 == 5) {
            i = 3;
        } else if (i25 == 1) {
            i = 0;
        } else if (i25 == 2) {
            i = 1;
        } else {
            if (i25 != 3 && i25 != 0) {
                C8339l.smaato("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((c10537l == null || (locale = c10537l.amazon().yandex) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        this.f28295l = i;
        C4508l c4508l = new C4508l(i24, this);
        C10068l c10068l = c9077l4.subs;
        c10068l = c10068l == null ? C10068l.crashlytics : c10068l;
        c2012l.setFlags(c10068l.loadAd ? c2012l.getFlags() | 128 : c2012l.getFlags() & (-129));
        int i26 = c10068l.yandex;
        if (i26 == 1) {
            c2012l.setFlags(c2012l.getFlags() | 64);
            c2012l.setHinting(0);
        } else if (i26 == 2) {
            c2012l.getFlags();
            c2012l.setHinting(1);
        } else if (i26 == 3) {
            c2012l.getFlags();
            c2012l.setHinting(0);
        } else {
            c2012l.getFlags();
        }
        int size8 = list.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i27);
            if (((C15012l) obj).yandex instanceof C14264l) {
                break;
            } else {
                i27++;
            }
        }
        boolean z4 = obj != null;
        long j4 = c14264l5.loadAd;
        C6886l c6886l2 = c14264l5.crashlytics;
        C11617l c11617l = c14264l5.amazon;
        String str2 = c14264l5.mopub;
        InterfaceC12750l interfaceC12750l = c14264l5.yandex;
        C16810l c16810l = c14264l5.isPro;
        C10537l c10537l2 = c14264l5.firebase;
        long j5 = c14264l5.admob;
        long jLoadAd4 = C1794l.loadAd(j4);
        boolean z5 = z4;
        if (C12735l.yandex(jLoadAd4, 4294967296L)) {
            c2012l.setTextSize(interfaceC13490l.mo871l(j4));
        } else if (C12735l.yandex(jLoadAd4, 8589934592L)) {
            c2012l.setTextSize(C1794l.crashlytics(j4) * c2012l.getTextSize());
        }
        AbstractC17569l abstractC17569l2 = c14264l5.billing;
        if (abstractC17569l2 != null || c11617l != null || c6886l2 != null) {
            if (c6886l2 == null) {
                c6886l = C6886l.f14425l;
            }
            if (c11617l != null) {
                c6886l = c6886l2;
                i2 = c11617l.yandex;
            } else {
                c6886l = c6886l2;
                i2 = 0;
            }
            C8689l c8689l = c14264l5.purchase;
            int i28 = c8689l != null ? c8689l.yandex : 65535;
            C14442l c14442l = (C14442l) c4508l.f9146l;
            InterfaceC16115l interfaceC16115lLoadAd = ((C7620l) c14442l.f28293l).loadAd(abstractC17569l2, c6886l, i2, i28);
            if (interfaceC16115lLoadAd instanceof C8902l) {
                typeface = (Typeface) ((C8902l) interfaceC16115lLoadAd).f18295l;
            } else {
                C4816l c4816l = new C4816l(interfaceC16115lLoadAd, c14442l.f28292l);
                c14442l.f28292l = c4816l;
                typeface = (Typeface) c4816l.f9862l;
            }
            c2012l.setTypeface(typeface);
        }
        if (c10537l2 != null) {
            C10537l c10537l3 = C10537l.f21447l;
            InterfaceC12165l interfaceC12165l = AbstractC4189l.yandex;
            if (!c10537l2.equals(interfaceC12165l.mo3369default())) {
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC11965l.signatures(c2012l, c10537l2);
                } else {
                    c2012l.setTextLocale((c10537l2.f21449l.isEmpty() ? interfaceC12165l.mo3369default().amazon() : c10537l2.amazon()).yandex);
                }
            }
        }
        if (str2 != null && !str2.equals("")) {
            c2012l.setFontFeatureSettings(str2);
        }
        if (c16810l != null && !c16810l.equals(C16810l.crashlytics)) {
            c2012l.setTextScaleX(c2012l.getTextScaleX() * c16810l.yandex);
            c2012l.setTextSkewX(c2012l.getTextSkewX() + c16810l.loadAd);
        }
        c2012l.amazon(interfaceC12750l.loadAd());
        c2012l.crashlytics(interfaceC12750l.purchase(), 9205357640488583168L, interfaceC12750l.yandex());
        c2012l.billing(c14264l5.vip);
        c2012l.mopub(c14264l5.remoteconfig);
        c2012l.purchase(c14264l5.startapp);
        if (C12735l.yandex(C1794l.loadAd(j5), 4294967296L) && C1794l.crashlytics(j5) != 0.0f) {
            float textScaleX = c2012l.getTextScaleX() * c2012l.getTextSize();
            float fMo871l = interfaceC13490l.mo871l(j5);
            if (textScaleX != 0.0f) {
                c2012l.setLetterSpacing(fMo871l / textScaleX);
            }
        } else if (C12735l.yandex(C1794l.loadAd(j5), 8589934592L)) {
            c2012l.setLetterSpacing(C1794l.crashlytics(j5));
        }
        long j6 = c14264l5.smaato;
        C10524l c10524l = c14264l5.subs;
        boolean z6 = z5 && C12735l.yandex(C1794l.loadAd(j5), 4294967296L) && C1794l.crashlytics(j5) != 0.0f;
        long j7 = C9735l.firebase;
        boolean z7 = (C9735l.crashlytics(j6, j7) || C9735l.crashlytics(j6, C9735l.isPro)) ? false : true;
        boolean z8 = (c10524l == null || Float.compare(c10524l.yandex, 0.0f) == 0) ? false : true;
        C14264l c14264l6 = (z6 || z7 || z8) ? new C14264l(0L, 0L, null, null, null, null, null, z6 ? j5 : C1794l.crashlytics, z8 ? c10524l : null, null, null, z7 ? j6 : j7, null, null, 63103) : null;
        List list7 = this.f28287l;
        if (c14264l6 != null) {
            int size9 = list7.size() + 1;
            ArrayList arrayList3 = new ArrayList(size9);
            int i29 = 0;
            while (i29 < size9) {
                arrayList3.add(i29 == 0 ? new C15012l(c14264l6, 0, this.f28291l.length()) : (C15012l) this.f28287l.get(i29 - 1));
                i29++;
            }
            list7 = arrayList3;
        }
        String str3 = this.f28291l;
        float textSize = this.f28288l.getTextSize();
        C11090l c11090l2 = this.f28290l;
        List list8 = this.f28294l;
        InterfaceC13490l interfaceC13490l4 = this.f28297l;
        boolean z9 = this.f28298l;
        C6153l c6153l = AbstractC16794l.yandex;
        if (z9 && C12304l.amazon()) {
            C10891l c10891l = c11090l2.crashlytics;
            C8405l c8405l = (c10891l == null || (c4361l2 = c10891l.loadAd) == null) ? null : new C8405l(c4361l2.loadAd);
            charSequenceMopub = C12304l.yandex().mopub(0, str3.length(), (c8405l != null && c8405l.yandex == 2) ? 1 : 0, str3);
        } else {
            charSequenceMopub = str3;
        }
        if (!list7.isEmpty() || !list8.isEmpty() || !AbstractC8576l.yandex(c11090l2.loadAd.amazon, C13299l.crashlytics) || (c11090l2.loadAd.crashlytics & 1095216660480L) != 0) {
            charSequence = charSequenceMopub;
            Spannable spannableString = charSequenceMopub instanceof Spannable ? (Spannable) charSequenceMopub : new SpannableString(charSequenceMopub);
            C14264l c14264l7 = c11090l2.yandex;
            C9077l c9077l5 = c11090l2.loadAd;
            if (AbstractC8576l.yandex(c14264l7.remoteconfig, C9867l.crashlytics)) {
                spannableString.setSpan(AbstractC16794l.yandex, 0, str3.length(), 33);
            }
            C10891l c10891l2 = c11090l2.crashlytics;
            if (((c10891l2 == null || (c4361l = c10891l2.loadAd) == null) ? false : c4361l.yandex) && c9077l5.billing == null) {
                float fAmazon = AbstractC9027l.amazon(c9077l5.crashlytics, textSize, interfaceC13490l4);
                if (!Float.isNaN(fAmazon)) {
                    spannableString.setSpan(new C18490l(fAmazon), 0, spannableString.length(), 33);
                }
            } else {
                C3183l c3183l = c9077l5.billing;
                c3183l = c3183l == null ? C3183l.amazon : c3183l;
                float fAmazon2 = AbstractC9027l.amazon(c9077l5.crashlytics, textSize, interfaceC13490l4);
                if (!Float.isNaN(fAmazon2)) {
                    int length = (spannableString.length() == 0 || AbstractC12024l.m3320else(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i30 = c3183l.loadAd;
                    i3 = 0;
                    spannableString.setSpan(new C9877l(fAmazon2, length, (i30 & 1) > 0, (i30 & 16) > 0, c3183l.yandex, c3183l.crashlytics), 0, spannableString.length(), 33);
                }
                c13299l = c9077l5.amazon;
                if (c13299l != null) {
                    i23 = i3;
                    j2 = c13299l.yandex;
                    list3 = list7;
                    j3 = c13299l.loadAd;
                    c9077l = c9077l5;
                    if ((C1794l.yandex(j2, AbstractC7039l.isPro(i23)) || !C1794l.yandex(j3, AbstractC7039l.isPro(i23))) && (j2 & 1095216660480L) != r12 && (j3 & 1095216660480L) != 0) {
                        jLoadAd2 = C1794l.loadAd(j2);
                        if (C12735l.yandex(jLoadAd2, 4294967296L)) {
                            fCrashlytics = interfaceC13490l4.mo871l(j2);
                        } else if (C12735l.yandex(jLoadAd2, 8589934592L)) {
                            fCrashlytics = C1794l.crashlytics(j2) * textSize;
                        } else {
                            fCrashlytics = 0.0f;
                        }
                        jLoadAd3 = C1794l.loadAd(j3);
                        if (C12735l.yandex(jLoadAd3, 4294967296L)) {
                            fCrashlytics2 = interfaceC13490l4.mo871l(j3);
                        } else if (C12735l.yandex(jLoadAd3, 8589934592L)) {
                            fCrashlytics2 = C1794l.crashlytics(j3) * textSize;
                        } else {
                            fCrashlytics2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fCrashlytics), (int) Math.ceil(fCrashlytics2)), 0, spannableString.length(), 33);
                    }
                } else {
                    list3 = list7;
                    c9077l = c9077l5;
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                i4 = 0;
                while (i4 < size) {
                    List list9 = list3;
                    c15012l4 = (C15012l) list9.get(i4);
                    obj3 = c15012l4.yandex;
                    if (obj3 instanceof C14264l) {
                        c14264l4 = (C14264l) obj3;
                        if (c14264l4.billing != null && c14264l4.amazon == null && c14264l4.crashlytics == null) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3 || ((C14264l) obj3).purchase != null) {
                            arrayList.add(c15012l4);
                        }
                    }
                    i4++;
                    list3 = list9;
                }
                list4 = list3;
                c14264l = c11090l2.yandex;
                abstractC17569l = c14264l.billing;
                if (abstractC17569l != null && c14264l.amazon == null && c14264l.crashlytics == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && c14264l.purchase == null) {
                    c14264l2 = null;
                } else {
                    c14264l2 = new C14264l(0L, 0L, c14264l.crashlytics, c14264l.amazon, c14264l.purchase, abstractC17569l, null, 0L, null, null, null, 0L, null, null, 65475);
                }
                c3091l = new C3091l(spannableString, c4508l, 10);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        C15012l c15012l5 = (C15012l) arrayList.get(i6);
                        iArr[i6] = c15012l5.loadAd;
                        iArr[i6 + size2] = c15012l5.crashlytics;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 != 0) {
                        C1759l.firebase("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            c14264l3 = c14264l2;
                            i11 = i8;
                        } else {
                            size4 = arrayList.size();
                            c14264lCrashlytics = c14264l2;
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList4 = arrayList;
                                C15012l c15012l6 = (C15012l) arrayList.get(i10);
                                C14264l c14264l8 = c14264l2;
                                i12 = c15012l6.loadAd;
                                int i31 = i8;
                                i13 = c15012l6.crashlytics;
                                if (i12 == i13 && AbstractC0255l.loadAd(i7, i9, i12, i13)) {
                                    C14264l c14264l9 = (C14264l) c15012l6.yandex;
                                    c14264lCrashlytics = c14264lCrashlytics == null ? c14264l9 : c14264lCrashlytics.crashlytics(c14264l9);
                                }
                                i10++;
                                arrayList = arrayList4;
                                c14264l2 = c14264l8;
                                i8 = i31;
                            }
                            arrayList2 = arrayList;
                            c14264l3 = c14264l2;
                            i11 = i8;
                            if (c14264lCrashlytics != null) {
                                c3091l.invoke(c14264lCrashlytics, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        c9077l = c9077l;
                        arrayList = arrayList2;
                        c14264l2 = c14264l3;
                    }
                } else if (!arrayList.isEmpty()) {
                    C14264l c14264l10 = (C14264l) ((C15012l) arrayList.get(0)).yandex;
                    c3091l.invoke(c14264l2 != null ? c14264l2.crashlytics(c14264l10) : c14264l10, Integer.valueOf(((C15012l) arrayList.get(0)).loadAd), Integer.valueOf(((C15012l) arrayList.get(0)).crashlytics));
                }
                c9077l2 = c9077l;
                size5 = list4.size();
                i14 = 0;
                z2 = false;
                while (i14 < size5) {
                    c15012l3 = (C15012l) list4.get(i14);
                    obj2 = c15012l3.yandex;
                    if (obj2 instanceof C14264l) {
                        i20 = c15012l3.loadAd;
                        int i32 = c15012l3.crashlytics;
                        if (i20 >= 0 || i20 >= spannableString.length() || i32 <= i20 || i32 > spannableString.length()) {
                            size5 = size5;
                            interfaceC13490l3 = interfaceC13490l4;
                            c9077l3 = c9077l2;
                            z2 = z2;
                        } else {
                            C14264l c14264l11 = (C14264l) obj2;
                            long j8 = c14264l11.admob;
                            C10524l c10524l2 = c14264l11.subs;
                            InterfaceC12750l interfaceC12750l2 = c14264l11.yandex;
                            if (c10524l2 != null) {
                                spannableString.setSpan(new C0537l(0, c10524l2.yandex), i20, i32, 33);
                            }
                            AbstractC9027l.purchase(spannableString, interfaceC12750l2.loadAd(), i20, i32);
                            AbstractC9544l abstractC9544lPurchase = interfaceC12750l2.purchase();
                            float fYandex = interfaceC12750l2.yandex();
                            if (abstractC9544lPurchase != null) {
                                if (abstractC9544lPurchase instanceof C8990l) {
                                    AbstractC9027l.purchase(spannableString, ((C8990l) abstractC9544lPurchase).yandex, i20, i32);
                                } else {
                                    spannableString.setSpan(new C16509l((AbstractC17404l) abstractC9544lPurchase, fYandex), i20, i32, 33);
                                }
                            }
                            C9867l c9867l = c14264l11.remoteconfig;
                            if (c9867l != null) {
                                int i33 = c9867l.yandex;
                                i21 = 33;
                                spannableString.setSpan(new C11240l((i33 | 1) == i33, (i33 | 2) == i33), i20, i32, 33);
                            } else {
                                i21 = 33;
                            }
                            int i34 = i21;
                            c9077l3 = c9077l2;
                            AbstractC9027l.billing(spannableString, c14264l11.loadAd, interfaceC13490l4, i20, i32);
                            String str4 = c14264l11.mopub;
                            if (str4 != null) {
                                spannableString.setSpan(new C17637l(0, str4), i20, i32, i34);
                            }
                            C16810l c16810l2 = c14264l11.isPro;
                            if (c16810l2 != null) {
                                spannableString.setSpan(new ScaleXSpan(c16810l2.yandex), i20, i32, i34);
                                spannableString.setSpan(new C0537l(1, c16810l2.loadAd), i20, i32, i34);
                            }
                            AbstractC9027l.mopub(spannableString, c14264l11.firebase, i20, i32);
                            interfaceC13490l3 = interfaceC13490l4;
                            long j9 = c14264l11.smaato;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(AbstractC12953l.startapp(j9)), i20, i32, i34);
                            }
                            C0387l c0387l = c14264l11.vip;
                            if (c0387l != null) {
                                long j10 = c0387l.loadAd;
                                int iStartapp = AbstractC12953l.startapp(c0387l.yandex);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = c0387l.crashlytics;
                                C14860l c14860l = new C14860l(fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f, iStartapp);
                                i22 = 33;
                                spannableString.setSpan(c14860l, i20, i32, 33);
                            } else {
                                i22 = i34;
                            }
                            AbstractC3239l abstractC3239l = c14264l11.startapp;
                            if (abstractC3239l != null) {
                                spannableString.setSpan(new C2111l(abstractC3239l), i20, i32, i22);
                            }
                            z2 = (C12735l.yandex(C1794l.loadAd(j8), 4294967296L) || C12735l.yandex(C1794l.loadAd(j8), 8589934592L)) ? true : z2;
                        }
                        z2 = z2;
                    } else {
                        size5 = size5;
                        interfaceC13490l3 = interfaceC13490l4;
                        c9077l3 = c9077l2;
                        z2 = z2;
                        z2 = z2;
                    }
                    i14++;
                    c9077l2 = c9077l3;
                    interfaceC13490l4 = interfaceC13490l3;
                    size5 = size5;
                }
                C9077l c9077l6 = c9077l2;
                interfaceC13490l2 = interfaceC13490l4;
                if (z2) {
                    size7 = list4.size();
                    i17 = 0;
                    while (i17 < size7) {
                        c15012l2 = (C15012l) list4.get(i17);
                        interfaceC18302l = (InterfaceC18302l) c15012l2.yandex;
                        if (interfaceC18302l instanceof C14264l) {
                            i19 = c15012l2.loadAd;
                            int i35 = c15012l2.crashlytics;
                            if (i19 >= 0 || i19 >= spannableString.length() || i35 <= i19 || i35 > spannableString.length()) {
                                list6 = list8;
                                i18 = i17;
                            } else {
                                long j11 = ((C14264l) interfaceC18302l).admob;
                                long jLoadAd5 = C1794l.loadAd(j11);
                                list6 = list8;
                                InterfaceC13490l interfaceC13490l5 = interfaceC13490l2;
                                if (C12735l.yandex(jLoadAd5, 4294967296L)) {
                                    interfaceC13490l2 = interfaceC13490l5;
                                    c6458l = new C4145l(interfaceC13490l2.mo871l(j11));
                                    i18 = i17;
                                } else {
                                    interfaceC13490l2 = interfaceC13490l5;
                                    i18 = i17;
                                    c6458l = C12735l.yandex(jLoadAd5, 8589934592L) ? new C6458l(C1794l.crashlytics(j11)) : null;
                                }
                                if (c6458l != null) {
                                    spannableString.setSpan(c6458l, i19, i35, 33);
                                }
                            }
                        } else {
                            list6 = list8;
                            i18 = i17;
                        }
                        i17 = i18 + 1;
                        list8 = list6;
                    }
                }
                list5 = list8;
                c13299l2 = c9077l6.amazon;
                if (c13299l2 != null) {
                    j = c13299l2.yandex;
                    jLoadAd = C1794l.loadAd(j);
                    if (C12735l.yandex(jLoadAd, 4294967296L)) {
                        interfaceC13490l2.mo871l(j);
                    } else if (C12735l.yandex(jLoadAd, 8589934592L)) {
                        C1794l.crashlytics(j);
                    }
                }
                size6 = list4.size();
                for (i15 = 0; i15 < size6; i15++) {
                    Object obj4 = ((C15012l) list4.get(i15)).yandex;
                }
                charSequence = spannableString;
                if (list5.size() > 0) {
                    c15012l = (C15012l) list5.get(0);
                    if (c15012l.yandex == null) {
                        C18725l.loadAd();
                        throw null;
                    }
                    for (Object obj5 : spannableString.getSpans(c15012l.loadAd, c15012l.crashlytics, C2085l.class)) {
                        spannableString.removeSpan((C2085l) obj5);
                    }
                    throw null;
                }
            }
            i3 = 0;
            c13299l = c9077l5.amazon;
            if (c13299l != null) {
                i23 = i3;
                j2 = c13299l.yandex;
                list3 = list7;
                j3 = c13299l.loadAd;
                c9077l = c9077l5;
                if (C1794l.yandex(j2, AbstractC7039l.isPro(i23))) {
                    jLoadAd2 = C1794l.loadAd(j2);
                    if (C12735l.yandex(jLoadAd2, 4294967296L)) {
                        fCrashlytics = interfaceC13490l4.mo871l(j2);
                    } else if (C12735l.yandex(jLoadAd2, 8589934592L)) {
                        fCrashlytics = C1794l.crashlytics(j2) * textSize;
                    } else {
                        fCrashlytics = 0.0f;
                    }
                    jLoadAd3 = C1794l.loadAd(j3);
                    if (C12735l.yandex(jLoadAd3, 4294967296L)) {
                        fCrashlytics2 = interfaceC13490l4.mo871l(j3);
                    } else if (C12735l.yandex(jLoadAd3, 8589934592L)) {
                        fCrashlytics2 = C1794l.crashlytics(j3) * textSize;
                    } else {
                        fCrashlytics2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fCrashlytics), (int) Math.ceil(fCrashlytics2)), 0, spannableString.length(), 33);
                } else {
                    jLoadAd2 = C1794l.loadAd(j2);
                    if (C12735l.yandex(jLoadAd2, 4294967296L)) {
                        fCrashlytics = interfaceC13490l4.mo871l(j2);
                    } else if (C12735l.yandex(jLoadAd2, 8589934592L)) {
                        fCrashlytics = C1794l.crashlytics(j2) * textSize;
                    } else {
                        fCrashlytics = 0.0f;
                    }
                    jLoadAd3 = C1794l.loadAd(j3);
                    if (C12735l.yandex(jLoadAd3, 4294967296L)) {
                        fCrashlytics2 = interfaceC13490l4.mo871l(j3);
                    } else if (C12735l.yandex(jLoadAd3, 8589934592L)) {
                        fCrashlytics2 = C1794l.crashlytics(j3) * textSize;
                    } else {
                        fCrashlytics2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fCrashlytics), (int) Math.ceil(fCrashlytics2)), 0, spannableString.length(), 33);
                }
            } else {
                list3 = list7;
                c9077l = c9077l5;
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            i4 = 0;
            while (i4 < size) {
                List list10 = list3;
                c15012l4 = (C15012l) list10.get(i4);
                obj3 = c15012l4.yandex;
                if (obj3 instanceof C14264l) {
                    c14264l4 = (C14264l) obj3;
                    if (c14264l4.billing != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        arrayList.add(c15012l4);
                    } else {
                        arrayList.add(c15012l4);
                    }
                }
                i4++;
                list3 = list10;
            }
            list4 = list3;
            c14264l = c11090l2.yandex;
            abstractC17569l = c14264l.billing;
            if (abstractC17569l != null) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                c14264l2 = new C14264l(0L, 0L, c14264l.crashlytics, c14264l.amazon, c14264l.purchase, abstractC17569l, null, 0L, null, null, null, 0L, null, null, 65475);
            } else {
                c14264l2 = new C14264l(0L, 0L, c14264l.crashlytics, c14264l.amazon, c14264l.purchase, abstractC17569l, null, 0L, null, null, null, 0L, null, null, 65475);
            }
            c3091l = new C3091l(spannableString, c4508l, 10);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    C15012l c15012l7 = (C15012l) arrayList.get(i6);
                    iArr[i6] = c15012l7.loadAd;
                    iArr[i6 + size2] = c15012l7.crashlytics;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 != 0) {
                    C1759l.firebase("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        c14264l3 = c14264l2;
                        i11 = i8;
                    } else {
                        size4 = arrayList.size();
                        c14264lCrashlytics = c14264l2;
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList5 = arrayList;
                            C15012l c15012l8 = (C15012l) arrayList.get(i10);
                            C14264l c14264l12 = c14264l2;
                            i12 = c15012l8.loadAd;
                            int i36 = i8;
                            i13 = c15012l8.crashlytics;
                            if (i12 == i13) {
                            }
                            i10++;
                            arrayList = arrayList5;
                            c14264l2 = c14264l12;
                            i8 = i36;
                        }
                        arrayList2 = arrayList;
                        c14264l3 = c14264l2;
                        i11 = i8;
                        if (c14264lCrashlytics != null) {
                            c3091l.invoke(c14264lCrashlytics, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8 = i11 + 1;
                    c9077l = c9077l;
                    arrayList = arrayList2;
                    c14264l2 = c14264l3;
                }
            } else if (!arrayList.isEmpty()) {
                C14264l c14264l13 = (C14264l) ((C15012l) arrayList.get(0)).yandex;
                c3091l.invoke(c14264l2 != null ? c14264l2.crashlytics(c14264l13) : c14264l13, Integer.valueOf(((C15012l) arrayList.get(0)).loadAd), Integer.valueOf(((C15012l) arrayList.get(0)).crashlytics));
            }
            c9077l2 = c9077l;
            size5 = list4.size();
            i14 = 0;
            z2 = false;
            while (i14 < size5) {
                c15012l3 = (C15012l) list4.get(i14);
                obj2 = c15012l3.yandex;
                if (obj2 instanceof C14264l) {
                    i20 = c15012l3.loadAd;
                    int i37 = c15012l3.crashlytics;
                    if (i20 >= 0) {
                        size5 = size5;
                        interfaceC13490l3 = interfaceC13490l4;
                        c9077l3 = c9077l2;
                        z2 = z2;
                        z2 = z2;
                    } else {
                        size5 = size5;
                        interfaceC13490l3 = interfaceC13490l4;
                        c9077l3 = c9077l2;
                        z2 = z2;
                        z2 = z2;
                    }
                } else {
                    size5 = size5;
                    interfaceC13490l3 = interfaceC13490l4;
                    c9077l3 = c9077l2;
                    z2 = z2;
                    z2 = z2;
                }
                i14++;
                c9077l2 = c9077l3;
                interfaceC13490l4 = interfaceC13490l3;
                size5 = size5;
            }
            C9077l c9077l7 = c9077l2;
            interfaceC13490l2 = interfaceC13490l4;
            if (z2) {
                size7 = list4.size();
                i17 = 0;
                while (i17 < size7) {
                    c15012l2 = (C15012l) list4.get(i17);
                    interfaceC18302l = (InterfaceC18302l) c15012l2.yandex;
                    if (interfaceC18302l instanceof C14264l) {
                        i19 = c15012l2.loadAd;
                        int i38 = c15012l2.crashlytics;
                        if (i19 >= 0) {
                            list6 = list8;
                            i18 = i17;
                        } else {
                            list6 = list8;
                            i18 = i17;
                        }
                    } else {
                        list6 = list8;
                        i18 = i17;
                    }
                    i17 = i18 + 1;
                    list8 = list6;
                }
            }
            list5 = list8;
            c13299l2 = c9077l7.amazon;
            if (c13299l2 != null) {
                j = c13299l2.yandex;
                jLoadAd = C1794l.loadAd(j);
                if (C12735l.yandex(jLoadAd, 4294967296L)) {
                    interfaceC13490l2.mo871l(j);
                } else if (C12735l.yandex(jLoadAd, 8589934592L)) {
                    C1794l.crashlytics(j);
                }
            }
            size6 = list4.size();
            while (i15 < size6) {
                Object obj6 = ((C15012l) list4.get(i15)).yandex;
            }
            charSequence = spannableString;
            if (list5.size() > 0) {
                c15012l = (C15012l) list5.get(0);
                if (c15012l.yandex == null) {
                    C18725l.loadAd();
                    throw null;
                }
                while (i16 < r1) {
                    spannableString.removeSpan((C2085l) obj5);
                }
                throw null;
            }
        }
        charSequence = charSequenceMopub;
        this.f28289l = charSequence;
        this.f28296l = new C17909l(charSequence, this.f28288l, this.f28295l);
    }

    @Override // defpackage.InterfaceC4452l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final boolean mo1545l() {
        C4816l c4816l = this.f28292l;
        if (c4816l != null ? c4816l.billing() : false) {
            return true;
        }
        if (!this.f28298l && AbstractC13359l.yandex(this.f28290l)) {
            C16543l c16543l = C5351l.yandex;
            C16543l c16543l2 = C5351l.yandex;
            InterfaceC12244l interfaceC12244lAdcel = (InterfaceC12244l) c16543l2.f32482l;
            if (interfaceC12244lAdcel == null) {
                if (C12304l.amazon()) {
                    interfaceC12244lAdcel = c16543l2.adcel();
                    c16543l2.f32482l = interfaceC12244lAdcel;
                } else {
                    interfaceC12244lAdcel = AbstractC16358l.yandex;
                }
            }
            if (((Boolean) interfaceC12244lAdcel.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC4452l
    /* JADX INFO: renamed from: lٍؘؘ */
    public final float mo1546l() {
        C17909l c17909l = this.f28296l;
        float f = c17909l.purchase;
        TextPaint textPaint = c17909l.loadAd;
        if (!Float.isNaN(f)) {
            return c17909l.purchase;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c17909l.yandex;
        lineInstance.setText(new C3942l(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, AbstractC16131l.yandex);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C8934l(i, next, 1));
            } else {
                C8934l c8934l = (C8934l) priorityQueue.peek();
                if (c8934l != null && c8934l.f15487l - c8934l.f15488l < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new C8934l(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                C4875l.firebase();
                return 0.0f;
            }
            C8934l c8934l2 = (C8934l) it.next();
            desiredWidth = Layout.getDesiredWidth(c17909l.loadAd(), c8934l2.f15488l, c8934l2.f15487l, textPaint);
            while (it.hasNext()) {
                C8934l c8934l3 = (C8934l) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c17909l.loadAd(), c8934l3.f15488l, c8934l3.f15487l, textPaint));
            }
        }
        c17909l.purchase = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.InterfaceC4452l
    /* JADX INFO: renamed from: lؘْٔ */
    public final float mo1547l() {
        return this.f28296l.crashlytics();
    }
}
