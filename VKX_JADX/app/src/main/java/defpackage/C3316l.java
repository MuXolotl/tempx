package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.isPro;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3316l implements InterfaceC5457l, InterfaceC12198l, InterfaceC5479l, InterfaceC7630l, InterfaceC14026l, InterfaceC1519l, InterfaceC6848l, InterfaceC17061l, InterfaceC10466l, InterfaceC1184l, InterfaceC2353l, InterfaceC8145l, InterfaceC6632l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile C3316l f7070l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final int[] f7071l = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f7072l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7073l;

    public C3316l(int i) {
        this.f7073l = i;
        switch (i) {
            case 1:
                this.f7072l = new C6921l(5);
                break;
            case 6:
                this.f7072l = C5104l.crashlytics();
                break;
            case 7:
                this.f7072l = new ArrayList();
                break;
            case 8:
                this.f7072l = new HashSet();
                break;
            case 9:
                this.f7072l = (SmallDisplaySizeQuirk) AbstractC17919l.yandex(SmallDisplaySizeQuirk.class);
                break;
            case 13:
                C3103l c3103l = new C3103l();
                this.f7072l = c3103l;
                if (!c3103l.f6645l) {
                    if (c3103l.f6644l) {
                        AbstractC16941l.yandex("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c3103l.yandex();
                    c3103l.f6644l = true;
                    break;
                }
                break;
            case 14:
                this.f7072l = (ExtraCroppingQuirk) AbstractC17919l.yandex(ExtraCroppingQuirk.class);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                this.f7072l = new C12534l();
                break;
            case 20:
                this.f7072l = new Stack();
                break;
            case 22:
                C7714l.billing.getClass();
                C7714l c7714l = C7714l.admob;
                this.f7072l = c7714l.amazon != 2 ? new C7714l(c7714l.yandex, c7714l.loadAd, c7714l.crashlytics, 2) : c7714l;
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.f7072l = new HashMap();
                break;
            default:
                this.f7072l = new String[]{"other", "lyrics", "text transcription", "movement/part name", "events", "chord", "trivia", "URLs to webpages", "URLs to images"};
                break;
        }
    }

    public static C3316l remoteconfig() {
        if (f7070l == null) {
            synchronized (C3316l.class) {
                try {
                    if (f7070l == null) {
                        f7070l = new C3316l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7070l;
    }

    @Override // defpackage.InterfaceC14026l
    public C5113l ad(C16811l c16811l, List list) {
        return AbstractC7151l.purchase(new C5159l(-6));
    }

    @Override // defpackage.InterfaceC5479l
    public C5104l adcel() {
        throw null;
    }

    @Override // defpackage.InterfaceC6848l
    public C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        ((C12534l) this.f7072l).admob(c9902l, f, c4565l);
        return c9902l;
    }

    public void ads(int i, boolean z) {
        C6921l c6921l = (C6921l) this.f7072l;
        if (!z) {
            c6921l.getClass();
        } else {
            AbstractC12442l.subscription(!c6921l.f14494l);
            ((SparseBooleanArray) c6921l.f14493l).delete(i);
        }
    }

    public void billing(InterfaceC12553l interfaceC12553l) {
        Object obj = this.f7072l;
        if (obj == null) {
            this.f7072l = interfaceC12553l;
            return;
        }
        if (obj instanceof C6295l) {
            ((C6295l) obj).yandex(interfaceC12553l);
            return;
        }
        if (obj.equals(interfaceC12553l)) {
            return;
        }
        C6295l c6295l = AbstractC13087l.yandex;
        C6295l c6295l2 = new C6295l(2);
        c6295l2.smaato((InterfaceC12553l) obj);
        c6295l2.smaato(interfaceC12553l);
        this.f7072l = c6295l2;
    }

    @Override // defpackage.InterfaceC6632l
    public C15683l crashlytics(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC6632l interfaceC6632l = ((InterfaceC6632l[]) this.f7072l)[i];
            if (interfaceC6632l.loadAd(cls)) {
                return interfaceC6632l.crashlytics(cls);
            }
        }
        C10754l.ads("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.InterfaceC17061l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public int mo1317else() {
        isPro ispro = (isPro) this.f7072l;
        return ispro.vip - ispro.m145strictfp();
    }

    public void firebase(AbstractC7735l abstractC7735l) {
        if (!abstractC7735l.smaato()) {
            if (!(abstractC7735l instanceof C8710l)) {
                String strValueOf = String.valueOf(abstractC7735l.getClass());
                C8339l.metrica(AbstractC0653l.ads(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                return;
            } else {
                C8710l c8710l = (C8710l) abstractC7735l;
                firebase(c8710l.f17919l);
                firebase(c8710l.f17923l);
                return;
            }
        }
        int size = abstractC7735l.size();
        int[] iArr = C8710l.f17918l;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f7072l;
        if (stack.isEmpty() || ((AbstractC7735l) stack.peek()).size() >= i) {
            stack.push(abstractC7735l);
            return;
        }
        int i2 = iArr[iBinarySearch];
        AbstractC7735l c8710l2 = (AbstractC7735l) stack.pop();
        while (!stack.isEmpty() && ((AbstractC7735l) stack.peek()).size() < i2) {
            c8710l2 = new C8710l((AbstractC7735l) stack.pop(), c8710l2);
        }
        C8710l c8710l3 = new C8710l(c8710l2, abstractC7735l);
        while (!stack.isEmpty()) {
            int[] iArr2 = C8710l.f17918l;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, c8710l3.f17921l);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC7735l) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                c8710l3 = new C8710l((AbstractC7735l) stack.pop(), c8710l3);
            }
        }
        stack.push(c8710l3);
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C7909l((C14567l) ((InterfaceC2661l) this.f7072l).get());
    }

    @Override // defpackage.InterfaceC5457l
    public String getValue(int i) {
        String str;
        return (mo1044goto(i) && (str = ((String[]) this.f7072l)[i]) != null) ? str : "";
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public boolean mo1044goto(int i) {
        return i >= 0 && i <= 8;
    }

    @Override // defpackage.InterfaceC17061l
    public int isPro(View view) {
        return isPro.signatures(view) - ((ViewGroup.MarginLayoutParams) ((C13036l) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.InterfaceC6632l
    public boolean loadAd(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC6632l[]) this.f7072l)[i].loadAd(cls)) {
                return true;
            }
        }
        return false;
    }

    public void metrica(C10975l c10975l, C1770l c1770l) {
        C10111l[] c10111lArr = (C10111l[]) c1770l.f4179l;
        int i = 0;
        int i2 = 0;
        while (true) {
            C1770l[] c1770lArr = (C1770l[]) this.f7072l;
            if (i2 >= c1770lArr.length) {
                return;
            }
            C10111l c10111l = ((C10111l[]) c10975l.f22121l)[i2];
            C1770l c1770l2 = c1770lArr[i2];
            C5775l c5775l = (C5775l) c10111l.f20586l;
            int i3 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            c5775l.ads.getClass();
            c10111l.ad(((C10111l[]) c1770l2.f4179l)[i], c10111lArr[i]);
            int i4 = 1;
            while (i4 < c5775l.mopub) {
                C10111l c10111l2 = ((C10111l[]) c1770l2.f4179l)[i4];
                C10111l c10111l3 = c10111lArr[i4];
                int i5 = i;
                while (i5 < i3) {
                    int[] iArr2 = iArr;
                    iArr2[i5] = AbstractC2238l.admob(((long) ((int[]) c10111l2.f20587l)[i5]) * ((long) ((int[]) c10111l3.f20587l)[i5]));
                    i5++;
                    iArr = iArr2;
                    i3 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                int[] iArr3 = iArr;
                for (int i6 = 0; i6 < i3; i6++) {
                    int[] iArr4 = (int[]) c10111l.f20587l;
                    iArr4[i6] = iArr4[i6] + iArr3[i6];
                }
                i4++;
                iArr = iArr3;
                i = 0;
            }
            i2++;
            i = 0;
        }
    }

    public void mopub(int i, boolean z) {
        C6921l c6921l = (C6921l) this.f7072l;
        if (z) {
            c6921l.loadAd(i);
        } else {
            c6921l.getClass();
        }
    }

    @Override // defpackage.InterfaceC17061l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public View mo1318new(int i) {
        return ((isPro) this.f7072l).Signature(i);
    }

    @Override // defpackage.InterfaceC17061l
    public int premium() {
        return ((isPro) this.f7072l).m146synchronized();
    }

    @Override // defpackage.InterfaceC17061l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public int mo1319public(View view) {
        return isPro.appmetrica(view) + ((ViewGroup.MarginLayoutParams) ((C13036l) view.getLayoutParams())).rightMargin;
    }

    @Override // defpackage.InterfaceC8145l
    public C18595l purchase() {
        C16244l c16244l = new C16244l((SecureRandom) this.f7072l);
        return new C18595l(c16244l.yandex(), c16244l, 7);
    }

    public void smaato(byte[] bArr) {
        int i = 0;
        while (true) {
            C1770l[] c1770lArr = (C1770l[]) this.f7072l;
            if (i >= c1770lArr.length) {
                return;
            }
            C1770l c1770l = c1770lArr[i];
            int i2 = i << 8;
            int i3 = 0;
            while (true) {
                C10111l[] c10111lArr = (C10111l[]) c1770l.f4179l;
                if (i3 < c10111lArr.length) {
                    C10111l c10111l = c10111lArr[i3];
                    short s = (short) (i2 + i3);
                    C18396l c18396l = (C18396l) c10111l.f20589l;
                    c18396l.getClass();
                    C17951l c17951l = (C17951l) c18396l.f35934l;
                    byte[] bArr2 = new byte[842];
                    c17951l.reset();
                    c17951l.billing(0, bArr.length, bArr);
                    c17951l.billing(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
                    int i4 = 840;
                    c17951l.remoteconfig(0, 840, bArr2);
                    int iM2878synchronized = C10111l.m2878synchronized(c10111l, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, 840);
                    while (iM2878synchronized < 256) {
                        int i5 = i4 % 3;
                        for (int i6 = 0; i6 < i5; i6++) {
                            bArr2[i6] = bArr2[(i4 - i5) + i6];
                        }
                        c17951l.remoteconfig(i5, 168, bArr2);
                        i4 = 168 + i5;
                        iM2878synchronized += C10111l.m2878synchronized(c10111l, iM2878synchronized, 256 - iM2878synchronized, bArr2, i4);
                    }
                    i3++;
                }
            }
            i++;
        }
    }

    public void startapp(InterfaceC12553l interfaceC12553l) {
        Object obj = this.f7072l;
        if (AbstractC8576l.yandex(obj, interfaceC12553l)) {
            this.f7072l = null;
            return;
        }
        if (obj instanceof C6295l) {
            C6295l c6295l = (C6295l) obj;
            c6295l.remoteconfig(interfaceC12553l);
            int i = c6295l.amazon;
            if (i == 0) {
                this.f7072l = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f7072l = c6295l.billing();
            }
        }
    }

    public void subs(Path path) {
        ArrayList arrayList = (ArrayList) this.f7072l;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C18251l c18251l = (C18251l) arrayList.get(size);
            Matrix matrix = AbstractC4218l.yandex;
            if (c18251l != null && !c18251l.yandex) {
                AbstractC4218l.yandex(path, c18251l.amazon.subs() / 100.0f, c18251l.purchase.subs() / 100.0f, c18251l.billing.subs() / 360.0f);
            }
        }
    }

    @Override // defpackage.InterfaceC14026l
    public C5113l subscription(C16811l c16811l, C12417l c12417l, Bundle bundle) {
        return AbstractC7151l.purchase(new C5159l(-6));
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:95:0x0265 A[LOOP:2: B:59:0x01c4->B:95:0x0265, LOOP_END] */
    /* JADX WARN: Type inference failed for: r5v20, types: [byte[], java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Object tapsense(C5492l c5492l, String str, AbstractC0283l abstractC0283l) {
        C2816l c2816l;
        byte[] bArrTapsense;
        Object obj;
        EnumC9342l enumC9342l;
        long j;
        long j2;
        int i;
        byte[] bArrCopyOf;
        int i2;
        char c;
        byte[] bArr;
        EnumC9342l enumC9342l2;
        byte[] bArrYandex;
        C5958l c5958l;
        AutoCloseable autoCloseable;
        if (abstractC0283l instanceof C2816l) {
            c2816l = (C2816l) abstractC0283l;
            int i3 = c2816l.f6124l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2816l.f6124l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2816l = new C2816l(this, abstractC0283l);
            }
        } else {
            c2816l = new C2816l(this, abstractC0283l);
        }
        Object objPremium = c2816l.f6127l;
        int i4 = c2816l.f6124l;
        int i5 = 2;
        int i6 = 1;
        EnumC9342l enumC9342l3 = EnumC9342l.f19165l;
        try {
            if (i4 == 0) {
                AbstractC2829l.crashlytics(objPremium);
                Long l = new Long(c5492l.yandex);
                Long l2 = new Long(c5492l.loadAd);
                Boolean boolValueOf = Boolean.valueOf(c5492l.purchase);
                Boolean boolValueOf2 = Boolean.valueOf(c5492l.crashlytics);
                C2106l c2106l = c5492l.amazon;
                bArrTapsense = AbstractC16648l.tapsense(AbstractC8669l.m2416switch(new Object[]{l, l2, boolValueOf, boolValueOf2, new Long(c2106l != null ? c2106l.f4736l : 0L)}, ":", null, null, null, 62));
                C9457l c9457l = (C9457l) ((AbstractC18717l) ((C8688l) AbstractC8310l.yandex.f20466l).getValue()).yandex(vip.adcel);
                String name = ((ECGenParameterSpec) c9457l.yandex(new ECGenParameterSpec("secp256r1")).getParameterSpec(ECGenParameterSpec.class)).getName();
                C0554l c0554l = new C0554l();
                c0554l.f1956l = c9457l;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c9457l.yandex.f3605l;
                Object obj2 = concurrentHashMap.get("EC");
                if (obj2 == null) {
                    C16783l c16783l = new C16783l(new C15152l(21));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent("EC", c16783l);
                    obj2 = objPutIfAbsent == null ? c16783l : objPutIfAbsent;
                }
                c0554l.f1958l = (AbstractC14910l) obj2;
                c0554l.f1957l = name;
                String string = new C2582l(10).toString();
                int[] iArr = AbstractC15862l.yandex;
                C11753l c11753l = C11753l.crashlytics;
                int length = string.length();
                AbstractC15918l.admob(0, length, string.length());
                if (length == 0) {
                    bArrCopyOf = new byte[0];
                    i = 1;
                    obj = null;
                    enumC9342l = enumC9342l3;
                } else {
                    C14291l c14291l = c11753l.yandex;
                    obj = null;
                    enumC9342l = enumC9342l3;
                    if (c14291l.yandex) {
                        if (!c14291l.loadAd) {
                            j = 0;
                            long j3 = length;
                            j2 = 2;
                            int i7 = (int) (j3 / 2);
                            if (((long) i7) * 2 != j3) {
                                bArr = null;
                            } else {
                                byte[] bArr2 = new byte[i7];
                                int i8 = i7 - 1;
                                int i9 = 0;
                                for (int i10 = 0; i10 < i8; i10++) {
                                    bArr2[i10] = AbstractC15862l.amazon(i9, string);
                                    i9 += 2;
                                }
                                bArr2[i8] = AbstractC15862l.amazon(i9, string);
                                bArr = bArr2;
                            }
                        } else if ((length & 1) != 0) {
                            j = 0;
                            j2 = 2;
                            bArr = null;
                        } else {
                            int i11 = length >> 1;
                            j = 0;
                            bArr = new byte[i11];
                            int i12 = 0;
                            for (int i13 = 0; i13 < i11; i13++) {
                                bArr[i13] = AbstractC15862l.amazon(i12, string);
                                i12 += 2;
                            }
                            j2 = 2;
                        }
                        if (bArr != null) {
                            i = 1;
                            bArrCopyOf = bArr;
                        }
                    } else {
                        j = 0;
                        j2 = 2;
                    }
                    boolean z = c14291l.crashlytics;
                    if (length <= 0) {
                        C8339l.metrica("Failed requirement.");
                        return null;
                    }
                    long j4 = length;
                    long jIsPro = AbstractC15862l.isPro(1, j4, 4294967294L);
                    long j5 = j4 - (4294967295L * jIsPro);
                    long jIsPro2 = AbstractC15862l.isPro(2, j5, 4294967294L);
                    long j6 = j5 - (4294967296L * jIsPro2);
                    long j7 = j2;
                    long jIsPro3 = AbstractC15862l.isPro(0, j6, j7);
                    int iRemoteconfig = (int) (AbstractC0653l.remoteconfig(jIsPro2, 2147483647L, jIsPro * 2147483647L, jIsPro3) + ((long) (j6 - (j7 * jIsPro3) > j ? 1 : 0)));
                    byte[] bArr3 = new byte[iRemoteconfig];
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    while (i14 < length) {
                        int i18 = i6;
                        if (i16 == Integer.MAX_VALUE) {
                            if (string.charAt(i14) == '\r') {
                                int i19 = i14 + 1;
                                if (i19 < length) {
                                    c = '\n';
                                    if (string.charAt(i19) == '\n') {
                                        i14 += 2;
                                    }
                                } else {
                                    c = '\n';
                                }
                                i14 = i19;
                            } else {
                                c = '\n';
                                if (string.charAt(i14) != '\n') {
                                    StringBuilder sbSignature = AbstractC2812l.Signature("Expected a new line at index ", i14, ", but was ");
                                    sbSignature.append(string.charAt(i14));
                                    throw new NumberFormatException(sbSignature.toString());
                                }
                                i14++;
                            }
                            i2 = i5;
                            i16 = 0;
                        } else {
                            if (i17 == Integer.MAX_VALUE) {
                                int i20 = 0;
                                while (i20 < i5) {
                                    int i21 = i5;
                                    if (!AbstractC8576l.firebase("  ".charAt(i20), string.charAt(i14 + i20), z)) {
                                        int i22 = i21 + i14;
                                        if (i22 <= length) {
                                            length = i22;
                                        }
                                        throw new NumberFormatException("Expected group separator \"  \" at index " + i14 + ", but was " + string.substring(i14, length));
                                    }
                                    i20++;
                                    i5 = i21;
                                }
                                i2 = i5;
                                i14 += 2;
                            } else {
                                i2 = i5;
                            }
                            i16++;
                            i17++;
                            if (length - 2 >= i14) {
                                AbstractC15862l.mopub(i14, length, i2, string, "exactly");
                                throw null;
                            }
                            bArr3[i15] = AbstractC15862l.amazon(i14, string);
                            i14 += 2;
                            i15++;
                            i6 = i18;
                            i5 = i2;
                        }
                        i17 = 0;
                        i16++;
                        i17++;
                        if (length - 2 >= i14) {
                            AbstractC15862l.mopub(i14, length, i2, string, "exactly");
                            throw null;
                        }
                        bArr3[i15] = AbstractC15862l.amazon(i14, string);
                        i14 += 2;
                        i15++;
                        i6 = i18;
                        i5 = i2;
                    }
                    i = i6;
                    bArrCopyOf = i15 == iRemoteconfig ? bArr3 : Arrays.copyOf(bArr3, i15);
                }
                c2816l.f6126l = str;
                c2816l.f6125l = bArrTapsense;
                c2816l.f6124l = i;
                Object obj3 = C6726l.crashlytics;
                C2400l c2400l = C2400l.crashlytics;
                if (c2400l.equals(obj3)) {
                    Object obj4 = obj;
                    C8936l.isPro(c2400l, " is not supported");
                    return obj4;
                }
                if (c2400l.equals(AbstractC1288l.crashlytics) || c2400l.equals(C3612l.amazon)) {
                    objPremium = c0554l.applovin(bArrCopyOf);
                } else if (c2400l.equals(c2400l)) {
                    objPremium = c0554l.premium(bArrCopyOf);
                } else {
                    if (!c2400l.equals(C9724l.crashlytics)) {
                        Object obj5 = obj;
                        C18725l.billing();
                        return obj5;
                    }
                    List listM3338public = AbstractC12024l.m3338public(AbstractC16648l.ads(bArrCopyOf), new String[]{"\n"}, 6);
                    Iterator it = listM3338public.iterator();
                    int i23 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i23 = -1;
                            break;
                        }
                        if (AbstractC16648l.isVip((String) it.next(), "-----BEGIN ", false)) {
                            break;
                        }
                        i23++;
                    }
                    if (i23 == -1) {
                        Object obj6 = obj;
                        C8339l.smaato("Invalid PEM format: missing BEGIN label");
                        return obj6;
                    }
                    Iterator it2 = listM3338public.iterator();
                    int i24 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i24 = -1;
                            break;
                        }
                        if (AbstractC16648l.isVip((String) it2.next(), "-----END ", false)) {
                            break;
                        }
                        i24++;
                    }
                    if (i24 == -1) {
                        Object obj7 = obj;
                        C8339l.smaato("Invalid PEM format: missing END label");
                        return obj7;
                    }
                    String string2 = AbstractC12024l.m3330l(AbstractC12024l.m3326implements(AbstractC12024l.m3313break((String) listM3338public.get(i23), "-----BEGIN "), "-----")).toString();
                    if (AbstractC12024l.m3315catch(string2)) {
                        Object obj8 = obj;
                        C8339l.smaato("Invalid PEM format: BEGIN label is empty");
                        return obj8;
                    }
                    String string3 = AbstractC12024l.m3330l(AbstractC12024l.m3326implements(AbstractC12024l.m3313break((String) listM3338public.get(i24), "-----END "), "-----")).toString();
                    if (AbstractC12024l.m3315catch(string3)) {
                        Object obj9 = obj;
                        C8339l.smaato("Invalid PEM format: BEGIN label is empty");
                        return obj9;
                    }
                    if (!string2.equals(string3)) {
                        C11467l.vip("Invalid PEM format: BEGIN=`", string2, "`, END=`", string3, 96);
                        return null;
                    }
                    byte[] bArrYandex2 = C7714l.yandex(C7714l.billing, AbstractC16901l.m4210case(listM3338public.subList(i23 + 1, i24), "", null, null, null, 62), 0, 6);
                    if (!string2.equals("PUBLIC KEY")) {
                        throw new IllegalStateException(("Wrong PEM label, expected PemLabel(representation=PUBLIC KEY), actual " + ((Object) ("PemLabel(representation=" + string2 + ')'))).toString());
                    }
                    objPremium = c0554l.premium(bArrYandex2);
                }
                enumC9342l2 = enumC9342l;
                if (objPremium != enumC9342l2) {
                }
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    AbstractC2829l.crashlytics(objPremium);
                    return objPremium;
                }
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bArrTapsense = c2816l.f6125l;
            String str2 = c2816l.f6126l;
            AbstractC2829l.crashlytics(objPremium);
            str = str2;
            obj = null;
            enumC9342l2 = enumC9342l3;
            int length2 = bArrTapsense.length;
            AbstractC1163l.yandex(bArrTapsense.length, length2);
            ((Signature) ((C10166l) autoCloseable).yandex()).update(bArrTapsense, 0, length2);
            int length3 = bArrYandex.length;
            AbstractC1163l.yandex(bArrYandex.length, length3);
            boolean zVerify = ((Signature) ((C10166l) autoCloseable).yandex()).verify(bArrYandex, 0, length3);
            AbstractC1214l.yandex(c5958l, null);
            Boolean boolValueOf3 = Boolean.valueOf(zVerify);
            return boolValueOf3 == enumC9342l2 ? enumC9342l2 : boolValueOf3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1214l.yandex(c5958l, th);
                throw th2;
            }
        }
        C2217l c2217l = (C2217l) objPremium;
        vip vipVar = vip.applovin;
        C1424l c1424l = c2217l.loadAd;
        PublicKey publicKey = c2217l.crashlytics;
        String strAds = AbstractC0653l.ads(new StringBuilder(), vipVar != vip.signatures ? vipVar != vip.premium ? "SHA256" : "SHA224" : "SHA1", "withECDSA");
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) c1424l.f3601l;
        Object obj10 = concurrentHashMap2.get(strAds);
        if (obj10 == null) {
            C16279l c16279l = new C16279l(new C8362l(strAds, 2));
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(strAds, c16279l);
            obj10 = objPutIfAbsent2 == null ? c16279l : objPutIfAbsent2;
        }
        bArrYandex = C7714l.yandex((C7714l) this.f7072l, str, 0, 6);
        ?? r5 = obj;
        c2816l.f6126l = r5;
        c2816l.f6125l = r5;
        c2816l.f6124l = 2;
        c5958l = new C5958l(publicKey, new C10166l((AbstractC14910l) obj10));
        autoCloseable = c5958l.f12563l;
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public void mo274throws(C14785l c14785l) {
        this.f7072l = (SecureRandom) c14785l.f28907l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public String toString() {
        switch (this.f7073l) {
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return "return " + ((InterfaceC8396l) this.f7072l) + ';';
            default:
                return super.toString();
        }
    }

    public C13608l vip() {
        AbstractC3302l abstractC3302l = (AbstractC3302l) this.f7072l;
        C12418l c12418lAdmob = abstractC3302l instanceof C6457l ? ((C6457l) abstractC3302l).yandex : C5535l.loadAd.admob(abstractC3302l);
        C5001l c5001lM3650package = C13608l.m3650package();
        c5001lM3650package.subs((String) c12418lAdmob.f24518l);
        c5001lM3650package.isPro((AbstractC15257l) c12418lAdmob.f24519l);
        c5001lM3650package.admob(AbstractC15901l.smaato((C9358l) c12418lAdmob.f24521l));
        return (C13608l) c5001lM3650package.yandex();
    }

    @Override // defpackage.InterfaceC14026l
    public void yandex() {
        ((C16076l) this.f7072l).f31499l = null;
    }

    @Override // defpackage.InterfaceC14026l
    public /* synthetic */ void amazon() {
    }

    @Override // defpackage.InterfaceC14026l
    public /* synthetic */ void isVip() {
    }

    @Override // defpackage.InterfaceC14026l
    public /* synthetic */ void license() {
    }

    public /* synthetic */ C3316l(int i, boolean z) {
        this.f7073l = i;
    }

    public C3316l(C5775l c5775l) {
        this.f7073l = 17;
        int i = c5775l.billing;
        this.f7072l = new C1770l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C1770l[]) this.f7072l)[i2] = new C1770l(c5775l);
        }
    }

    public /* synthetic */ C3316l(int i, Object obj) {
        this.f7073l = i;
        this.f7072l = obj;
    }

    public C3316l(C5849l c5849l, C7615l c7615l, C5247l c5247l) {
        this.f7073l = 25;
        this.f7072l = c5849l;
        new C8688l(new C13932l(3, this));
    }

    public C3316l(InterfaceC16061l interfaceC16061l, InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l, int i) {
        this.f7073l = 24;
        this.f7072l = i > 0 ? new C5991l(i) : null;
    }

    public C3316l(TextView textView) {
        this.f7073l = 10;
        this.f7072l = new C13999l(textView);
    }

    public C3316l(C16616l c16616l) {
        this.f7073l = 1;
        C6921l c6921l = new C6921l(5);
        this.f7072l = c6921l;
        c6921l.crashlytics(c16616l.yandex);
    }
}
