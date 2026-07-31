package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؚ۟ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7546l implements InterfaceC4190l, InterfaceC2435l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f15545l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f15546l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f15547l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f15548l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f15549l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f15550l;

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:140:0x021d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0220  */
    /* JADX WARN: Code duplicated, block: B:143:0x0237  */
    /* JADX WARN: Code duplicated, block: B:145:0x024e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0252 A[LOOP:1: B:146:0x0250->B:147:0x0252, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x027f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x029b  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:165:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x024e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x0283, please report this as an issue */
    public C7546l(C14442l c14442l, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        char c;
        C18118l c18118lBilling;
        TextUtils.TruncateAt truncateAt3;
        C7546l c7546l;
        int i8;
        TextUtils.TruncateAt truncateAt4;
        int i9;
        Layout layout;
        Spanned spanned;
        C16509l[] c16509lArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i10;
        Object obj;
        int spanEnd;
        int iMopub;
        boolean z;
        boolean z2;
        boolean z3;
        C8896l c8896l;
        float fFirebase;
        int iLoadAd;
        float fIsPro;
        int iLoadAd2;
        int i11;
        int i12;
        this.f15545l = c14442l;
        this.f15546l = i;
        this.f15547l = j;
        if (C15519l.subs(j) != 0 || C15519l.isPro(j) != 0) {
            AbstractC1786l.yandex("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        int i13 = 1;
        if (i < 1) {
            AbstractC1786l.yandex("maxLines should be greater than 0");
        }
        C11090l c11090l = c14442l.f28290l;
        CharSequence charSequence2 = c14442l.f28289l;
        if (i2 == 2) {
            i3 = 0;
            if (!C1794l.yandex(c11090l.yandex.admob, AbstractC7039l.isPro(0)) && !C1794l.yandex(c11090l.yandex.admob, C1794l.crashlytics) && (i12 = c11090l.loadAd.yandex) != 0 && i12 != 5 && i12 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!AbstractC6616l.crashlytics(spannableString, C1267l.class)) {
                    spannableString.setSpan(new C1267l(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        this.f15548l = charSequence2;
        C9077l c9077l = c11090l.loadAd;
        int i14 = c9077l.yandex;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i16 = i14 == 4 ? 1 : i3;
        int i17 = c9077l.admob == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = c9077l.mopub;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 != 1) {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i7;
            if (i2 == i6) {
                if (i2 == 5) {
                    truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                } else if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                charSequence2 = charSequence2;
                truncateAt = truncateAt2;
                c = ' ';
                i13 = 1;
                c18118lBilling = billing(i15, i16, truncateAt, i, i17, i4, i5, i7, charSequence2);
                truncateAt3 = truncateAt;
                CharSequence charSequence3 = charSequence2;
                Layout layout2 = c18118lBilling.billing;
                if (Build.VERSION.SDK_INT < 35 || c14442l.f28288l.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                    c7546l = this;
                    i8 = i;
                    truncateAt4 = truncateAt3;
                    i9 = 2;
                } else {
                    int ellipsisStart = layout2.getEllipsisStart(0);
                    int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                    CharSequence charSequenceSubSequence = charSequence3.subSequence(0, ellipsisStart);
                    CharSequence charSequenceSubSequence2 = charSequence3.subSequence(ellipsisCount, charSequence3.length());
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    charSequenceArr[0] = charSequenceSubSequence;
                    charSequenceArr[i13] = "…";
                    i9 = 2;
                    charSequenceArr[2] = charSequenceSubSequence2;
                    CharSequence charSequenceConcat = TextUtils.concat(charSequenceArr);
                    c7546l = this;
                    i8 = i;
                    truncateAt4 = truncateAt3;
                    c18118lBilling = c7546l.billing(i15, i16, truncateAt4, i8, i17, i4, i5, i7, charSequenceConcat);
                }
                int i22 = c18118lBilling.mopub;
                if (i2 == i9 || c18118lBilling.yandex() <= C15519l.mopub(j) || i8 <= i13) {
                    c7546l.f15549l = c18118lBilling;
                } else {
                    int iMopub2 = C15519l.mopub(j);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if (c18118lBilling.purchase(i23) > iMopub2) {
                            i22 = i23;
                            break;
                        }
                    }
                    if (i22 >= 0 && i22 != c7546l.f15546l) {
                        c18118lBilling = c7546l.billing(i15, i16, truncateAt4, i22 < 1 ? 1 : i22, i17, i4, i5, i7, (CharSequence) c7546l.f15548l);
                    }
                    c7546l.f15549l = c18118lBilling;
                }
                ((C14442l) c7546l.f15545l).f28288l.crashlytics(c11090l.loadAd(), (((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c), c11090l.yandex.yandex.yandex());
                layout = ((C18118l) c7546l.f15549l).billing;
                if (layout.getText() instanceof Spanned) {
                    spanned = (Spanned) layout.getText();
                    if (spanned.nextSpanTransition(-1, spanned.length(), C16509l.class) != spanned.length()) {
                        c16509lArr = (C16509l[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), C16509l.class);
                    } else {
                        c16509lArr = null;
                    }
                } else {
                    c16509lArr = null;
                }
                if (c16509lArr != null) {
                    for (C16509l c16509l : c16509lArr) {
                        c16509l.f32275l.setValue(new C14174l((((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c)));
                    }
                }
                charSequence = (CharSequence) c7546l.f15548l;
                if (charSequence instanceof Spanned) {
                    spanned2 = (Spanned) charSequence;
                    Object[] spans = spanned2.getSpans(0, charSequence.length(), C7624l.class);
                    arrayList = new ArrayList(spans.length);
                    for (Object obj2 : spans) {
                        C7624l c7624l = (C7624l) obj2;
                        int spanStart = spanned2.getSpanStart(c7624l);
                        spanEnd = spanned2.getSpanEnd(c7624l);
                        iMopub = ((C18118l) c7546l.f15549l).mopub(spanStart);
                        if (iMopub >= c7546l.f15546l) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (((C18118l) c7546l.f15549l).billing.getEllipsisCount(iMopub) > 0) {
                            z2 = false;
                        } else if (spanEnd > ((C18118l) c7546l.f15549l).billing.getEllipsisStart(iMopub) + ((C18118l) c7546l.f15549l).billing.getLineStart(iMopub)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (spanEnd > ((C18118l) c7546l.f15549l).billing(iMopub)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && !z3 && !z) {
                            boolean z4 = ((C18118l) c7546l.f15549l).billing.getParagraphDirection(iMopub) == 1;
                            boolean zIsRtlCharAt = ((C18118l) c7546l.f15549l).billing.isRtlCharAt(spanStart);
                            if (!z4 || zIsRtlCharAt) {
                                if (z4 && zIsRtlCharAt) {
                                    fIsPro = ((C18118l) c7546l.f15549l).firebase(spanStart, false);
                                    iLoadAd2 = c7624l.loadAd();
                                } else {
                                    C18118l c18118l = (C18118l) c7546l.f15549l;
                                    if (zIsRtlCharAt) {
                                        fIsPro = c18118l.isPro(spanStart, false);
                                        iLoadAd2 = c7624l.loadAd();
                                    } else {
                                        fFirebase = c18118l.firebase(spanStart, false);
                                        iLoadAd = c7624l.loadAd();
                                    }
                                }
                                fFirebase = fIsPro - iLoadAd2;
                                C18118l c18118l2 = (C18118l) c7546l.f15549l;
                                c7624l.getClass();
                                float fAmazon = c18118l2.amazon(iMopub) - c7624l.yandex();
                                c8896l = new C8896l(fFirebase, fAmazon, fIsPro, c7624l.yandex() + fAmazon);
                            } else {
                                fFirebase = ((C18118l) c7546l.f15549l).isPro(spanStart, false);
                                iLoadAd = c7624l.loadAd();
                            }
                            fIsPro = iLoadAd + fFirebase;
                            C18118l c18118l3 = (C18118l) c7546l.f15549l;
                            c7624l.getClass();
                            float fAmazon2 = c18118l3.amazon(iMopub) - c7624l.yandex();
                            c8896l = new C8896l(fFirebase, fAmazon2, fIsPro, c7624l.yandex() + fAmazon2);
                        }
                        arrayList.add(c8896l);
                    }
                    obj = arrayList;
                } else {
                    obj = C2580l.f5619l;
                }
                c7546l.f15550l = obj;
            }
            truncateAt = TextUtils.TruncateAt.END;
            c = ' ';
            c18118lBilling = billing(i15, i16, truncateAt, i, i17, i4, i5, i7, charSequence2);
            truncateAt3 = truncateAt;
            CharSequence charSequence4 = charSequence2;
            Layout layout3 = c18118lBilling.billing;
            if (Build.VERSION.SDK_INT < 35) {
                c7546l = this;
                i8 = i;
                truncateAt4 = truncateAt3;
                i9 = 2;
            } else {
                c7546l = this;
                i8 = i;
                truncateAt4 = truncateAt3;
                i9 = 2;
            }
            int i24 = c18118lBilling.mopub;
            if (i2 == i9) {
                c7546l.f15549l = c18118lBilling;
            } else {
                c7546l.f15549l = c18118lBilling;
            }
            ((C14442l) c7546l.f15545l).f28288l.crashlytics(c11090l.loadAd(), (((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c), c11090l.yandex.yandex.yandex());
            layout = ((C18118l) c7546l.f15549l).billing;
            if (layout.getText() instanceof Spanned) {
                c16509lArr = null;
            } else {
                spanned = (Spanned) layout.getText();
                if (spanned.nextSpanTransition(-1, spanned.length(), C16509l.class) != spanned.length()) {
                    c16509lArr = (C16509l[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), C16509l.class);
                } else {
                    c16509lArr = null;
                }
            }
            if (c16509lArr != null) {
                while (i11 < r2) {
                    c16509l.f32275l.setValue(new C14174l((((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c)));
                }
            }
            charSequence = (CharSequence) c7546l.f15548l;
            if (charSequence instanceof Spanned) {
                obj = C2580l.f5619l;
            } else {
                spanned2 = (Spanned) charSequence;
                Object[] spans2 = spanned2.getSpans(0, charSequence.length(), C7624l.class);
                arrayList = new ArrayList(spans2.length);
                while (i10 < r4) {
                    C7624l c7624l2 = (C7624l) obj2;
                    int spanStart2 = spanned2.getSpanStart(c7624l2);
                    spanEnd = spanned2.getSpanEnd(c7624l2);
                    iMopub = ((C18118l) c7546l.f15549l).mopub(spanStart2);
                    if (iMopub >= c7546l.f15546l) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((C18118l) c7546l.f15549l).billing.getEllipsisCount(iMopub) > 0) {
                        z2 = false;
                    } else if (spanEnd > ((C18118l) c7546l.f15549l).billing.getEllipsisStart(iMopub) + ((C18118l) c7546l.f15549l).billing.getLineStart(iMopub)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > ((C18118l) c7546l.f15549l).billing(iMopub)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c8896l = z2 ? null : null;
                    arrayList.add(c8896l);
                }
                obj = arrayList;
            }
            c7546l.f15550l = obj;
        }
        i6 = 2;
        i7 = i3;
        if (i2 == i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                truncateAt2 = TextUtils.TruncateAt.START;
            } else {
                truncateAt = null;
            }
            charSequence2 = charSequence2;
            truncateAt = truncateAt2;
            c = ' ';
            i13 = 1;
            c18118lBilling = billing(i15, i16, truncateAt, i, i17, i4, i5, i7, charSequence2);
            truncateAt3 = truncateAt;
            CharSequence charSequence5 = charSequence2;
            Layout layout4 = c18118lBilling.billing;
            if (Build.VERSION.SDK_INT < 35) {
                c7546l = this;
                i8 = i;
                truncateAt4 = truncateAt3;
                i9 = 2;
            } else {
                c7546l = this;
                i8 = i;
                truncateAt4 = truncateAt3;
                i9 = 2;
            }
            int i25 = c18118lBilling.mopub;
            if (i2 == i9) {
                c7546l.f15549l = c18118lBilling;
            } else {
                c7546l.f15549l = c18118lBilling;
            }
            ((C14442l) c7546l.f15545l).f28288l.crashlytics(c11090l.loadAd(), (((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c), c11090l.yandex.yandex.yandex());
            layout = ((C18118l) c7546l.f15549l).billing;
            if (layout.getText() instanceof Spanned) {
                c16509lArr = null;
            } else {
                spanned = (Spanned) layout.getText();
                if (spanned.nextSpanTransition(-1, spanned.length(), C16509l.class) != spanned.length()) {
                    c16509lArr = (C16509l[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), C16509l.class);
                } else {
                    c16509lArr = null;
                }
            }
            if (c16509lArr != null) {
                while (i11 < r2) {
                    c16509l.f32275l.setValue(new C14174l((((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c)));
                }
            }
            charSequence = (CharSequence) c7546l.f15548l;
            if (charSequence instanceof Spanned) {
                obj = C2580l.f5619l;
            } else {
                spanned2 = (Spanned) charSequence;
                Object[] spans3 = spanned2.getSpans(0, charSequence.length(), C7624l.class);
                arrayList = new ArrayList(spans3.length);
                while (i10 < r4) {
                    C7624l c7624l3 = (C7624l) obj2;
                    int spanStart3 = spanned2.getSpanStart(c7624l3);
                    spanEnd = spanned2.getSpanEnd(c7624l3);
                    iMopub = ((C18118l) c7546l.f15549l).mopub(spanStart3);
                    if (iMopub >= c7546l.f15546l) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (((C18118l) c7546l.f15549l).billing.getEllipsisCount(iMopub) > 0) {
                        z2 = false;
                    } else if (spanEnd > ((C18118l) c7546l.f15549l).billing.getEllipsisStart(iMopub) + ((C18118l) c7546l.f15549l).billing.getLineStart(iMopub)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > ((C18118l) c7546l.f15549l).billing(iMopub)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    arrayList.add(c8896l);
                }
                obj = arrayList;
            }
            c7546l.f15550l = obj;
        }
        truncateAt = TextUtils.TruncateAt.END;
        c = ' ';
        c18118lBilling = billing(i15, i16, truncateAt, i, i17, i4, i5, i7, charSequence2);
        truncateAt3 = truncateAt;
        CharSequence charSequence6 = charSequence2;
        Layout layout5 = c18118lBilling.billing;
        if (Build.VERSION.SDK_INT < 35) {
            c7546l = this;
            i8 = i;
            truncateAt4 = truncateAt3;
            i9 = 2;
        } else {
            c7546l = this;
            i8 = i;
            truncateAt4 = truncateAt3;
            i9 = 2;
        }
        int i26 = c18118lBilling.mopub;
        if (i2 == i9) {
            c7546l.f15549l = c18118lBilling;
        } else {
            c7546l.f15549l = c18118lBilling;
        }
        ((C14442l) c7546l.f15545l).f28288l.crashlytics(c11090l.loadAd(), (((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c), c11090l.yandex.yandex.yandex());
        layout = ((C18118l) c7546l.f15549l).billing;
        if (layout.getText() instanceof Spanned) {
            c16509lArr = null;
        } else {
            spanned = (Spanned) layout.getText();
            if (spanned.nextSpanTransition(-1, spanned.length(), C16509l.class) != spanned.length()) {
                c16509lArr = (C16509l[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), C16509l.class);
            } else {
                c16509lArr = null;
            }
        }
        if (c16509lArr != null) {
            while (i11 < r2) {
                c16509l.f32275l.setValue(new C14174l((((long) Float.floatToRawIntBits(c7546l.subs())) & 4294967295L) | (((long) Float.floatToRawIntBits(c7546l.tapsense())) << c)));
            }
        }
        charSequence = (CharSequence) c7546l.f15548l;
        if (charSequence instanceof Spanned) {
            obj = C2580l.f5619l;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans4 = spanned2.getSpans(0, charSequence.length(), C7624l.class);
            arrayList = new ArrayList(spans4.length);
            while (i10 < r4) {
                C7624l c7624l4 = (C7624l) obj2;
                int spanStart4 = spanned2.getSpanStart(c7624l4);
                spanEnd = spanned2.getSpanEnd(c7624l4);
                iMopub = ((C18118l) c7546l.f15549l).mopub(spanStart4);
                if (iMopub >= c7546l.f15546l) {
                    z = true;
                } else {
                    z = false;
                }
                if (((C18118l) c7546l.f15549l).billing.getEllipsisCount(iMopub) > 0) {
                    z2 = false;
                } else if (spanEnd > ((C18118l) c7546l.f15549l).billing.getEllipsisStart(iMopub) + ((C18118l) c7546l.f15549l).billing.getLineStart(iMopub)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (spanEnd > ((C18118l) c7546l.f15549l).billing(iMopub)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(c8896l);
            }
            obj = arrayList;
        }
        c7546l.f15550l = obj;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean Signature(Object obj, int i, Map map) {
        InterfaceC9671l interfaceC9671lYandex = (InterfaceC9671l) obj;
        C3585l c3585l = new C3585l(16);
        C5501l c5501l = (C5501l) this.f15545l;
        InterfaceC7832l interfaceC7832l = (InterfaceC7832l) this.f15549l;
        if (interfaceC9671lYandex != null) {
            C1332l f36749l = ((InterfaceC2851l) interfaceC9671lYandex).getF36799l();
            if (f36749l == null) {
                interfaceC9671lYandex = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lYandex, i, map);
            } else if (!AbstractC8576l.yandex(f36749l.f3419l, interfaceC7832l)) {
                C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                return false;
            }
        } else {
            interfaceC9671lYandex = null;
        }
        realm_value_t realm_value_tVarInmobi = c3585l.inmobi(interfaceC9671lYandex != null ? ((InterfaceC2851l) interfaceC9671lYandex).getF36799l() : null);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f15548l).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_set_insert(ptr$cinterop_release, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, new long[1], zArr);
        boolean z = zArr[0];
        c3585l.tapsense();
        return z;
    }

    @Override // defpackage.InterfaceC2435l
    public int admob() {
        return this.f15546l;
    }

    public void advert(InterfaceC14859l interfaceC14859l, long j, C0387l c0387l, C9867l c9867l, AbstractC3239l abstractC3239l) {
        C2012l c2012l = ((C14442l) this.f15545l).f28288l;
        int i = c2012l.crashlytics;
        c2012l.amazon(j);
        c2012l.billing(c0387l);
        c2012l.mopub(c9867l);
        c2012l.purchase(abstractC3239l);
        c2012l.loadAd(3);
        pro(interfaceC14859l);
        c2012l.loadAd(i);
    }

    @Override // defpackage.InterfaceC4190l
    public int amazon(boolean z, byte[] bArr) {
        C0361l c0361l = (C0361l) this.f15550l;
        byte[] bArr2 = (byte[]) this.f15549l;
        int length = bArr.length * 8;
        if (length > 262144) {
            C8339l.metrica("Number of bits per request limited to 262144");
            return 0;
        }
        if (this.f15547l > 140737488355328L) {
            return -1;
        }
        if (z) {
            purchase(null);
        }
        int length2 = bArr.length;
        byte[] bArr3 = new byte[length2];
        int length3 = bArr.length / bArr2.length;
        c0361l.init(new C13886l((byte[]) this.f15545l));
        for (int i = 0; i < length3; i++) {
            c0361l.update(bArr2, 0, bArr2.length);
            c0361l.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, bArr2.length * i, bArr2.length);
        }
        if (bArr2.length * length3 < length2) {
            c0361l.update(bArr2, 0, bArr2.length);
            c0361l.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, bArr2.length * length3, length2 - (length3 * bArr2.length));
        }
        license((byte) 0, null);
        this.f15547l++;
        System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
        return length;
    }

    public C18118l billing(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        C4361l c4361l;
        float fTapsense = tapsense();
        C14442l c14442l = (C14442l) this.f15545l;
        C2012l c2012l = c14442l.f28288l;
        int i8 = c14442l.f28295l;
        C17909l c17909l = c14442l.f28296l;
        C11090l c11090l = c14442l.f28290l;
        C6153l c6153l = AbstractC16794l.yandex;
        C10891l c10891l = c11090l.crashlytics;
        return new C18118l(charSequence, fTapsense, c2012l, i, truncateAt, i8, (c10891l == null || (c4361l = c10891l.loadAd) == null) ? false : c4361l.yandex, i3, i5, i6, i7, i4, i2, c17909l);
    }

    @Override // defpackage.InterfaceC2435l
    public void clear() {
        AbstractC0653l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC2435l
    public boolean contains(Object obj) {
        InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
        if (interfaceC9671l != null && !AbstractC15011l.subs((InterfaceC2851l) interfaceC9671l)) {
            return false;
        }
        C3585l c3585l = new C3585l(16);
        C1332l c1332l = null;
        if (interfaceC9671l != null) {
            C1332l f36749l = ((InterfaceC2851l) interfaceC9671l).getF36799l();
            c1332l = f36749l != null ? f36749l : null;
            if (c1332l == null) {
                C8339l.metrica("Cannot lookup unmanaged objects in realm");
                return false;
            }
        }
        realm_value_t realm_value_tVarInmobi = c3585l.inmobi(c1332l);
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f15548l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_find(ptr$cinterop_release, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, new long[1], zArr);
        boolean z = zArr[0];
        c3585l.tapsense();
        return z;
    }

    @Override // defpackage.InterfaceC2435l
    public void crashlytics(int i) {
        this.f15546l = i;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean firebase(C15525l c15525l, int i, Map map) {
        return AbstractC0653l.yandex(this, c15525l, i, map);
    }

    @Override // defpackage.InterfaceC2435l
    public Object get(int i) {
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f15548l;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_set_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        int iRealm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
        int i3 = 0;
        for (int i4 : AbstractC5020l.m1673throws(14)) {
            if (AbstractC5020l.inmobi(i4) == iRealm_value_t_type_get) {
                i3 = i4;
                break;
            }
        }
        if (i3 == 0) {
            C11983l.billing(iRealm_value_t_type_get, "Unknown value type: ");
            return null;
        }
        if (1 != i3) {
            InterfaceC1388l interfaceC1388l = (InterfaceC1388l) this.f15550l;
            C5501l c5501l = (C5501l) this.f15545l;
            InterfaceC7832l interfaceC7832l = (InterfaceC7832l) this.f15549l;
            if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0) {
                return AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), interfaceC1388l, c5501l, interfaceC7832l);
            }
        }
        return null;
    }

    public void isVip(InterfaceC14859l interfaceC14859l, AbstractC9544l abstractC9544l, float f, C0387l c0387l, C9867l c9867l, AbstractC3239l abstractC3239l) {
        C2012l c2012l = ((C14442l) this.f15545l).f28288l;
        int i = c2012l.crashlytics;
        float fTapsense = tapsense();
        c2012l.crashlytics(abstractC9544l, (((long) Float.floatToRawIntBits(subs())) & 4294967295L) | (Float.floatToRawIntBits(fTapsense) << 32), f);
        c2012l.billing(c0387l);
        c2012l.mopub(c9867l);
        c2012l.purchase(abstractC3239l);
        c2012l.loadAd(3);
        pro(interfaceC14859l);
        c2012l.loadAd(i);
    }

    public void license(byte b, byte[] bArr) {
        C0361l c0361l = (C0361l) this.f15550l;
        byte[] bArr2 = (byte[]) this.f15545l;
        c0361l.init(new C13886l(bArr2));
        byte[] bArr3 = (byte[]) this.f15549l;
        c0361l.update(bArr3, 0, bArr3.length);
        c0361l.update(b);
        if (bArr != null) {
            c0361l.update(bArr, 0, bArr.length);
        }
        c0361l.doFinal(bArr2, 0);
        c0361l.init(new C13886l(bArr2, 0, bArr2.length));
        c0361l.update(bArr3, 0, bArr3.length);
        c0361l.doFinal(bArr3, 0);
    }

    @Override // defpackage.InterfaceC2435l
    public InterfaceC2435l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        C5501l c5501l = (C5501l) this.f15545l;
        return new C7546l(this.f15547l, (InterfaceC1388l) this.f15550l, interfaceC7832l, c5501l, longPointerWrapper);
    }

    @Override // defpackage.InterfaceC2435l
    /* JADX INFO: renamed from: package */
    public boolean mo1139package(Object obj, int i, LinkedHashMap linkedHashMap) {
        boolean zSignature = Signature((InterfaceC9671l) obj, i, linkedHashMap);
        crashlytics(admob() + 1);
        return zSignature;
    }

    public void pro(InterfaceC14859l interfaceC14859l) {
        Canvas canvas = AbstractC10071l.yandex;
        Canvas canvas2 = ((C2151l) interfaceC14859l).yandex;
        C18118l c18118l = (C18118l) this.f15549l;
        if (c18118l.amazon) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, tapsense(), subs());
        }
        int i = c18118l.admob;
        if (canvas2.getClipBounds(c18118l.startapp)) {
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            ThreadLocal threadLocal = AbstractC6290l.yandex;
            Object c14552l = threadLocal.get();
            if (c14552l == null) {
                c14552l = new C14552l();
                threadLocal.set(c14552l);
            }
            C14552l c14552l2 = (C14552l) c14552l;
            c14552l2.yandex = canvas2;
            try {
                c18118l.billing.draw(c14552l2);
                c14552l2.yandex = null;
                if (i != 0) {
                    canvas2.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                c14552l2.yandex = null;
                throw th;
            }
        }
        if (c18118l.amazon) {
            canvas2.restore();
        }
    }

    @Override // defpackage.InterfaceC4190l
    public void purchase(byte[] bArr) {
        byte[] entropy = ((InterfaceC13380l) this.f15548l).getEntropy();
        if (entropy.length < (this.f15546l + 7) / 8) {
            C8339l.smaato("Insufficient entropy provided by entropy source");
            return;
        }
        byte[] bArrMopub = AbstractC14024l.mopub(entropy, bArr);
        license((byte) 0, bArrMopub);
        if (bArrMopub != null) {
            license((byte) 1, bArrMopub);
        }
        this.f15547l = 1L;
    }

    @Override // defpackage.InterfaceC10984l
    public InterfaceC7832l remoteconfig() {
        return (InterfaceC7832l) this.f15549l;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030 A[PHI: r3
  0x0030: PHI (r3v3 lؒۛۘ) = (r3v2 lؒۛۘ), (r3v4 lؒۛۘ) binds: [B:8:0x001c, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC2435l
    public boolean remove(Object obj) {
        InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
        boolean z = false;
        if (interfaceC9671l == null || AbstractC15011l.subs((InterfaceC2851l) interfaceC9671l)) {
            C3585l c3585l = new C3585l(16);
            Map map = AbstractC16417l.yandex;
            C1332l c1332l = null;
            if (interfaceC9671l == null) {
                realm_value_t realm_value_tVarInmobi = c3585l.inmobi(c1332l);
                boolean[] zArr = new boolean[1];
                long ptr$cinterop_release = ((LongPointerWrapper) this.f15548l).getPtr$cinterop_release();
                int i = AbstractC9795l.yandex;
                realmcJNI.realm_set_erase(ptr$cinterop_release, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, zArr);
                z = zArr[0];
                c3585l.tapsense();
            } else {
                C1332l f36749l = ((InterfaceC2851l) interfaceC9671l).getF36799l();
                c1332l = f36749l != null ? f36749l : null;
                if (c1332l != null) {
                    realm_value_t realm_value_tVarInmobi2 = c3585l.inmobi(c1332l);
                    boolean[] zArr2 = new boolean[1];
                    long ptr$cinterop_release2 = ((LongPointerWrapper) this.f15548l).getPtr$cinterop_release();
                    int i2 = AbstractC9795l.yandex;
                    realmcJNI.realm_set_erase(ptr$cinterop_release2, realm_value_tVarInmobi2.yandex, realm_value_tVarInmobi2, zArr2);
                    z = zArr2[0];
                    c3585l.tapsense();
                } else {
                    C8339l.metrica("Cannot lookup unmanaged objects in realm");
                }
            }
        }
        crashlytics(admob() + 1);
        return z;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean removeAll(Collection collection) {
        return AbstractC0653l.mopub(this, collection);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    public long startapp(C8896l c8896l, int i, C1759l c1759l) {
        InterfaceC0983l c5634l;
        int i2;
        int[] iArrVip;
        C18118l c18118l = (C18118l) this.f15549l;
        RectF rectFFirebase = AbstractC5833l.firebase(c8896l);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        int i4 = 3;
        C15707l c15707l = new C15707l(i4, c1759l);
        Layout layout = c18118l.billing;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            iArrVip = AbstractC5917l.vip(c18118l, rectFFirebase, i3, c15707l);
        } else {
            C11644l c11644lCrashlytics = c18118l.crashlytics();
            if (i3 == 1) {
                c5634l = new C0848l(layout.getText(), c18118l.smaato(), i4);
            } else {
                CharSequence text = layout.getText();
                c5634l = i5 >= 29 ? new C5634l(text, c18118l.yandex) : new C12187l(text);
            }
            InterfaceC0983l interfaceC0983l = c5634l;
            int lineForVertical = layout.getLineForVertical((int) rectFFirebase.top);
            if (rectFFirebase.top <= c18118l.purchase(lineForVertical) || (lineForVertical = lineForVertical + 1) < c18118l.mopub) {
                int i6 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFFirebase.bottom);
                if (lineForVertical2 != 0 || rectFFirebase.bottom >= c18118l.subs(0)) {
                    int iFirebase = AbstractC5646l.firebase(c18118l, layout, c11644lCrashlytics, i6, rectFFirebase, interfaceC0983l, c15707l, true);
                    while (true) {
                        i2 = i6;
                        if (iFirebase != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i6 = i2 + 1;
                        iFirebase = AbstractC5646l.firebase(c18118l, layout, c11644lCrashlytics, i6, rectFFirebase, interfaceC0983l, c15707l, true);
                    }
                    if (iFirebase == -1) {
                        iArrVip = null;
                    } else {
                        int i7 = lineForVertical2;
                        int iFirebase2 = AbstractC5646l.firebase(c18118l, layout, c11644lCrashlytics, i7, rectFFirebase, interfaceC0983l, c15707l, false);
                        while (iFirebase2 == -1 && i2 < i7) {
                            i7--;
                            iFirebase2 = AbstractC5646l.firebase(c18118l, layout, c11644lCrashlytics, i7, rectFFirebase, interfaceC0983l, c15707l, false);
                        }
                        if (iFirebase2 == -1) {
                            iArrVip = null;
                        } else {
                            iArrVip = new int[]{interfaceC0983l.amazon(iFirebase + 1), interfaceC0983l.purchase(iFirebase2 - 1)};
                        }
                    }
                } else {
                    iArrVip = null;
                }
            } else {
                iArrVip = null;
            }
        }
        return iArrVip == null ? C12814l.loadAd : AbstractC2296l.loadAd(iArrVip[0], iArrVip[1]);
    }

    public float subs() {
        return ((C18118l) this.f15549l).yandex();
    }

    @Override // defpackage.InterfaceC2435l
    public boolean subscription(Collection collection, int i, Map map) {
        return AbstractC0653l.loadAd(this, collection, i, map);
    }

    public float tapsense() {
        return C15519l.admob(this.f15547l);
    }

    @Override // defpackage.InterfaceC2435l
    public NativePointer yandex() {
        return (LongPointerWrapper) this.f15548l;
    }

    public C7546l(long j, InterfaceC1388l interfaceC1388l, InterfaceC7832l interfaceC7832l, C5501l c5501l, LongPointerWrapper longPointerWrapper) {
        this.f15545l = c5501l;
        this.f15549l = interfaceC7832l;
        this.f15548l = longPointerWrapper;
        this.f15550l = interfaceC1388l;
        this.f15547l = j;
    }
}
