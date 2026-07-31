package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؙؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6222l {
    public final ArrayList admob;
    public final float amazon;
    public final int billing;
    public final boolean crashlytics;
    public final int loadAd;
    public final ArrayList mopub;
    public final float purchase;
    public final C11644l yandex;

    public C6222l(C11644l c11644l, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iMopub;
        int i5;
        this.yandex = c11644l;
        this.loadAd = i;
        if (C15519l.isPro(j) != 0 || C15519l.subs(j) != 0) {
            AbstractC1786l.yandex("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c11644l.f23361l;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            C8928l c8928l = (C8928l) arrayList2.get(i6);
            C14442l c14442l = c8928l.yandex;
            int iAdmob = C15519l.admob(j);
            if (C15519l.crashlytics(j)) {
                i4 = i6;
                iMopub = C15519l.mopub(j) - ((int) Math.ceil(f));
                if (iMopub < 0) {
                    iMopub = 0;
                }
            } else {
                i4 = i6;
                iMopub = C15519l.mopub(j);
            }
            i3 = 0;
            C7546l c7546l = new C7546l(c14442l, this.loadAd - i7, i2, AbstractC7563l.loadAd(0, iAdmob, 0, iMopub, 5));
            C18118l c18118l = (C18118l) c7546l.f15549l;
            float fSubs = c7546l.subs() + f;
            int i8 = i7 + c18118l.mopub;
            arrayList.add(new C5048l(c7546l, c8928l.loadAd, c8928l.crashlytics, i7, i8, f, fSubs));
            if (!c18118l.amazon) {
                if (i8 == this.loadAd) {
                    i5 = i4;
                    if (i5 != AbstractC14055l.smaato((ArrayList) this.yandex.f23361l)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fSubs;
            }
            z = true;
            i7 = i8;
            f = fSubs;
            break;
        }
        this.purchase = f;
        this.billing = i7;
        this.crashlytics = z;
        this.admob = arrayList;
        this.amazon = C15519l.admob(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            C5048l c5048l = (C5048l) arrayList.get(i9);
            List list = (List) c5048l.yandex.f15550l;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                C8896l c8896l = (C8896l) list.get(i10);
                arrayList4.add(c8896l != null ? c5048l.yandex(c8896l) : null);
            }
            AbstractC3984l.license(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.yandex.f23357l).size()) {
            int size4 = ((List) this.yandex.f23357l).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC16901l.m4232new(arrayList3, arrayList5);
        }
        this.mopub = arrayList3;
    }

    public static void isPro(C6222l c6222l, InterfaceC14859l interfaceC14859l, AbstractC9544l abstractC9544l, float f, C0387l c0387l, C9867l c9867l, AbstractC3239l abstractC3239l) {
        interfaceC14859l.mopub();
        ArrayList arrayList = c6222l.admob;
        if (arrayList.size() <= 1 || (abstractC9544l instanceof C8990l)) {
            AbstractC11718l.loadAd(c6222l, interfaceC14859l, abstractC9544l, f, c0387l, c9867l, abstractC3239l);
        } else {
            if (!(abstractC9544l instanceof AbstractC17404l)) {
                C18725l.billing();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fSubs = 0.0f;
            for (int i = 0; i < size; i++) {
                C5048l c5048l = (C5048l) arrayList.get(i);
                fSubs += c5048l.yandex.subs();
                fMax = Math.max(fMax, c5048l.yandex.tapsense());
            }
            Shader shaderCrashlytics = ((AbstractC17404l) abstractC9544l).crashlytics((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fSubs)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderCrashlytics.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C7546l c7546l = ((C5048l) arrayList.get(i2)).yandex;
                c7546l.isVip(interfaceC14859l, new C7918l(shaderCrashlytics), f, c0387l, c9867l, abstractC3239l);
                interfaceC14859l.startapp(0.0f, c7546l.subs());
                matrix.setTranslate(0.0f, -c7546l.subs());
                shaderCrashlytics.setLocalMatrix(matrix);
            }
        }
        interfaceC14859l.ads();
    }

    public static void subs(C6222l c6222l, InterfaceC14859l interfaceC14859l, long j, C0387l c0387l, C9867l c9867l, AbstractC3239l abstractC3239l) {
        interfaceC14859l.mopub();
        ArrayList arrayList = c6222l.admob;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5048l c5048l = (C5048l) arrayList.get(i);
            c5048l.yandex.advert(interfaceC14859l, j, c0387l, c9867l, abstractC3239l);
            interfaceC14859l.startapp(0.0f, c5048l.yandex.subs());
        }
        interfaceC14859l.ads();
    }

    public final long admob(C8896l c8896l, int i, C1759l c1759l) {
        long jLoadAd;
        long j;
        float f = c8896l.loadAd;
        ArrayList arrayList = this.admob;
        int iIsPro = AbstractC18323l.isPro(arrayList, f);
        float f2 = ((C5048l) arrayList.get(iIsPro)).mopub;
        float f3 = c8896l.amazon;
        if (f2 >= f3 || iIsPro == AbstractC14055l.smaato(arrayList)) {
            C5048l c5048l = (C5048l) arrayList.get(iIsPro);
            return c5048l.loadAd(c5048l.yandex.startapp(c5048l.crashlytics(c8896l), i, c1759l), true);
        }
        int iIsPro2 = AbstractC18323l.isPro(arrayList, f3);
        long jLoadAd2 = C12814l.loadAd;
        while (true) {
            jLoadAd = C12814l.loadAd;
            if (!C12814l.crashlytics(jLoadAd2, jLoadAd) || iIsPro > iIsPro2) {
                break;
            }
            C5048l c5048l2 = (C5048l) arrayList.get(iIsPro);
            jLoadAd2 = c5048l2.loadAd(c5048l2.yandex.startapp(c5048l2.crashlytics(c8896l), i, c1759l), true);
            iIsPro++;
        }
        if (C12814l.crashlytics(jLoadAd2, jLoadAd)) {
            return jLoadAd;
        }
        while (true) {
            j = C12814l.loadAd;
            if (!C12814l.crashlytics(jLoadAd, j) || iIsPro > iIsPro2) {
                break;
            }
            C5048l c5048l3 = (C5048l) arrayList.get(iIsPro2);
            jLoadAd = c5048l3.loadAd(c5048l3.yandex.startapp(c5048l3.crashlytics(c8896l), i, c1759l), true);
            iIsPro2--;
        }
        return C12814l.crashlytics(jLoadAd, j) ? jLoadAd2 : AbstractC2296l.loadAd((int) (jLoadAd2 >> 32), (int) (4294967295L & jLoadAd));
    }

    public final int amazon(int i) {
        int iAdmob;
        int length = ((C3625l) this.yandex.f23358l).f7563l.length();
        ArrayList arrayList = this.admob;
        if (i >= length) {
            iAdmob = AbstractC14055l.smaato(arrayList);
        } else {
            iAdmob = i < 0 ? 0 : AbstractC18323l.admob(i, arrayList);
        }
        C5048l c5048l = (C5048l) arrayList.get(iAdmob);
        return ((C18118l) c5048l.yandex.f15549l).mopub(c5048l.amazon(i)) + c5048l.amazon;
    }

    public final float billing(int i) {
        remoteconfig(i);
        ArrayList arrayList = this.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.subs(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        return ((C18118l) c7546l.f15549l).subs(i - c5048l.amazon) + c5048l.billing;
    }

    public final int crashlytics(int i, boolean z) {
        int iBilling;
        remoteconfig(i);
        ArrayList arrayList = this.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.subs(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        int i2 = i - c5048l.amazon;
        C18118l c18118l = (C18118l) c7546l.f15549l;
        if (z) {
            Layout layout = c18118l.billing;
            ThreadLocal threadLocal = AbstractC6290l.yandex;
            if (layout.getEllipsisCount(i2) <= 0 || c18118l.loadAd != TextUtils.TruncateAt.END) {
                C11644l c11644lCrashlytics = c18118l.crashlytics();
                Layout layout2 = (Layout) c11644lCrashlytics.f23358l;
                iBilling = c11644lCrashlytics.m3160l(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iBilling = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iBilling = c18118l.billing(i2);
        }
        return iBilling + c5048l.loadAd;
    }

    public final void firebase(int i) {
        boolean z = false;
        C11644l c11644l = this.yandex;
        if (i >= 0 && i < ((C3625l) c11644l.f23358l).f7563l.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC1786l.yandex("offset(" + i + ") is out of bounds [0, " + ((C3625l) c11644l.f23358l).f7563l.length() + ")");
    }

    public final float loadAd(int i) {
        remoteconfig(i);
        ArrayList arrayList = this.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.subs(i, arrayList));
        C7546l c7546l = c5048l.yandex;
        return ((C18118l) c7546l.f15549l).purchase(i - c5048l.amazon) + c5048l.billing;
    }

    public final int mopub(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.isPro(arrayList, fIntBitsToFloat));
        int i2 = c5048l.crashlytics;
        int i3 = c5048l.loadAd;
        if (i2 - i3 == 0) {
            return i3;
        }
        C7546l c7546l = c5048l.yandex;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - c5048l.billing;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        C18118l c18118l = (C18118l) c7546l.f15549l;
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        Layout layout = c18118l.billing;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - c18118l.admob);
        if (lineForVertical >= c18118l.mopub) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (c18118l.loadAd(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final int purchase(float f) {
        int lineForVertical;
        ArrayList arrayList = this.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.isPro(arrayList, f));
        int i = c5048l.crashlytics - c5048l.loadAd;
        int i2 = c5048l.amazon;
        if (i == 0) {
            return i2;
        }
        C7546l c7546l = c5048l.yandex;
        float f2 = f - c5048l.billing;
        C18118l c18118l = (C18118l) c7546l.f15549l;
        int i3 = (int) f2;
        int i4 = c18118l.mopub;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = c18118l.billing.getLineForVertical(i3 - c18118l.admob);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final void remoteconfig(int i) {
        boolean z = false;
        int i2 = this.billing;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC1786l.yandex("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }

    public final void smaato(int i) {
        boolean z = false;
        C11644l c11644l = this.yandex;
        if (i >= 0 && i <= ((C3625l) c11644l.f23358l).f7563l.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC1786l.yandex("offset(" + i + ") is out of bounds [0, " + ((C3625l) c11644l.f23358l).f7563l.length() + "]");
    }

    public final void yandex(long j, float[] fArr) {
        firebase(C12814l.mopub(j));
        smaato(C12814l.billing(j));
        C9987l c9987l = new C9987l();
        c9987l.f20387l = 0;
        AbstractC18323l.firebase(this.admob, j, new C1040l(j, fArr, c9987l, new C13250l()));
    }
}
