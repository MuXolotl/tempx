package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteOrder;
import java.security.cert.PKIXBuilderParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lْٜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C13698l implements InterfaceC9576l, InterfaceC4034l, InterfaceC6152l, InterfaceC4930l, InterfaceC7882l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f26743l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f26744l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26745l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f26746l;

    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    public C13698l(C8934l c8934l, AbstractC2219l abstractC2219l) {
        Object c13604l;
        this.f26745l = 19;
        C13698l c13698lBilling = abstractC2219l.billing();
        int i = c8934l.f15488l;
        if (i < 0) {
            AbstractC14825l.crashlytics("negative nearestRange.first");
        }
        int iMin = Math.min(c8934l.f15487l, c13698lBilling.f26744l - 1);
        if (iMin < i) {
            this.f26743l = AbstractC4785l.yandex;
            this.f26746l = new Object[0];
            this.f26744l = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.f26746l = new Object[i2];
        this.f26744l = i;
        C7661l c7661l = new C7661l(i2);
        C17893l c17893l = (C17893l) c13698lBilling.f26743l;
        if (i < 0 || i >= c13698lBilling.f26744l) {
            AbstractC14825l.purchase("Index " + i + ", size " + c13698lBilling.f26744l);
        }
        if (iMin < 0 || iMin >= c13698lBilling.f26744l) {
            AbstractC14825l.purchase("Index " + iMin + ", size " + c13698lBilling.f26744l);
        }
        if (iMin < i) {
            AbstractC14825l.yandex("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ")");
        }
        int iYandex = AbstractC3206l.yandex(i, c17893l);
        int i3 = ((C2443l) c17893l.f34848l[iYandex]).yandex;
        while (i3 <= iMin) {
            C2443l c2443l = (C2443l) c17893l.f34848l[iYandex];
            Function1 key = c2443l.crashlytics.getKey();
            int i4 = c2443l.yandex;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (c2443l.loadAd + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        c13604l = key.invoke(Integer.valueOf(iMax - i4));
                        c13604l = c13604l == null ? new C13604l(iMax) : c13604l;
                    }
                    c7661l.mopub(iMax, c13604l);
                    ((Object[]) this.f26746l)[iMax - this.f26744l] = c13604l;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            Unit unit = Unit.INSTANCE;
            i3 += c2443l.loadAd;
            iYandex++;
        }
        this.f26743l = c7661l;
    }

    public static C13698l ads(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        int i2 = 5;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListLoadAd = AbstractC3053l.loadAd(resources, xml, attributeSetAsAttributeSet, theme);
                return new C13698l(obj, colorStateListLoadAd, colorStateListLoadAd.getDefaultColor(), i2);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArraySignature = AbstractC10310l.Signature(resources, theme, attributeSetAsAttributeSet, AbstractC6368l.purchase);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArraySignature.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArraySignature.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArraySignature.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArraySignature.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArraySignature.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArraySignature.getFloat(4, 0.0f) : 0.0f;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArraySignature.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArraySignature.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArraySignature.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArraySignature.getColor(1, 0) : 0;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArraySignature.getInt(6, 0) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArraySignature.getFloat(5, 0.0f) : 0.0f;
        typedArraySignature.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f4;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArraySignature2 = AbstractC10310l.Signature(resources, theme, attributeSetAsAttributeSet, AbstractC6368l.billing);
                boolean zHasValue = typedArraySignature2.hasValue(0);
                boolean zHasValue2 = typedArraySignature2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArraySignature2.getColor(0, 0);
                float f11 = typedArraySignature2.getFloat(1, 0.0f);
                typedArraySignature2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f4 = f;
            f5 = f2;
        }
        C18595l c18595l = arrayList2.size() > 0 ? new C18595l(arrayList2, arrayList) : null;
        if (c18595l == null) {
            c18595l = z ? new C18595l(color, color2, color3) : new C18595l(color, color3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                int[] iArr = (int[]) c18595l.f36317l;
                float[] fArr = (float[]) c18595l.f36316l;
                if (i4 != 1) {
                    tileMode2 = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f3, f, f2, f6, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, (int[]) c18595l.f36317l, (float[]) c18595l.f36316l);
            }
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) c18595l.f36317l;
            float[] fArr2 = (float[]) c18595l.f36316l;
            if (i4 != 1) {
                tileMode = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr2, fArr2, tileMode);
        }
        return new C13698l(radialGradient, (Object) null, 0, 5);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static int m3664class(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((C1249l) list.get(i3)).yandex - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void loadAd(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static C13698l m3665switch(RandomAccessFile randomAccessFile) throws C13768l, IOException {
        String strFirebase = AbstractC14375l.firebase(randomAccessFile, 4);
        int iRemoteconfig = (int) AbstractC14375l.remoteconfig(randomAccessFile);
        if (iRemoteconfig < 8) {
            throw new C13768l("Corrupt file: RealAudio chunk length at position " + (randomAccessFile.getFilePointer() - 4) + " cannot be less than 8");
        }
        if (iRemoteconfig <= (randomAccessFile.length() - randomAccessFile.getFilePointer()) + 8) {
            ?? r2 = new byte[iRemoteconfig - 8];
            randomAccessFile.readFully(r2);
            return new C13698l(strFirebase, iRemoteconfig, (Serializable) r2, 21);
        }
        StringBuilder sbSignature = AbstractC2812l.Signature("Corrupt file: RealAudio chunk length of ", iRemoteconfig, " at position ");
        sbSignature.append(randomAccessFile.getFilePointer() - 4);
        sbSignature.append(" extends beyond the end of the file");
        throw new C13768l(sbSignature.toString());
    }

    public void Signature(int i) {
        C11315l c11315l = (C11315l) this.f26746l;
        int i2 = this.f26744l;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (((int[]) this.f26743l).length / 2), 0);
            this.f26744l = iMax;
            int i4 = iMax - i2;
            int[] iArr = (int[]) this.f26743l;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    AbstractC8669l.ad(0, i4, iArr, iArr, iArr.length);
                }
                int[] iArr2 = (int[]) this.f26743l;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), ((int[]) this.f26743l).length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    tapsense(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        AbstractC8669l.ad(i5, 0, iArr, iArr, iArr.length - i5);
                    }
                    int[] iArr3 = (int[]) this.f26743l;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            tapsense(i3 + 1, 0);
        }
        while (!c11315l.isEmpty() && ((C1249l) c11315l.first()).yandex < this.f26744l) {
            c11315l.removeFirst();
        }
        while (!c11315l.isEmpty() && ((C1249l) c11315l.last()).yandex > this.f26744l + ((int[]) this.f26743l).length) {
            c11315l.removeLast();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d5 A[Catch: all -> 0x013e, TryCatch #5 {all -> 0x013e, blocks: (B:13:0x0032, B:59:0x0108, B:60:0x010f, B:61:0x0110, B:62:0x0125, B:17:0x003d, B:48:0x00d5, B:49:0x00d8, B:50:0x00df, B:40:0x00a9, B:42:0x00b5, B:44:0x00c3, B:51:0x00e0, B:53:0x00e8, B:55:0x00f6, B:63:0x0126, B:64:0x013d), top: B:85:0x002a, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[Catch: all -> 0x013e, TryCatch #5 {all -> 0x013e, blocks: (B:13:0x0032, B:59:0x0108, B:60:0x010f, B:61:0x0110, B:62:0x0125, B:17:0x003d, B:48:0x00d5, B:49:0x00d8, B:50:0x00df, B:40:0x00a9, B:42:0x00b5, B:44:0x00c3, B:51:0x00e0, B:53:0x00e8, B:55:0x00f6, B:63:0x0126, B:64:0x013d), top: B:85:0x002a, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        if (r14 == r10) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable ad(defpackage.C16210l r13, defpackage.AbstractC0283l r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13698l.ad(lٖؗۡ, lّؑۧ):java.io.Serializable");
    }

    public AbstractC13675l adcel() {
        return metrica(true);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x010b A[PHI: r14
  0x010b: PHI (r14v6 lٌ٘۠) = (r14v4 lٌ٘۠), (r14v9 lٌ٘۠), (r14v9 lٌ٘۠), (r14v9 lٌ٘۠), (r14v9 lٌ٘۠) binds: [B:44:0x00a7, B:46:0x00b3, B:48:0x00bf, B:50:0x00cb, B:56:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.InterfaceC7882l
    public InterfaceC14356l admob(InterfaceC14356l interfaceC14356l) {
        AbstractC8859l abstractC8859lAdvert;
        AbstractC8859l[] abstractC8859lArr;
        AbstractC8859l[] abstractC8859lArr2;
        int length;
        int i;
        AbstractC8859l abstractC8859lAmazon;
        int i2;
        AbstractC8859l[] abstractC8859lArr3;
        AbstractC8859l[] abstractC8859lArr4;
        AbstractC2426l abstractC2426lIsPro = null;
        C16556l c16556l = interfaceC14356l instanceof C16556l ? (C16556l) interfaceC14356l : null;
        int iMax = Math.max(2, Math.min(16, this.f26744l));
        int i3 = 1 << (iMax - 2);
        if (c16556l != null && c16556l.billing >= Math.max(c16556l.loadAd, iMax) && (abstractC8859lArr3 = c16556l.crashlytics) != null && abstractC8859lArr3.length >= i3 && (abstractC8859lArr4 = c16556l.amazon) != null && abstractC8859lArr4.length >= i3) {
            int i4 = c16556l.yandex;
            if (i4 > 0) {
                c16556l.yandex = i4 - 1;
            }
            return c16556l;
        }
        C16556l c16556l2 = new C16556l();
        if (c16556l != null) {
            int i5 = c16556l.yandex;
            if (i5 > 0) {
                i5--;
                c16556l.yandex = i5;
            }
            c16556l2.yandex = i5;
            c16556l2.loadAd = c16556l.loadAd;
            abstractC8859lArr = c16556l.crashlytics;
            abstractC8859lArr2 = c16556l.amazon;
            abstractC8859lAdvert = c16556l.purchase;
        } else {
            abstractC8859lAdvert = null;
            abstractC8859lArr = null;
            abstractC8859lArr2 = null;
        }
        int iMin = Math.min(16, Math.max(c16556l2.loadAd, iMax));
        int i6 = 1 << (iMin - 2);
        int i7 = 0;
        if (abstractC8859lArr == null) {
            abstractC8859lArr = AbstractC6660l.f14005l;
            length = 0;
        } else {
            length = abstractC8859lArr.length;
        }
        if (length < i6) {
            AbstractC8859l[] abstractC8859lArr5 = new AbstractC8859l[i6];
            System.arraycopy(abstractC8859lArr, 0, abstractC8859lArr5, 0, abstractC8859lArr.length);
            if (i6 == 1) {
                abstractC8859lArr5[0] = ((AbstractC8859l) this.f26743l).startapp();
            } else {
                if (length == 0) {
                    abstractC8859lArr5[0] = (AbstractC8859l) this.f26743l;
                    i = 1;
                } else {
                    i = length;
                }
                if (i6 == 2) {
                    abstractC8859lArr5[1] = ((AbstractC8859l) this.f26743l).pro();
                } else {
                    AbstractC8859l abstractC8859lYandex = abstractC8859lArr5[i - 1];
                    if (abstractC8859lAdvert == null) {
                        abstractC8859lAdvert = abstractC8859lArr5[0].advert();
                        if (abstractC8859lAdvert.smaato() || !AbstractC6974l.firebase(((AbstractC11918l) this.f26746l).yandex) || ((AbstractC11918l) this.f26746l).smaato() < 64 || !((i2 = ((AbstractC11918l) this.f26746l).billing) == 2 || i2 == 3 || i2 == 4)) {
                            abstractC8859lAmazon = abstractC8859lAdvert;
                        } else {
                            abstractC2426lIsPro = abstractC8859lAdvert.isPro();
                            abstractC8859lAmazon = ((AbstractC11918l) this.f26746l).amazon(abstractC8859lAdvert.loadAd.signatures(), abstractC8859lAdvert.subs().signatures());
                            AbstractC2426l abstractC2426lLicense = abstractC2426lIsPro.license();
                            abstractC8859lYandex = abstractC8859lYandex.tapsense(abstractC2426lLicense).Signature(abstractC2426lLicense.startapp(abstractC2426lIsPro));
                            if (length == 0) {
                                abstractC8859lArr5[0] = abstractC8859lYandex;
                            }
                        }
                    } else {
                        abstractC8859lAmazon = abstractC8859lAdvert;
                    }
                    while (i < i6) {
                        abstractC8859lYandex = abstractC8859lYandex.yandex(abstractC8859lAmazon);
                        abstractC8859lArr5[i] = abstractC8859lYandex;
                        i++;
                    }
                }
                ((AbstractC11918l) this.f26746l).startapp(abstractC8859lArr5, length, i6 - length, abstractC2426lIsPro);
            }
            abstractC8859lArr = abstractC8859lArr5;
        }
        if (abstractC8859lArr2 == null) {
            abstractC8859lArr2 = new AbstractC8859l[i6];
        } else {
            int length2 = abstractC8859lArr2.length;
            if (length2 < i6) {
                AbstractC8859l[] abstractC8859lArr6 = new AbstractC8859l[i6];
                System.arraycopy(abstractC8859lArr2, 0, abstractC8859lArr6, 0, abstractC8859lArr2.length);
                i7 = length2;
                abstractC8859lArr2 = abstractC8859lArr6;
            } else {
                i7 = length2;
            }
        }
        while (i7 < i6) {
            abstractC8859lArr2[i7] = abstractC8859lArr[i7].metrica();
            i7++;
        }
        c16556l2.crashlytics = abstractC8859lArr;
        c16556l2.amazon = abstractC8859lArr2;
        c16556l2.purchase = abstractC8859lAdvert;
        c16556l2.billing = iMin;
        return c16556l2;
    }

    public C2443l advert(int i) {
        if (i < 0 || i >= this.f26744l) {
            AbstractC14825l.purchase("Index " + i + ", size " + this.f26744l);
        }
        C2443l c2443l = (C2443l) this.f26746l;
        if (c2443l != null) {
            int i2 = c2443l.yandex;
            if (i < c2443l.loadAd + i2 && i2 <= i) {
                return c2443l;
            }
        }
        C17893l c17893l = (C17893l) this.f26743l;
        C2443l c2443l2 = (C2443l) c17893l.f34848l[AbstractC3206l.yandex(i, c17893l)];
        this.f26746l = c2443l2;
        return c2443l2;
    }

    @Override // defpackage.InterfaceC4930l
    public void amazon(Object obj) {
        List list = (List) obj;
        C3726l c3726l = ((C13350l) this.f26746l).admob;
        Handler handler = c3726l.smaato;
        C6499l c6499l = (C6499l) this.f26743l;
        AbstractC15323l.m3966final(handler, new RunnableC12388l(c3726l, c6499l, new RunnableC3088l(this, list, this.f26744l, c6499l, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d A[Catch: all -> 0x0106, TryCatch #1 {all -> 0x0106, blocks: (B:13:0x0032, B:46:0x00d0, B:47:0x00d7, B:48:0x00d8, B:49:0x00ed, B:17:0x003d, B:35:0x009d, B:36:0x00a0, B:37:0x00a7, B:27:0x0071, B:29:0x007d, B:31:0x008b, B:38:0x00a8, B:40:0x00b0, B:42:0x00be, B:50:0x00ee, B:51:0x0105), top: B:64:0x002a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0 A[Catch: all -> 0x0106, TryCatch #1 {all -> 0x0106, blocks: (B:13:0x0032, B:46:0x00d0, B:47:0x00d7, B:48:0x00d8, B:49:0x00ed, B:17:0x003d, B:35:0x009d, B:36:0x00a0, B:37:0x00a7, B:27:0x0071, B:29:0x007d, B:31:0x008b, B:38:0x00a8, B:40:0x00b0, B:42:0x00be, B:50:0x00ee, B:51:0x0105), top: B:64:0x002a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
    
        if (r13 == r10) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable applovin(defpackage.AbstractC0283l r13) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13698l.applovin(lّؑۧ):java.io.Serializable");
    }

    public Object appmetrica(int i) {
        Object[] objArr = (Object[]) this.f26746l;
        int i2 = i - this.f26744l;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    @Override // defpackage.InterfaceC6152l
    public void billing(InterfaceC16937l interfaceC16937l) {
        if (interfaceC16937l instanceof C18245l) {
            this.f26746l = ((C18245l) interfaceC16937l).yandex;
        } else {
            C8339l.metrica("MGF parameters required for MGF1Generator");
        }
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public C13698l mo3667case(Map map) {
        return mo3671else(map.entrySet());
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public C13698l mo3668catch(Object obj, Object obj2) {
        int i = (this.f26744l + 1) * 2;
        Object[] objArr = (Object[]) this.f26743l;
        if (i > objArr.length) {
            this.f26743l = Arrays.copyOf(objArr, AbstractC3594l.loadAd(objArr.length, i));
        }
        AbstractC12832l.yandex(obj, obj2);
        Object[] objArr2 = (Object[]) this.f26743l;
        int i2 = this.f26744l;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f26744l = i2 + 1;
        return this;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m3669continue() {
        AbstractC8669l.m2411package(0, 0, 6, (int[]) this.f26743l);
        ((C11315l) this.f26746l).clear();
    }

    @Override // defpackage.InterfaceC4034l
    public void crashlytics() {
        switch (this.f26745l) {
            case 9:
                break;
            default:
                C13143l c13143l = (C13143l) this.f26746l;
                byte[] bArr = AbstractC15323l.loadAd;
                c13143l.getClass();
                c13143l.m3565private(bArr.length, bArr);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d5 A[Catch: all -> 0x013e, TryCatch #5 {all -> 0x013e, blocks: (B:13:0x0032, B:59:0x0108, B:60:0x010f, B:61:0x0110, B:62:0x0125, B:17:0x003d, B:48:0x00d5, B:49:0x00d8, B:50:0x00df, B:40:0x00a9, B:42:0x00b5, B:44:0x00c3, B:51:0x00e0, B:53:0x00e8, B:55:0x00f6, B:63:0x0126, B:64:0x013d), top: B:85:0x002a, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[Catch: all -> 0x013e, TryCatch #5 {all -> 0x013e, blocks: (B:13:0x0032, B:59:0x0108, B:60:0x010f, B:61:0x0110, B:62:0x0125, B:17:0x003d, B:48:0x00d5, B:49:0x00d8, B:50:0x00df, B:40:0x00a9, B:42:0x00b5, B:44:0x00c3, B:51:0x00e0, B:53:0x00e8, B:55:0x00f6, B:63:0x0126, B:64:0x013d), top: B:85:0x002a, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        if (r14 == r10) goto L57;
     */
    /* JADX INFO: renamed from: default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable m3670default(defpackage.C12102l r13, defpackage.AbstractC0283l r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13698l.m3670default(lِۚٝ, lّؑۧ):java.io.Serializable");
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public C13698l mo3671else(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f26744l) * 2;
            Object[] objArr = (Object[]) this.f26743l;
            if (size > objArr.length) {
                this.f26743l = Arrays.copyOf(objArr, AbstractC3594l.loadAd(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mo3668catch(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m3672extends(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f26743l;
        Context context = imageView.getContext();
        int[] iArr = AbstractC14657l.billing;
        C12418l c12418lPro = C12418l.pro(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        AbstractC15872l.remoteconfig(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c12418lPro.f24518l, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC13273l.loadAd(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC2341l.yandex(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c12418lPro.adcel(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC2341l.crashlytics(typedArray.getInt(3, -1), null));
            }
        } finally {
            c12418lPro.advert();
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public void m3673final(Object obj, Object obj2) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Object obj3 = ((Object[]) this.f26743l)[i];
            if (obj3 != null) {
                if (i2 < i) {
                    int i4 = i - i2;
                    System.arraycopy(obj, i2, obj2, i3, i4);
                    i3 += i4;
                }
                int iM3684throws = m3684throws(obj3);
                System.arraycopy(obj3, 0, obj2, i3, iM3684throws);
                i3 += iM3684throws;
                i2 = i + 1;
            }
            if (i == 1) {
                break;
            } else {
                i++;
            }
        }
        if (i2 < 2) {
            System.arraycopy(obj, i2, obj2, i3, 2 - i2);
        }
    }

    public void firebase(Object obj) {
        Object[] objArr = (Object[]) this.f26743l;
        int i = this.f26744l;
        this.f26744l = i + 1;
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m3674for(C13071l c13071l, int i, int i2, C5978l c5978l, int i3, Object obj, long j, long j2, int i4) {
        subscription(new C2766l(this, c13071l, new C2040l(i, i2, c5978l, i3, obj, AbstractC15323l.m3986try(j), AbstractC15323l.m3986try(j2)), i4));
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        Object c15252l;
        Object c7276l;
        Object c18548l;
        Object c9028l;
        int i = 2;
        boolean z = false;
        z = false;
        int i2 = 1;
        switch (this.f26745l) {
            case 6:
                C9377l c9377l = (C9377l) this.f26743l;
                C13416l c13416l = (C13416l) this.f26746l;
                int i3 = this.f26744l;
                switch (i3) {
                    case 0:
                        C17927l c17927l = c13416l.yandex;
                        c17927l.getClass();
                        return new C14275l(c17927l, (C15252l) c13416l.f26314package.get(), (InterfaceC15879l) c13416l.inmobi.get(), (InterfaceC10408l) c13416l.f26315synchronized.get(), (C14338l) c13416l.isPro.get(), (C7647l) c13416l.ad.get());
                    case 1:
                        C1424l c1424l = c9377l.yandex;
                        C1424l c1424l2 = c9377l.yandex;
                        C4723l c4723l = (C4723l) c1424l.f3601l;
                        AbstractC17943l.yandex(c4723l);
                        C7518l c7518l = (C7518l) c1424l2.f3604l;
                        AbstractC17943l.yandex(c7518l);
                        C18595l c18595l = new C18595l(c9377l, c13416l, 15);
                        InterfaceC2889l interfaceC2889l = (InterfaceC2889l) c13416l.purchase.get();
                        C12094l c12094l = (C12094l) c13416l.remoteconfig.get();
                        C5501l c5501l = new C5501l(25);
                        c5501l.m1809break(c13416l.metrica.get());
                        c5501l.m1809break(c13416l.adcel.get());
                        c5501l.m1809break(c13416l.ads.get());
                        c5501l.m1809break(c13416l.firebase.get());
                        c5501l.m1809break(c13416l.subscription.get());
                        c5501l.m1809break(c13416l.startapp.get());
                        c5501l.m1809break(c13416l.remoteconfig.get());
                        c5501l.m1809break(c13416l.tapsense.get());
                        c5501l.m1809break(c13416l.Signature.get());
                        ArrayList arrayList = (ArrayList) c5501l.f11764l;
                        Set setSingleton = arrayList.isEmpty() ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : DesugarCollections.unmodifiableSet(new HashSet(arrayList));
                        C9410l c9410l = (C9410l) c13416l.pro.get();
                        C7647l c7647l = (C7647l) c13416l.ad.get();
                        C13161l c13161l = c13416l.advert;
                        InterfaceC9576l interfaceC9576l = c13416l.inmobi;
                        InterfaceC2360l interfaceC2360l = (InterfaceC2360l) c13416l.applovin.get();
                        C15736l c15736l = (C15736l) c13416l.amazon.get();
                        C1276l c1276l = (C1276l) c1424l2.f3606l;
                        C8462l c8462l = (C8462l) c13416l.f26316throws.get();
                        Context context = (Context) c1424l2.f3603l;
                        c15252l = new C15252l(c4723l, c7518l, c18595l, interfaceC2889l, c12094l, setSingleton, c9410l, c7647l, c13161l, interfaceC9576l, interfaceC2360l, c15736l, c1276l, c8462l, context, C13283l.mopub.crashlytics(context));
                        break;
                    case 2:
                        return new C16424l((C15736l) c13416l.amazon.get());
                    case 3:
                        C17927l c17927l2 = c13416l.yandex;
                        c17927l2.getClass();
                        return new C15736l(c17927l2, (InterfaceC5389l) c13416l.crashlytics.get());
                    case 4:
                        C4723l c4723l2 = (C4723l) c9377l.yandex.f3601l;
                        AbstractC17943l.yandex(c4723l2);
                        C17927l c17927l3 = c13416l.yandex;
                        c17927l3.getClass();
                        try {
                            return AbstractC14814l.amazon(c4723l2.loadAd(), c17927l3.loadAd);
                        } catch (C6422l unused) {
                            if (!AbstractC5088l.smaato()) {
                                return null;
                            }
                            Log.e("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                            return null;
                        }
                    case 5:
                        return new C12094l((InterfaceC5389l) c13416l.crashlytics.get(), (C15161l) c13416l.firebase.get(), (C14338l) c13416l.isPro.get(), (C5342l) c13416l.smaato.get());
                    case 6:
                        return new C15161l((C15736l) c13416l.amazon.get(), (AbstractC17919l.yandex(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !((C5849l) c13416l.subs.get()).yandex().yandex(ImageCaptureFailWithAutoFlashQuirk.class)) ? C7472l.f15453l : C1083l.f2979l, (C14338l) c13416l.isPro.get());
                    case 7:
                        return new C5849l((InterfaceC5389l) c13416l.crashlytics.get(), (C5979l) c13416l.admob.get());
                    case 8:
                        return new C5979l((StreamConfigurationMap) c13416l.billing.get(), (C3111l) c13416l.mopub.get());
                    case 9:
                        InterfaceC5389l interfaceC5389l = (InterfaceC5389l) c13416l.crashlytics.get();
                        if (interfaceC5389l != null) {
                            return (StreamConfigurationMap) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        }
                        return null;
                    case 10:
                        InterfaceC5389l interfaceC5389l2 = (InterfaceC5389l) c13416l.crashlytics.get();
                        return new C3111l(interfaceC5389l2);
                    case 11:
                        C17927l c17927l4 = c13416l.yandex;
                        c17927l4.getClass();
                        Executor executor = ((C13316l) c9377l.yandex.f3602l).yandex;
                        return new C14338l(AbstractC11990l.yandex(AbstractC10586l.billing(AbstractC1295l.crashlytics(), AbstractC5103l.billing(executor)).mo246l(new C0499l("CXCP-UseCase-" + c17927l4.loadAd))), executor);
                    case 12:
                        return new C5342l();
                    case 13:
                        return new C10502l((C17775l) c13416l.vip.get());
                    case 14:
                        return new C17775l((C15736l) c13416l.amazon.get(), (C14338l) c13416l.isPro.get(), (C5342l) c13416l.smaato.get());
                    case 15:
                        c15252l = new C15158l((C15736l) c13416l.amazon.get(), (C15161l) c13416l.firebase.get(), (C14338l) c13416l.isPro.get(), (C8715l) c13416l.startapp.get(), ((C5849l) c13416l.subs.get()).yandex().yandex(TorchFlashRequiredFor3aUpdateQuirk.class) ? C17334l.f33644l : C15718l.f30872l);
                        break;
                    case 16:
                        C15736l c15736l2 = (C15736l) c13416l.amazon.get();
                        C15161l c15161l = (C15161l) c13416l.firebase.get();
                        return new C8715l(c15736l2, c15161l);
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        c15252l = new C0708l((C15736l) c13416l.amazon.get(), ((C5849l) c13416l.subs.get()).yandex().yandex(AfRegionFlipHorizontallyQuirk.class) ? C13863l.f27106l : C8565l.f17669l, (C15161l) c13416l.firebase.get(), (C14338l) c13416l.isPro.get(), c13416l.loadAd());
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        return new C4280l((C15158l) c13416l.adcel.get(), (C14338l) c13416l.isPro.get());
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        return new C16656l();
                    case 20:
                        return new C15048l(c13416l.loadAd());
                    case 21:
                        return new C9410l((C17295l) c13416l.license.get(), (C14338l) c13416l.isPro.get(), (C5342l) c13416l.smaato.get());
                    case 22:
                        return new C17295l();
                    case 23:
                        return new C7647l();
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        C15736l c15736l3 = (C15736l) c13416l.amazon.get();
                        C17927l c17927l5 = c13416l.yandex;
                        c17927l5.getClass();
                        C7647l c7647l2 = (C7647l) c13416l.ad.get();
                        C5800l c5800l = (C5800l) c13416l.isVip.get();
                        C10035l c10035l = (C10035l) c13416l.signatures.get();
                        C5849l c5849l = (C5849l) c13416l.subs.get();
                        InterfaceC2360l interfaceC2360l2 = (InterfaceC2360l) c13416l.applovin.get();
                        C5979l c5979l = (C5979l) c13416l.admob.get();
                        c15252l = new C15636l(c15736l3, c17927l5, c7647l2, c5800l, c10035l, c5849l, interfaceC2360l2, c5979l);
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        C15048l c15048l = (C15048l) c13416l.Signature.get();
                        C8715l c8715l = (C8715l) c13416l.startapp.get();
                        return new C5800l(c15048l, c8715l);
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        return new C10035l();
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        return new C8906l((String) c13416l.premium.get(), ((C5849l) c13416l.subs.get()).yandex());
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        C17927l c17927l6 = c13416l.yandex;
                        c17927l6.getClass();
                        String str = c17927l6.loadAd;
                        AbstractC17943l.yandex(str);
                        return str;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        c9377l.yandex();
                        return new C5247l();
                    case 30:
                        C10035l c10035l2 = (C10035l) c13416l.signatures.get();
                        C5342l c5342l = (C5342l) c13416l.smaato.get();
                        C17927l c17927l7 = c13416l.yandex;
                        c17927l7.getClass();
                        C5849l c5849l2 = (C5849l) c13416l.subs.get();
                        InterfaceC2889l interfaceC2889l2 = (InterfaceC2889l) c13416l.purchase.get();
                        InterfaceC18560l interfaceC18560lYandex = c13416l.yandex();
                        InterfaceC5389l interfaceC5389l3 = (InterfaceC5389l) c13416l.crashlytics.get();
                        C1424l c1424l3 = c9377l.yandex;
                        C1276l c1276l2 = (C1276l) c1424l3.f3606l;
                        C3797l c3797l = (C3797l) c1424l3.f3605l;
                        AbstractC17943l.yandex(c3797l);
                        return new C8462l(c10035l2, c5342l, c17927l7, c5849l2, interfaceC2889l2, interfaceC18560lYandex, interfaceC5389l3, c1276l2, c3797l);
                    case 31:
                        C15736l c15736l4 = (C15736l) c13416l.amazon.get();
                        return new C9338l(c15736l4, (C15158l) c13416l.adcel.get(), (C0708l) c13416l.ads.get(), (C4280l) c13416l.subscription.get(), (C8715l) c13416l.startapp.get(), (C12094l) c13416l.remoteconfig.get(), (C15048l) c13416l.Signature.get(), (InterfaceC2889l) c13416l.purchase.get(), (C9410l) c13416l.pro.get(), (C15252l) c13416l.f26314package.get(), (C14338l) c13416l.isPro.get(), (C16656l) c13416l.tapsense.get());
                    default:
                        throw new AssertionError(i3);
                }
                return c15252l;
            case 7:
                C5954l c5954l = (C5954l) this.f26743l;
                C15389l c15389l = (C15389l) this.f26746l;
                C1424l c1424l4 = (C1424l) c15389l.yandex;
                int i4 = this.f26744l;
                switch (i4) {
                    case 0:
                        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) ((InterfaceC9576l) c15389l.crashlytics).get();
                        C11969l c11969l = (C11969l) c5954l.billing.get();
                        C7094l c7094l = (C7094l) c5954l.metrica.get();
                        C7931l c7931l = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l);
                        C18548l c18548l2 = (C18548l) c1424l4.f3601l;
                        C9028l c9028l2 = (C9028l) c1424l4.f3604l;
                        C11751l c11751l = (C11751l) ((InterfaceC9576l) c15389l.amazon).get();
                        InterfaceC0627l interfaceC0627l = (InterfaceC0627l) ((InterfaceC9576l) c15389l.isPro).get();
                        C5954l c5954l2 = (C5954l) c15389l.loadAd;
                        C11969l c11969l2 = (C11969l) c5954l2.billing.get();
                        C7931l c7931l2 = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l2);
                        c7276l = new C7276l(interfaceC2262l, c11969l, c7094l, c7931l, c18548l2, c9028l2, c11751l, interfaceC0627l, new C3557l(c11969l2, c7931l2, (C5664l) c1424l4.f3605l, (C8409l) c5954l2.startapp.get(), (C7094l) c5954l2.metrica.get()), (C2182l) c5954l.Signature.get(), (C12292l) c5954l.isVip.get(), (C8409l) c5954l.startapp.get(), (C3945l) c5954l.remoteconfig.get(), (C14437l) c1424l4.f3603l, (C1663l) c1424l4.f3606l, (C5664l) c1424l4.f3605l, (C7820l) c5954l.signatures.get());
                        break;
                    case 1:
                        return AbstractC11990l.yandex(AbstractC10586l.billing(new C2993l((InterfaceC7042l) c5954l.amazon.get()), AbstractC10586l.billing(((C11969l) c5954l.billing.get()).billing, new C0499l("CXCP-Camera2Controller"))));
                    case 2:
                        InterfaceC9576l interfaceC9576l2 = c5954l.mopub;
                        C11969l c11969l3 = (C11969l) c5954l.billing.get();
                        C7931l c7931l3 = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l3);
                        c7276l = new C11751l(interfaceC9576l2, c11969l3, c7931l3.yandex, (InterfaceC7042l) c5954l.amazon.get());
                        break;
                    case 3:
                        C13698l c13698l = (C13698l) c15389l.purchase;
                        C13698l c13698l2 = (C13698l) c15389l.billing;
                        C13698l c13698l3 = (C13698l) c15389l.mopub;
                        C13698l c13698l4 = (C13698l) c15389l.admob;
                        C13698l c13698l5 = (C13698l) c15389l.subs;
                        C7931l c7931l4 = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l4);
                        int i5 = c7931l4.admob;
                        if (i5 == 2) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                return (InterfaceC0627l) c13698l5.get();
                            }
                            C8339l.smaato("Cannot use Extension sessions below Android S");
                            return null;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 28) {
                            return (InterfaceC0627l) c13698l4.get();
                        }
                        if (i5 == 1) {
                            return (InterfaceC0627l) c13698l2.get();
                        }
                        if (i6 >= 24) {
                            return (InterfaceC0627l) c13698l3.get();
                        }
                        if (c7931l4.amazon == null) {
                            return (InterfaceC0627l) c13698l.get();
                        }
                        C8339l.smaato("Reprocessing is not supported on Android M");
                        return null;
                    case 4:
                        C5664l c5664l = (C5664l) c1424l4.f3605l;
                        C7931l c7931l5 = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l5);
                        return new C10098l(c5664l, c7931l5, z ? 1 : 0);
                    case 5:
                        C5664l c5664l2 = (C5664l) c1424l4.f3605l;
                        return new C18634l(c5664l2);
                    case 6:
                        C5664l c5664l3 = (C5664l) c1424l4.f3605l;
                        C7931l c7931l6 = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l6);
                        return new C10098l(c5664l3, c7931l6, i2);
                    case 7:
                        C11969l c11969l4 = (C11969l) c5954l.billing.get();
                        C7931l c7931l7 = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l7);
                        return new C11081l(c11969l4, c7931l7, (C5664l) c1424l4.f3605l);
                    case 8:
                        C11969l c11969l5 = (C11969l) c5954l.billing.get();
                        C7931l c7931l8 = (C7931l) c1424l4.f3602l;
                        AbstractC17943l.yandex(c7931l8);
                        return new C8225l(c11969l5, c7931l8, (C5664l) c1424l4.f3605l, (InterfaceC18322l) c5954l.vip.get(), (C7094l) c5954l.metrica.get());
                    default:
                        throw new AssertionError(i4);
                }
                return c7276l;
            default:
                int i7 = this.f26744l;
                int i8 = 3;
                switch (i7) {
                    case 0:
                        C7931l c7931l9 = (C7931l) ((C10023l) ((C0511l) this.f26746l).yandex).f20419l;
                        AbstractC17943l.yandex(c7931l9);
                        InterfaceC5389l interfaceC5389l4 = (InterfaceC5389l) ((InterfaceC9576l) ((C0511l) this.f26746l).crashlytics).get();
                        C18548l c18548l3 = (C18548l) ((C13161l) ((C0511l) this.f26746l).adcel).get();
                        C18548l c18548l4 = (C18548l) ((C13161l) ((C0511l) this.f26746l).adcel).get();
                        C5664l c5664l4 = (C5664l) ((C13161l) ((C0511l) this.f26746l).ads).get();
                        C9028l c9028l3 = (C9028l) ((InterfaceC9576l) ((C0511l) this.f26746l).purchase).get();
                        C7276l c7276l2 = (C7276l) ((C13161l) ((C0511l) this.f26746l).subscription).get();
                        C8958l c8958l = (C8958l) ((InterfaceC9576l) ((C0511l) this.f26746l).admob).get();
                        C14588l c14588l = (C14588l) ((InterfaceC9576l) ((C0511l) this.f26746l).billing).get();
                        C14894l c14894l = (C14894l) ((C5954l) this.f26743l).ads.get();
                        C0511l c0511l = (C0511l) this.f26746l;
                        return new C2667l(c7931l9, interfaceC5389l4, c18548l3, c18548l4, c5664l4, c9028l3, c7276l2, c8958l, c14588l, c14894l, (C14437l) ((C10023l) c0511l.yandex).f20418l, (C15400l) ((InterfaceC9576l) c0511l.smaato).get(), (C8445l) ((InterfaceC9576l) ((C0511l) this.f26746l).remoteconfig).get(), (C7230l) ((InterfaceC9576l) ((C0511l) this.f26746l).isPro).get(), (InterfaceC2262l) ((InterfaceC9576l) ((C0511l) this.f26746l).firebase).get(), (C10013l) ((InterfaceC9576l) ((C0511l) this.f26746l).metrica).get());
                    case 1:
                        C7931l c7931l10 = (C7931l) ((C10023l) ((C0511l) this.f26746l).yandex).f20419l;
                        AbstractC17943l.yandex(c7931l10);
                        return ((C1663l) ((InterfaceC11220l) ((InterfaceC9576l) ((C0511l) this.f26746l).loadAd).get())).crashlytics.purchase(c7931l10.yandex);
                    case 2:
                        C10523l c10523l = (C10523l) ((C5954l) this.f26743l).pro.get();
                        AbstractC17943l.yandex((C7931l) ((C10023l) ((C0511l) this.f26746l).yandex).f20419l);
                        InterfaceC11220l interfaceC11220l = c10523l.amazon;
                        AbstractC17943l.yandex(interfaceC11220l);
                        return interfaceC11220l;
                    case 3:
                        C11969l c11969l6 = (C11969l) ((C5954l) this.f26743l).billing.get();
                        C10023l c10023l = (C10023l) ((C0511l) this.f26746l).yandex;
                        C14437l c14437l = (C14437l) c10023l.f20418l;
                        C7931l c7931l11 = (C7931l) c10023l.f20419l;
                        AbstractC17943l.yandex(c7931l11);
                        c18548l = new C18548l(c11969l6, c14437l, c7931l11, (C8935l) ((InterfaceC9576l) ((C0511l) this.f26746l).amazon).get(), (List) ((InterfaceC9576l) ((C0511l) this.f26746l).subs).get(), (C8409l) ((C5954l) this.f26743l).startapp.get());
                        return c18548l;
                    case 4:
                        return new C8935l();
                    case 5:
                        C7931l c7931l12 = (C7931l) ((C10023l) ((C0511l) this.f26746l).yandex).f20419l;
                        AbstractC17943l.yandex(c7931l12);
                        C8935l c8935l = (C8935l) ((InterfaceC9576l) ((C0511l) this.f26746l).amazon).get();
                        C8958l c8958l2 = (C8958l) ((InterfaceC9576l) ((C0511l) this.f26746l).admob).get();
                        ArrayList arrayListMetrica = AbstractC14055l.metrica(c8935l);
                        arrayListMetrica.add(c8935l);
                        arrayListMetrica.add(c8958l2);
                        arrayListMetrica.addAll(c7931l12.firebase);
                        c9028l = arrayListMetrica;
                        return c9028l;
                    case 6:
                        C5664l c5664l5 = (C5664l) ((C13161l) ((C0511l) this.f26746l).ads).get();
                        C14588l c14588l2 = (C14588l) ((InterfaceC9576l) ((C0511l) this.f26746l).billing).get();
                        InterfaceC5389l interfaceC5389l5 = (InterfaceC5389l) ((InterfaceC9576l) ((C0511l) this.f26746l).crashlytics).get();
                        Integer num = (Integer) ((C10861l) interfaceC5389l5).crashlytics(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
                        if (num != null && num.intValue() == 1) {
                            z = true;
                        }
                        return new C8958l(c5664l5, c14588l2, z);
                    case 7:
                        InterfaceC5389l interfaceC5389l6 = (InterfaceC5389l) ((InterfaceC9576l) ((C0511l) this.f26746l).crashlytics).get();
                        C7931l c7931l13 = (C7931l) ((C10023l) ((C0511l) this.f26746l).yandex).f20419l;
                        AbstractC17943l.yandex(c7931l13);
                        C6760l c6760l = new C6760l(i8);
                        Object obj = ((C0511l) this.f26746l).subscription;
                        c18548l = new C5664l(interfaceC5389l6, c7931l13, c6760l);
                        return c18548l;
                    case 8:
                        C10023l c10023l2 = (C10023l) ((C0511l) this.f26746l).yandex;
                        C14437l c14437l2 = (C14437l) c10023l2.f20418l;
                        C7931l c7931l14 = (C7931l) c10023l2.f20419l;
                        AbstractC17943l.yandex(c7931l14);
                        InterfaceC11220l interfaceC11220l2 = (InterfaceC11220l) ((InterfaceC9576l) ((C0511l) this.f26746l).loadAd).get();
                        C18548l c18548l5 = (C18548l) ((C13161l) ((C0511l) this.f26746l).adcel).get();
                        C5664l c5664l6 = (C5664l) ((C13161l) ((C0511l) this.f26746l).ads).get();
                        C9028l c9028l4 = (C9028l) ((InterfaceC9576l) ((C0511l) this.f26746l).purchase).get();
                        C1663l c1663l = (C1663l) interfaceC11220l2;
                        C15053l c15053l = c1663l.purchase;
                        C1424l c1424l5 = new C1424l(c14437l2, c7931l14, c18548l5, c5664l6, c9028l4, c1663l);
                        C5954l c5954l3 = (C5954l) c15053l.f29576l;
                        C15389l c15389l2 = new C15389l();
                        c15389l2.loadAd = c5954l3;
                        c15389l2.yandex = c1424l5;
                        int i9 = 7;
                        c15389l2.crashlytics = C6693l.yandex(new C13698l(c5954l3, c15389l2, i2, i9));
                        c15389l2.amazon = C6693l.yandex(new C13698l(c5954l3, c15389l2, i, i9));
                        c15389l2.purchase = new C13698l(c5954l3, c15389l2, 4, i9);
                        c15389l2.billing = new C13698l(c5954l3, c15389l2, 5, i9);
                        c15389l2.mopub = new C13698l(c5954l3, c15389l2, 6, i9);
                        c15389l2.admob = new C13698l(c5954l3, c15389l2, i9, i9);
                        c15389l2.subs = new C13698l(c5954l3, c15389l2, 8, i9);
                        c15389l2.isPro = C6693l.yandex(new C13698l(c5954l3, c15389l2, i8, i9));
                        c15389l2.firebase = C6693l.yandex(new C13698l(c5954l3, c15389l2, z ? 1 : 0, i9));
                        C7276l c7276l3 = (C7276l) ((InterfaceC9576l) c15389l2.firebase).get();
                        synchronized (c1663l.billing) {
                            c1663l.mopub.add(c7276l3);
                        }
                        AbstractC17943l.yandex(c7276l3);
                        return c7276l3;
                    case 9:
                        C5664l c5664l7 = (C5664l) ((C13161l) ((C0511l) this.f26746l).ads).get();
                        c9028l = new C9028l(c5664l7, (C13161l) ((C0511l) this.f26746l).subscription, (C12292l) ((C5954l) this.f26743l).isVip.get(), c5664l7.f12041l);
                        return c9028l;
                    case 10:
                        return new C14588l();
                    case 11:
                        long j = Long.MAX_VALUE;
                        long j2 = Long.MAX_VALUE;
                        for (int i10 = 0; i10 < 3; i10++) {
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                            System.currentTimeMillis();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            if (jElapsedRealtimeNanos2 < j2) {
                                j2 = jElapsedRealtimeNanos2;
                            }
                        }
                        for (int i11 = 0; i11 < 3; i11++) {
                            long jNanoTime = System.nanoTime();
                            SystemClock.elapsedRealtimeNanos();
                            long jNanoTime2 = System.nanoTime() - jNanoTime;
                            if (jNanoTime2 < j) {
                                j = jNanoTime2;
                            }
                        }
                        return new C4802l();
                    case 12:
                        C18548l c18548l6 = (C18548l) ((C13161l) ((C0511l) this.f26746l).adcel).get();
                        c18548l = new C15400l(c18548l6);
                        return c18548l;
                    case 13:
                        return new C7230l();
                    case 14:
                        return AbstractC11990l.yandex(AbstractC10586l.billing(new C2993l((InterfaceC7042l) ((C5954l) this.f26743l).amazon.get()), AbstractC10586l.billing(((C11969l) ((C5954l) this.f26743l).billing.get()).billing, new C0499l("CXCP-Graph"))));
                    case 15:
                        c18548l = new C8445l();
                        return c18548l;
                    case 16:
                        c18548l = new C10013l((C18548l) ((C13161l) ((C0511l) this.f26746l).adcel).get(), (InterfaceC5389l) ((InterfaceC9576l) ((C0511l) this.f26746l).crashlytics).get(), (C0761l) ((InterfaceC9576l) ((C0511l) this.f26746l).vip).get(), (C8935l) ((InterfaceC9576l) ((C0511l) this.f26746l).amazon).get());
                        return c18548l;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        return new C0761l();
                    default:
                        throw new AssertionError(i7);
                }
        }
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public void m3675goto(String str, C9138l c9138l) {
        int i = this.f26744l + 1;
        Object[] objArr = (Object[]) this.f26743l;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                C8339l.subs("cannot store more than MAX_VALUE elements");
                return;
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Alert.DURATION_SHOW_INDEFINITELY;
            }
            this.f26743l = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.f26743l;
        int i4 = this.f26744l;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = c9138l;
        this.f26744l = i4 + 1;
    }

    public int inmobi(int i) {
        int i2 = this.f26744l;
        if (i < i2) {
            return -1;
        }
        int[] iArr = (int[]) this.f26743l;
        if (i >= iArr.length + i2) {
            return -1;
        }
        return iArr[i - i2] - 1;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m3676interface(int i, int i2) {
        if (i < 0) {
            AbstractC14825l.yandex("Negative lanes are not supported");
        }
        Signature(i);
        ((int[]) this.f26743l)[i - this.f26744l] = i2 + 1;
    }

    public void isPro(int i, InterfaceC13898l interfaceC13898l) {
        if (i < 0) {
            AbstractC14825l.yandex("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        C2443l c2443l = new C2443l(this.f26744l, i, interfaceC13898l);
        this.f26744l += i;
        ((C17893l) this.f26743l).crashlytics(c2443l);
    }

    public Object isVip(int i) {
        SparseArray sparseArray = (SparseArray) this.f26743l;
        if (this.f26744l == -1) {
            this.f26744l = 0;
        }
        while (true) {
            int i2 = this.f26744l;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f26744l--;
        }
        while (this.f26744l < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f26744l + 1)) {
            this.f26744l++;
        }
        return sparseArray.valueAt(this.f26744l);
    }

    public long license(InterfaceC10430l interfaceC10430l) {
        int iAmazon;
        C1014l c1014l = (C1014l) this.f26746l;
        C5478l c5478l = (C5478l) this.f26743l;
        while (interfaceC10430l.mopub() < interfaceC10430l.getLength() - 6) {
            int i = this.f26744l;
            long jMopub = interfaceC10430l.mopub();
            C13143l c13143l = new C13143l(17);
            int i2 = 0;
            boolean zLoadAd = false;
            interfaceC10430l.yandex(0, 2, c13143l.yandex);
            if (c13143l.mopub(0, ByteOrder.BIG_ENDIAN) != i) {
                interfaceC10430l.smaato();
                interfaceC10430l.admob((int) (jMopub - interfaceC10430l.getPosition()));
            } else {
                byte[] bArr = c13143l.yandex;
                while (i2 < 15 && (iAmazon = interfaceC10430l.amazon(2 + i2, 15 - i2, bArr)) != -1) {
                    i2 += iAmazon;
                }
                c13143l.m3561extends(i2 + 2);
                interfaceC10430l.smaato();
                interfaceC10430l.admob((int) (jMopub - interfaceC10430l.getPosition()));
                zLoadAd = AbstractC15439l.loadAd(c13143l, c5478l, i, c1014l);
            }
            if (zLoadAd) {
                break;
            }
            interfaceC10430l.admob(1);
        }
        if (interfaceC10430l.mopub() < interfaceC10430l.getLength() - 6) {
            return c1014l.f2761l;
        }
        interfaceC10430l.admob((int) (interfaceC10430l.getLength() - interfaceC10430l.mopub()));
        return c5478l.isPro;
    }

    public C15333l metrica(boolean z) {
        C2164l c2164l;
        C2164l c2164l2;
        if (z && (c2164l2 = (C2164l) this.f26746l) != null) {
            throw c2164l2.yandex();
        }
        C15333l c15333lAdmob = C15333l.admob(this.f26744l, (Object[]) this.f26743l, this);
        if (!z || (c2164l = (C2164l) this.f26746l) == null) {
            return c15333lAdmob;
        }
        throw c2164l.yandex();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void m3677native(C13071l c13071l, int i, int i2, C5978l c5978l, int i3, Object obj, long j, long j2) {
        subscription(new C3424l(this, c13071l, new C2040l(i, i2, c5978l, i3, obj, AbstractC15323l.m3986try(j), AbstractC15323l.m3986try(j2)), 0));
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public void m3678new(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = AbstractC14163l.loadAd;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.f26743l;
            long[] jArr2 = (long[]) this.f26746l;
            int i7 = this.f26744l;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = AbstractC14163l.loadAd;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean m3679package(Object obj) {
        C5950l c5950l = (C5950l) this.f26746l;
        return ((((Number) ((C0114l) this.f26743l).get(obj)).intValue() >>> c5950l.yandex) & ((1 << c5950l.loadAd) - 1)) == c5950l.crashlytics;
    }

    public int premium(Object obj) {
        C7661l c7661l = (C7661l) this.f26743l;
        int iAmazon = c7661l.amazon(obj);
        if (iAmazon >= 0) {
            return c7661l.crashlytics[iAmazon];
        }
        return -1;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m3680private(C13071l c13071l, int i, int i2, C5978l c5978l, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        subscription(new C1052l(this, c13071l, new C2040l(i, i2, c5978l, i3, obj, AbstractC15323l.m3986try(j), AbstractC15323l.m3986try(j2)), iOException, z));
    }

    public int pro(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!remoteconfig(i, i2));
        return i;
    }

    @Override // defpackage.InterfaceC6152l
    public int purchase(int i, byte[] bArr) {
        int i2 = this.f26744l;
        InterfaceC16922l interfaceC16922l = (InterfaceC16922l) this.f26743l;
        if (bArr.length - i < 0) {
            C18073l.ad("output buffer too small");
            return 0;
        }
        byte[] bArr2 = new byte[i2];
        byte[] bArr3 = new byte[4];
        interfaceC16922l.reset();
        int i3 = 0;
        if (i > i2) {
            do {
                loadAd(i3, bArr3);
                byte[] bArr4 = (byte[]) this.f26746l;
                interfaceC16922l.update(bArr4, 0, bArr4.length);
                interfaceC16922l.update(bArr3, 0, 4);
                interfaceC16922l.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i3 * i2, i2);
                i3++;
            } while (i3 < i / i2);
        }
        int i4 = i2 * i3;
        if (i4 < i) {
            loadAd(i3, bArr3);
            byte[] bArr5 = (byte[]) this.f26746l;
            interfaceC16922l.update(bArr5, 0, bArr5.length);
            interfaceC16922l.update(bArr3, 0, 4);
            interfaceC16922l.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i4, i - i4);
        }
        return i;
    }

    public boolean remoteconfig(int i, int i2) {
        int iInmobi = inmobi(i);
        return iInmobi == i2 || iInmobi == -1 || iInmobi == -2;
    }

    public int[] signatures(int i) {
        C11315l c11315l = (C11315l) this.f26746l;
        C1249l c1249l = (C1249l) AbstractC16901l.m4220for(m3664class(i, c11315l), c11315l);
        if (c1249l != null) {
            return c1249l.loadAd;
        }
        return null;
    }

    public void smaato() {
        C1298l c1298l;
        ImageView imageView = (ImageView) this.f26743l;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC2341l.yandex(drawable);
        }
        if (drawable == null || (c1298l = (C1298l) this.f26746l) == null) {
            return;
        }
        C7862l.purchase(drawable, c1298l, imageView.getDrawableState());
    }

    public AbstractC13675l startapp() {
        return metrica(false);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public int m3681static() {
        int iM3684throws = 0;
        int i = 0;
        while (true) {
            Object obj = ((Object[]) this.f26743l)[i];
            iM3684throws += obj != null ? m3684throws(obj) : 1;
            if (i == 1) {
                return iM3684throws;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public boolean m3682strictfp() {
        ColorStateList colorStateList;
        return ((Shader) this.f26743l) == null && (colorStateList = (ColorStateList) this.f26746l) != null && colorStateList.isStateful();
    }

    public synchronized void subs(BigInteger bigInteger) {
        ((WeakHashMap) this.f26743l).put(bigInteger, Boolean.TRUE);
        BigInteger[] bigIntegerArr = (BigInteger[]) this.f26746l;
        int i = this.f26744l;
        bigIntegerArr[i] = bigInteger;
        this.f26744l = (i + 1) % bigIntegerArr.length;
    }

    public void subscription(InterfaceC18679l interfaceC18679l) {
        for (C17808l c17808l : (CopyOnWriteArrayList) this.f26746l) {
            AbstractC15323l.m3966final(c17808l.yandex, new RunnableC12388l(interfaceC18679l, c17808l.loadAd, 26));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public int m3683synchronized(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.f26743l;
        int i9 = this.f26744l;
        int i10 = i9 + 3;
        this.f26744l = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.f26743l = Arrays.copyOf(jArr, iMax);
            this.f26746l = Arrays.copyOf((long[]) this.f26746l, iMax);
        }
        long[] jArr2 = (long[]) this.f26743l;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (4294967295L & ((long) i5));
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            AbstractC0081l.crashlytics("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            AbstractC0081l.crashlytics("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = AbstractC14163l.loadAd;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    public void tapsense(int i, int i2) {
        if (i > 131072) {
            AbstractC14825l.yandex("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.f26743l;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            AbstractC8669l.premium(i2, 0, (int[]) this.f26743l, iArr2, 12);
            this.f26743l = iArr2;
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int m3684throws(Object obj) {
        return ((long[]) obj).length;
    }

    public String toString() {
        switch (this.f26745l) {
            case 21:
                return ((String) this.f26743l) + "\t" + this.f26744l;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                StringBuilder sb = new StringBuilder();
                if (((EnumC9199l) this.f26743l) == EnumC9199l.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f26744l);
                sb.append(' ');
                sb.append((String) this.f26746l);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public AbstractC13675l vip() {
        return adcel();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public void m3685volatile(C13071l c13071l, int i, int i2, C5978l c5978l, int i3, Object obj, long j, long j2) {
        subscription(new C3424l(this, c13071l, new C2040l(i, i2, c5978l, i3, obj, AbstractC15323l.m3986try(j), AbstractC15323l.m3986try(j2)), 1));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    @Override // defpackage.InterfaceC4034l
    public C0386l yandex(InterfaceC10430l interfaceC10430l, long j) {
        switch (this.f26745l) {
            case 9:
                long position = interfaceC10430l.getPosition();
                long jLicense = license(interfaceC10430l);
                long jMopub = interfaceC10430l.mopub();
                interfaceC10430l.admob(Math.max(6, ((C5478l) this.f26743l).crashlytics));
                long jLicense2 = license(interfaceC10430l);
                long jMopub2 = interfaceC10430l.mopub();
                if (jLicense > j || jLicense2 <= j) {
                    return jLicense2 <= j ? new C0386l(-2, jLicense2, jMopub2) : new C0386l(-1, jLicense, position);
                }
                return new C0386l(0, -9223372036854775807L, jMopub);
            default:
                long position2 = interfaceC10430l.getPosition();
                int iMin = (int) Math.min(112800L, interfaceC10430l.getLength() - position2);
                C13143l c13143l = (C13143l) this.f26746l;
                c13143l.m3563native(iMin);
                interfaceC10430l.yandex(0, iMin, c13143l.yandex);
                int i = c13143l.crashlytics;
                long j2 = -1;
                long j3 = -1;
                long j4 = -9223372036854775807L;
                while (c13143l.yandex() >= 188) {
                    byte[] bArr = c13143l.yandex;
                    int i2 = c13143l.loadAd;
                    while (i2 < i && bArr[i2] != 71) {
                        i2++;
                    }
                    int i3 = i2 + 188;
                    if (i3 > i) {
                        return j4 != -9223372036854775807L ? new C0386l(-2, j4, position2 + j2) : C0386l.purchase;
                    }
                    long jCrashlytics = AbstractC2576l.crashlytics(c13143l, i2, this.f26744l);
                    if (jCrashlytics != -9223372036854775807L) {
                        long jLoadAd = ((C16391l) this.f26743l).loadAd(jCrashlytics);
                        if (jLoadAd > j) {
                            return j4 == -9223372036854775807L ? new C0386l(-1, jLoadAd, position2) : new C0386l(0, -9223372036854775807L, position2 + j3);
                        }
                        j4 = jLoadAd;
                        if (100000 + j4 > j) {
                            return new C0386l(0, -9223372036854775807L, position2 + ((long) i2));
                        }
                        j3 = i2;
                    }
                    c13143l.m3562for(i3);
                    j2 = i3;
                }
                if (j4 != -9223372036854775807L) {
                }
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    private final /* synthetic */ void m3666throw() {
    }

    @Override // defpackage.InterfaceC4930l
    public void mopub(Throwable th) {
    }

    public /* synthetic */ C13698l(char c, int i) {
        this.f26745l = i;
    }

    public C13698l(int i, AbstractC8859l abstractC8859l, AbstractC11918l abstractC11918l) {
        this.f26745l = 27;
        this.f26744l = i;
        this.f26743l = abstractC8859l;
        this.f26746l = abstractC11918l;
    }

    public C13698l(InterfaceC16922l interfaceC16922l) {
        this.f26745l = 14;
        this.f26743l = interfaceC16922l;
        this.f26744l = interfaceC16922l.getDigestSize();
    }

    public C13698l(C5384l c5384l) {
        this.f26745l = 20;
        this.f26744l = 5;
        this.f26746l = new HashSet();
        this.f26743l = c5384l;
    }

    public /* synthetic */ C13698l(Object obj, int i, Serializable serializable, int i2) {
        this.f26745l = i2;
        this.f26743l = obj;
        this.f26744l = i;
        this.f26746l = serializable;
    }

    public /* synthetic */ C13698l(Object obj, Object obj2, int i, int i2) {
        this.f26745l = i2;
        this.f26743l = obj;
        this.f26746l = obj2;
        this.f26744l = i;
    }

    public C13698l(PKIXBuilderParameters pKIXBuilderParameters) {
        this.f26745l = 20;
        this.f26744l = 5;
        this.f26746l = new HashSet();
        this.f26743l = new C5384l(new C15855l(pKIXBuilderParameters));
        this.f26744l = pKIXBuilderParameters.getMaxPathLength();
    }

    public C13698l(String str, int i) {
        this.f26745l = 10;
        this.f26743l = str;
        this.f26744l = i;
        C16990l c16990l = new C16990l();
        C17015l c17015l = new C17015l(8, this);
        InterfaceC6272l interfaceC6272l = AbstractC3552l.yandex;
        c16990l.yandex(C10541l.loadAd, new C0786l(2, c17015l));
        c16990l.yandex(AbstractC18358l.amazon, new C17049l(21));
        Unit unit = Unit.INSTANCE;
        Function1 function1 = (Function1) c16990l.f33122l;
        C4708l c4708l = new C4708l();
        c4708l.yandex = new C1306l(14);
        c4708l.crashlytics = 10;
        function1.invoke(c4708l);
        this.f26746l = new C16864l(new C2885l(c4708l), c16990l, true);
    }

    public C13698l(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.f26745l = 0;
        this.f26743l = arrayList;
        this.f26744l = i;
        this.f26746l = motionEvent;
        if (arrayList.isEmpty()) {
            C8339l.metrica("changes cannot be empty");
            throw null;
        }
    }

    public C13698l(C0114l c0114l, C5950l c5950l) {
        this.f26745l = 3;
        this.f26743l = c0114l;
        this.f26746l = c5950l;
        if (c5950l.loadAd == 1 && c5950l.crashlytics == 1) {
            this.f26744l = 1 << c5950l.yandex;
        } else {
            C10754l.license(c5950l, " was passed", "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ");
            throw null;
        }
    }

    public C13698l(ImageView imageView) {
        this.f26745l = 1;
        this.f26744l = 0;
        this.f26743l = imageView;
    }

    public C13698l(byte b, int i) {
        this.f26745l = i;
        switch (i) {
            case 12:
                this.f26743l = new int[16];
                this.f26746l = new C11315l();
                break;
            case 13:
                this.f26745l = 13;
                this.f26743l = new Object[2];
                this.f26746l = new long[2];
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f26743l = new C17893l(0, new C2443l[16]);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f26743l = new Object[8];
                this.f26744l = 0;
                break;
            default:
                this.f26743l = new WeakHashMap();
                this.f26746l = new BigInteger[8];
                this.f26744l = 0;
                break;
        }
    }

    public C13698l(C11983l c11983l) {
        this.f26745l = 24;
        this.f26743l = new SparseArray();
        this.f26746l = c11983l;
        this.f26744l = -1;
    }

    public C13698l(C5478l c5478l, int i) {
        this.f26745l = 9;
        this.f26743l = c5478l;
        this.f26744l = i;
        this.f26746l = new C1014l(0);
    }

    public C13698l(int i, C16391l c16391l) {
        this.f26745l = 26;
        this.f26744l = i;
        this.f26743l = c16391l;
        this.f26746l = new C13143l();
    }

    public C13698l(CopyOnWriteArrayList copyOnWriteArrayList, int i, C5019l c5019l) {
        this.f26745l = 17;
        this.f26746l = copyOnWriteArrayList;
        this.f26744l = i;
        this.f26743l = c5019l;
    }

    public C13698l(InterfaceC3114l interfaceC3114l) {
        this.f26745l = 4;
        this.f26743l = interfaceC3114l;
    }

    public C13698l(int i, int i2) {
        this.f26745l = i2;
        switch (i2) {
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.f26744l = i;
                break;
            default:
                this.f26743l = new Object[i * 2];
                this.f26744l = 0;
                break;
        }
    }

    public C13698l(C13350l c13350l, C6499l c6499l, int i) {
        this.f26745l = 16;
        this.f26746l = c13350l;
        this.f26743l = c6499l;
        this.f26744l = i;
    }
}
