package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚٖٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16543l implements InterfaceC17433l, InterfaceC12833l, InterfaceC17443l, InterfaceC14606l, InterfaceC2417l, InterfaceC1519l, InterfaceC6848l, InterfaceC1464l, InterfaceC6228l, InterfaceC1003l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C2260l f32480l = new C2260l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C2260l f32481l = new C2260l(0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f32482l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32483l;

    public C16543l(byte b, int i) {
        this.f32483l = i;
        switch (i) {
            case 13:
                this.f32482l = new ArrayList(20);
                break;
            case 15:
                this.f32482l = AbstractC1186l.metrica();
                break;
            case 21:
                this.f32482l = Build.VERSION.SDK_INT >= 28 ? new C16278l() : new C4269l(7);
                break;
            case 23:
                this.f32482l = new C0292l();
                break;
        }
    }

    public void Signature(C7972l c7972l, C3585l c3585l) {
        C18449l[] c18449lArr = (C18449l[]) c3585l.f7511l;
        int i = 0;
        int i2 = 0;
        while (true) {
            C3585l[] c3585lArr = (C3585l[]) this.f32482l;
            if (i2 >= c3585lArr.length) {
                return;
            }
            C18449l c18449l = ((C18449l[]) c7972l.f16631l)[i2];
            C3585l c3585l2 = c3585lArr[i2];
            C16827l c16827l = (C16827l) c18449l.f36009l;
            int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            ((C2494l) c16827l.admob).getClass();
            C18449l c18449l2 = ((C18449l[]) c3585l2.f7511l)[i];
            C18449l c18449l3 = c18449lArr[i];
            for (int i3 = i; i3 < 256; i3++) {
                ((int[]) c18449l.f36010l)[i3] = AbstractC9549l.crashlytics(((long) ((int[]) c18449l2.f36010l)[i3]) * ((long) ((int[]) c18449l3.f36010l)[i3]));
            }
            for (int i4 = 1; i4 < c16827l.crashlytics; i4++) {
                C18449l c18449l4 = ((C18449l[]) c3585l2.f7511l)[i4];
                C18449l c18449l5 = c18449lArr[i4];
                for (int i5 = 0; i5 < 256; i5++) {
                    iArr[i5] = AbstractC9549l.crashlytics(((long) ((int[]) c18449l4.f36010l)[i5]) * ((long) ((int[]) c18449l5.f36010l)[i5]));
                }
                for (int i6 = 0; i6 < 256; i6++) {
                    int[] iArr2 = (int[]) c18449l.f36010l;
                    iArr2[i6] = iArr2[i6] + iArr[i6];
                }
            }
            i2++;
            i = 0;
        }
    }

    public void ad(String str) {
        ArrayList arrayList = (ArrayList) this.f32482l;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public InterfaceC12244l adcel() {
        C12304l c12304lYandex = C12304l.yandex();
        if (c12304lYandex.crashlytics() == 1) {
            return new C1025l(true);
        }
        C10086l c10086lSmaato = AbstractC8020l.smaato(Boolean.FALSE);
        c12304lYandex.admob(new C13500l(c10086lSmaato, this));
        return c10086lSmaato;
    }

    @Override // defpackage.InterfaceC6848l
    public C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        ((C0292l) this.f32482l).admob(c9902l, f, c4565l);
        return c9902l;
    }

    public boolean ads() {
        Object[] objArr = ((C2490l) this.f32482l).yandex;
        if (objArr.length - 1 < 3) {
            C8936l.subs("idx 3 size mismatch");
            return false;
        }
        Object obj = objArr[3];
        if (obj == null) {
            C8936l.subs("idx 3 is empty");
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        C8936l.subs("idx 3 type mismatch");
        return false;
    }

    public void advert(float f, long j) {
        InterfaceC14859l interfaceC14859lM4555synchronized = ((C18449l) this.f32482l).m4555synchronized();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC14859lM4555synchronized.startapp(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC14859lM4555synchronized.loadAd(f);
        interfaceC14859lM4555synchronized.startapp(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        switch (this.f32483l) {
            case 12:
                C5807l c5807l = (C5807l) this.f32482l;
                try {
                    c5807l.loadAd(obj);
                } catch (Throwable th) {
                    c5807l.amazon(th);
                    return;
                }
                break;
            default:
                break;
        }
    }

    public void applovin(int i, long j, long j2) throws C17655l {
        C17316l c17316l = (C17316l) this.f32482l;
        c17316l.f33594break.getClass();
        if (i == 160) {
            c17316l.f33602final = false;
            c17316l.f33610new = 0L;
            return;
        }
        if (i == 174) {
            C3632l c3632l = new C3632l();
            c3632l.vip = -1;
            c3632l.metrica = -1;
            c3632l.startapp = -1;
            c3632l.adcel = -1;
            c3632l.ads = -1;
            c3632l.subscription = 0;
            c3632l.tapsense = -1;
            c3632l.Signature = 0.0f;
            c3632l.license = 0.0f;
            c3632l.pro = 0.0f;
            c3632l.ad = null;
            c3632l.advert = -1;
            c3632l.isVip = false;
            c3632l.signatures = -1;
            c3632l.premium = -1;
            c3632l.applovin = -1;
            c3632l.appmetrica = 1000;
            c3632l.inmobi = 200;
            c3632l.f7602throws = -1.0f;
            c3632l.f7594package = -1.0f;
            c3632l.f7600synchronized = -1.0f;
            c3632l.f7597strictfp = -1.0f;
            c3632l.f7603volatile = -1.0f;
            c3632l.f7592native = -1.0f;
            c3632l.f7595private = -1.0f;
            c3632l.f7586extends = -1.0f;
            c3632l.f7588for = -1.0f;
            c3632l.f7601throw = -1.0f;
            c3632l.f7585else = 1;
            c3632l.f7580case = -1;
            c3632l.f7599switch = 8000;
            c3632l.f7583continue = 0L;
            c3632l.f7582class = 0L;
            c3632l.f7596static = false;
            c3632l.f7587final = true;
            c3632l.f7593new = "eng";
            c17316l.advert = c3632l;
            c3632l.yandex = c17316l.pro;
            return;
        }
        if (i == 183) {
            if (c17316l.isVip) {
                return;
            }
            c17316l.mopub(i);
            c17316l.f33621throws = -1;
            c17316l.f33611package = -1L;
            c17316l.f33618synchronized = -1L;
            return;
        }
        if (i == 187) {
            if (c17316l.isVip) {
                return;
            }
            c17316l.mopub(i);
            c17316l.inmobi = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            c17316l.signatures = -1;
            c17316l.premium = -1L;
            return;
        }
        if (i == 20533) {
            c17316l.admob(i);
            c17316l.advert.subs = true;
            return;
        }
        if (i == 21968) {
            c17316l.admob(i);
            c17316l.advert.isVip = true;
            return;
        }
        if (i == 408125543) {
            long j3 = c17316l.subscription;
            if (j3 != -1 && j3 != j) {
                throw C17655l.yandex(null, "Multiple Segment elements not supported");
            }
            c17316l.subscription = j;
            c17316l.ads = j2;
            return;
        }
        if (i == 475249515) {
            if (c17316l.isVip) {
                return;
            }
            c17316l.appmetrica = true;
        } else if (i == 524531317 && !c17316l.isVip) {
            if (c17316l.amazon && c17316l.f33609native != -1) {
                c17316l.f33623volatile = true;
            } else {
                c17316l.f33594break.tapsense(new C9828l(c17316l.license));
                c17316l.isVip = true;
            }
        }
    }

    public void appmetrica(int i, String str) throws C17655l {
        C17316l c17316l = (C17316l) this.f32482l;
        if (i == 134) {
            c17316l.admob(i);
            c17316l.advert.crashlytics = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                c17316l.pro = str.equals("webm");
                return;
            }
            throw C17655l.yandex(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            c17316l.admob(i);
            c17316l.advert.loadAd = str;
        } else {
            if (i != 2274716) {
                return;
            }
            c17316l.admob(i);
            c17316l.advert.f7593new = str;
        }
    }

    @Override // defpackage.InterfaceC17433l
    public void billing(MenuC4984l menuC4984l) {
        C15053l c15053l = ((ActionMenuView) this.f32482l).f156l;
        if (c15053l != null) {
            c15053l.billing(menuC4984l);
        }
    }

    @Override // defpackage.InterfaceC2417l
    public void crashlytics(InterfaceC8782l interfaceC8782l) {
        C8797l c8797l = ((C7294l) this.f32482l).amazon.f13135l.amazon;
        C8750l c8750lMetrica = interfaceC8782l.metrica();
        ((C7294l) this.f32482l).amazon.f13134l.getClass();
        C15404l c15404l = c8797l.yandex;
        synchronized (c15404l.f30096l) {
            C1090l c1090l = c15404l.f30100l;
            c1090l.getClass();
            c1090l.smaato(new C14017l(c8750lMetrica));
        }
        ((C7294l) this.f32482l).amazon.f13135l.yandex();
    }

    @Override // defpackage.InterfaceC6228l
    public InterfaceC0684l firebase(String str) {
        return new C15802l(((InterfaceC11449l) this.f32482l).mo966this());
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C10111l((Context) ((C0656l) this.f32482l).f2129l, new C6162l(14), new C12899l(13), 12);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public C1473l mo404implements(View view, C1473l c1473l) {
        int i;
        int i2;
        int i3;
        int i4;
        int iAmazon = c1473l.amazon();
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) this.f32482l;
        Context context = layoutInflaterFactory2C14405l.f28206l;
        int iAmazon2 = c1473l.amazon();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C14405l.f28174l;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C14405l.f28174l.getLayoutParams();
            int i5 = 1;
            if (layoutInflaterFactory2C14405l.f28174l.isShown()) {
                if (layoutInflaterFactory2C14405l.f28199l == null) {
                    layoutInflaterFactory2C14405l.f28199l = new Rect();
                    layoutInflaterFactory2C14405l.f28210l = new Rect();
                }
                Rect rect = layoutInflaterFactory2C14405l.f28199l;
                Rect rect2 = layoutInflaterFactory2C14405l.f28210l;
                rect.set(c1473l.loadAd(), c1473l.amazon(), c1473l.crashlytics(), c1473l.yandex());
                ViewGroup viewGroup = layoutInflaterFactory2C14405l.f28201l;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z = AbstractC15958l.yandex;
                    AbstractC18456l.yandex(viewGroup, rect, rect2);
                    i3 = 0;
                } else {
                    if (AbstractC15958l.yandex) {
                        i3 = 0;
                    } else {
                        AbstractC15958l.yandex = true;
                        i3 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC15958l.loadAd = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC15958l.loadAd.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC15958l.loadAd;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i3] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i6 = rect.top;
                int i7 = rect.left;
                int i8 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C14405l.f28201l;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                C1473l c1473lYandex = AbstractC18487l.yandex(viewGroup2);
                int iLoadAd = c1473lYandex == null ? i3 : c1473lYandex.loadAd();
                int iCrashlytics = c1473lYandex == null ? i3 : c1473lYandex.crashlytics();
                if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i8) {
                    i4 = i3;
                } else {
                    marginLayoutParams.topMargin = i6;
                    marginLayoutParams.leftMargin = i7;
                    marginLayoutParams.rightMargin = i8;
                    i4 = 1;
                }
                if (i6 <= 0 || layoutInflaterFactory2C14405l.f28190l != null) {
                    View view2 = layoutInflaterFactory2C14405l.f28190l;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != iLoadAd || marginLayoutParams2.rightMargin != iCrashlytics) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = iLoadAd;
                            marginLayoutParams2.rightMargin = iCrashlytics;
                            layoutInflaterFactory2C14405l.f28190l.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C14405l.f28190l = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iLoadAd;
                    layoutParams.rightMargin = iCrashlytics;
                    layoutInflaterFactory2C14405l.f28201l.addView(layoutInflaterFactory2C14405l.f28190l, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C14405l.f28190l;
                i5 = view4 == null ? i3 : 1;
                if (i5 != 0 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C14405l.f28190l;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C14405l.f28166l && i5 != 0) {
                    iAmazon2 = i3;
                }
                i = i3;
                i2 = i5;
                i5 = i4;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i2 = 0;
                } else {
                    i2 = 0;
                    i5 = 0;
                }
            }
            if (i5 != 0) {
                layoutInflaterFactory2C14405l.f28174l.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C14405l.f28190l;
        if (view6 != null) {
            view6.setVisibility(i2 != 0 ? i : 8);
        }
        return AbstractC15872l.subs(view, iAmazon != iAmazon2 ? c1473l.billing(c1473l.loadAd(), iAmazon2, c1473l.crashlytics(), c1473l.yandex()) : c1473l);
    }

    public void inmobi(float f, float f2) {
        ((C18449l) this.f32482l).m4555synchronized().startapp(f, f2);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0297  */
    public void isPro(int i, int i2, InterfaceC10430l interfaceC10430l) throws C17655l {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        C17316l c17316l = (C17316l) this.f32482l;
        C5601l c5601l = c17316l.loadAd;
        SparseArray sparseArray = c17316l.crashlytics;
        C13143l c13143l = c17316l.firebase;
        C13143l c13143l2 = c17316l.subs;
        int i14 = 2;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (c17316l.f33620throw != 2) {
                    return;
                }
                C3632l c3632l = (C3632l) sparseArray.get(c17316l.f33597class);
                int i16 = c17316l.f33599default;
                C13143l c13143l3 = c17316l.startapp;
                if (i16 != 4 || !"V_VP9".equals(c3632l.crashlytics)) {
                    interfaceC10430l.remoteconfig(i2);
                    return;
                } else {
                    c13143l3.m3563native(i2);
                    interfaceC10430l.readFully(c13143l3.yandex, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                c17316l.admob(i);
                C3632l c3632l2 = c17316l.advert;
                int i17 = c3632l2.admob;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    interfaceC10430l.remoteconfig(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                c3632l2.f7581catch = bArr;
                interfaceC10430l.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                c17316l.admob(i);
                byte[] bArr2 = new byte[i2];
                c17316l.advert.isPro = bArr2;
                interfaceC10430l.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                interfaceC10430l.readFully(bArr3, 0, i2);
                c17316l.admob(i);
                c17316l.advert.firebase = new C0472l(bArr3, 1, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(c13143l.yandex, (byte) 0);
                interfaceC10430l.readFully(c13143l.yandex, 4 - i2, i2);
                c13143l.m3562for(0);
                c17316l.signatures = (int) c13143l.applovin();
                return;
            }
            if (i == 25506) {
                c17316l.admob(i);
                byte[] bArr4 = new byte[i2];
                c17316l.advert.smaato = bArr4;
                interfaceC10430l.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw C17655l.yandex(null, "Unexpected id: " + i);
            }
            c17316l.admob(i);
            byte[] bArr5 = new byte[i2];
            c17316l.advert.ad = bArr5;
            interfaceC10430l.readFully(bArr5, 0, i2);
            return;
        }
        int i18 = 8;
        if (c17316l.f33620throw == 0) {
            c17316l.f33597class = (int) c5601l.mopub(interfaceC10430l, false, true, 8);
            c17316l.f33608interface = c5601l.f11896l;
            c17316l.f33600else = -9223372036854775807L;
            c17316l.f33620throw = 1;
            c13143l2.m3563native(0);
        }
        C3632l c3632l3 = (C3632l) sparseArray.get(c17316l.f33597class);
        if (c3632l3 == null) {
            interfaceC10430l.remoteconfig(i2 - c17316l.f33608interface);
            c17316l.f33620throw = 0;
            return;
        }
        c3632l3.f7589goto.getClass();
        if (c17316l.f33620throw == 1) {
            c17316l.remoteconfig(interfaceC10430l, 3);
            int i19 = (c13143l2.yandex[2] & 6) >> 1;
            if (i19 == 0) {
                c17316l.f33617switch = 1;
                int[] iArr2 = c17316l.f33598continue;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                c17316l.f33598continue = iArr2;
                iArr2[0] = (i2 - c17316l.f33608interface) - 3;
            } else {
                c17316l.remoteconfig(interfaceC10430l, 4);
                int i20 = (c13143l2.yandex[3] & 255) + 1;
                c17316l.f33617switch = i20;
                int[] iArr3 = c17316l.f33598continue;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                c17316l.f33598continue = iArr3;
                if (i19 == 2) {
                    int i21 = (i2 - c17316l.f33608interface) - 4;
                    int i22 = c17316l.f33617switch;
                    Arrays.fill(iArr3, 0, i22, i21 / i22);
                } else {
                    if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = i3;
                        while (true) {
                            i10 = c17316l.f33617switch - 1;
                            iArr = c17316l.f33598continue;
                            if (i23 >= i10) {
                                break;
                            }
                            iArr[i23] = 0;
                            while (true) {
                                i11 = i25 + 1;
                                c17316l.remoteconfig(interfaceC10430l, i11);
                                int i26 = c13143l2.yandex[i25] & 255;
                                int[] iArr4 = c17316l.f33598continue;
                                i12 = iArr4[i23] + i26;
                                iArr4[i23] = i12;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i11;
                                }
                            }
                            i24 += i12;
                            i23++;
                            i25 = i11;
                        }
                        iArr[i10] = ((i2 - c17316l.f33608interface) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw C17655l.yandex(null, "Unexpected lacing value: " + i19);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = i3;
                        while (true) {
                            int i30 = c17316l.f33617switch - 1;
                            int[] iArr5 = c17316l.f33598continue;
                            if (i27 >= i30) {
                                i4 = i14;
                                i5 = i15;
                                iArr5[i30] = ((i2 - c17316l.f33608interface) - i29) - i28;
                                break;
                            }
                            iArr5[i27] = i15;
                            int i31 = i29 + 1;
                            c17316l.remoteconfig(interfaceC10430l, i31);
                            if (c13143l2.yandex[i29] == 0) {
                                throw C17655l.yandex(null, "No valid varint length mask found");
                            }
                            int i32 = i15;
                            while (true) {
                                if (i32 >= i18) {
                                    i6 = i18;
                                    i7 = i14;
                                    i8 = i15;
                                    j = 0;
                                    i9 = i31;
                                    break;
                                }
                                i6 = i18;
                                int i33 = 1 << (7 - i32);
                                i8 = i15;
                                if ((c13143l2.yandex[i29] & i33) != 0) {
                                    i9 = i31 + i32;
                                    c17316l.remoteconfig(interfaceC10430l, i9);
                                    i7 = i14;
                                    j = (~i33) & c13143l2.yandex[i29] & 255;
                                    while (i31 < i9) {
                                        j = (j << i6) | ((long) (c13143l2.yandex[i31] & 255));
                                        i31++;
                                    }
                                    if (i27 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i32 * 7) + 6)) - 1;
                                    break;
                                }
                                i32++;
                                i15 = i8;
                                i18 = i6;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw C17655l.yandex(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = c17316l.f33598continue;
                            if (i27 != 0) {
                                i34 += iArr6[i27 - 1];
                            }
                            iArr6[i27] = i34;
                            i28 += i34;
                            i27++;
                            i29 = i9;
                            i15 = i8;
                            i18 = i6;
                            i14 = i7;
                        }
                    }
                    byte[] bArr6 = c13143l2.yandex;
                    c17316l.f33596catch = c17316l.metrica((bArr6[1] & 255) | (bArr6[i5] << 8)) + c17316l.f33601extends;
                    if (c3632l3.purchase != 1 || (i == 163 && (c13143l2.yandex[i4] & 128) == 128)) {
                        i13 = 1;
                    } else {
                        i13 = i5;
                    }
                    c17316l.f33614static = i13;
                    c17316l.f33620throw = i4;
                    c17316l.f33595case = i5;
                }
            }
            i4 = 2;
            i5 = 0;
            byte[] bArr7 = c13143l2.yandex;
            c17316l.f33596catch = c17316l.metrica((bArr7[1] & 255) | (bArr7[i5] << 8)) + c17316l.f33601extends;
            if (c3632l3.purchase != 1) {
                i13 = 1;
            } else {
                i13 = 1;
            }
            c17316l.f33614static = i13;
            c17316l.f33620throw = i4;
            c17316l.f33595case = i5;
        }
        if (i == 163) {
            while (true) {
                int i35 = c17316l.f33595case;
                if (i35 >= c17316l.f33617switch) {
                    c17316l.f33620throw = 0;
                    return;
                }
                c17316l.subs(c3632l3, ((long) ((c17316l.f33595case * c3632l3.billing) / 1000)) + c17316l.f33596catch, c17316l.f33614static, c17316l.startapp(interfaceC10430l, c3632l3, c17316l.f33598continue[i35], false), 0);
                c17316l.f33595case++;
            }
        } else {
            while (true) {
                int i36 = c17316l.f33595case;
                if (i36 >= c17316l.f33617switch) {
                    return;
                }
                int[] iArr7 = c17316l.f33598continue;
                iArr7[i36] = c17316l.startapp(interfaceC10430l, c3632l3, iArr7[i36], true);
                c17316l.f33595case++;
            }
        }
    }

    public void isVip(float f, float f2, long j) {
        InterfaceC14859l interfaceC14859lM4555synchronized = ((C18449l) this.f32482l).m4555synchronized();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC14859lM4555synchronized.startapp(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC14859lM4555synchronized.yandex(f, f2);
        interfaceC14859lM4555synchronized.startapp(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object license(C16864l c16864l, String str, C13694l c13694l, AbstractC0283l abstractC0283l) throws Throwable {
        C9995l c9995l;
        InterfaceC13012l interfaceC13012lYandex;
        String str2;
        C7026l c7026l = (C7026l) this.f32482l;
        if (abstractC0283l instanceof C9995l) {
            c9995l = (C9995l) abstractC0283l;
            int i = c9995l.f20396l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9995l.f20396l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9995l = new C9995l(this, abstractC0283l);
            }
        } else {
            c9995l = new C9995l(this, abstractC0283l);
        }
        Object objAdvert = c9995l.f20397l;
        int i2 = c9995l.f20396l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdvert);
            C6806l c6806l = new C6806l();
            AbstractC12323l.yandex(c6806l, "/v1/auth/token");
            c13694l.invoke(c6806l);
            AbstractC0714l.purchase(c6806l, "grant_type", "refresh_token");
            AbstractC0714l.purchase(c6806l, "refresh_token", str);
            c6806l.loadAd = C17721l.loadAd;
            C3797l c3797l = new C3797l(c6806l, c16864l, 26);
            c9995l.f20398l = str;
            c9995l.f20396l = 1;
            objAdvert = c3797l.advert(c9995l);
            if (objAdvert != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            str = c9995l.f20398l;
            AbstractC2829l.crashlytics(objAdvert);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = c9995l.f20398l;
            AbstractC2829l.crashlytics(objAdvert);
        }
        if (objAdvert != null) {
            C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.spark.objects.authorization.SparkOAuthResponse");
            return null;
        }
        C14725l c14725l = (C14725l) objAdvert;
        String str3 = c14725l.yandex;
        C2106l c2106lPurchase = AbstractC7866l.yandex.purchase();
        int i3 = c14725l.crashlytics;
        AbstractC5303l.Companion.getClass();
        C0303l c0303l = new C0303l(AbstractC13880l.billing(c2106lPurchase, i3, AbstractC5303l.yandex).crashlytics(), str3, str2);
        AbstractC0775l.m675volatile(c7026l, c0303l);
        return c0303l;
        AbstractC10022l abstractC10022l = (AbstractC10022l) objAdvert;
        if (!AbstractC8576l.yandex(abstractC10022l.mopub(), C2759l.f5975l)) {
            AbstractC0775l.m673package(c7026l);
            return null;
        }
        C14249l c14249lLoadAd = abstractC10022l.loadAd();
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C14725l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C14725l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
        c9995l.f20398l = str;
        c9995l.f20396l = 2;
        objAdvert = c14249lLoadAd.yandex(c11310l, c9995l);
        if (objAdvert != enumC9342l) {
            str2 = str;
            if (objAdvert != null) {
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.spark.objects.authorization.SparkOAuthResponse");
                return null;
            }
            C14725l c14725l2 = (C14725l) objAdvert;
            String str4 = c14725l2.yandex;
            C2106l c2106lPurchase2 = AbstractC7866l.yandex.purchase();
            int i4 = c14725l2.crashlytics;
            AbstractC5303l.Companion.getClass();
            C0303l c0303l2 = new C0303l(AbstractC13880l.billing(c2106lPurchase2, i4, AbstractC5303l.yandex).crashlytics(), str4, str2);
            AbstractC0775l.m675volatile(c7026l, c0303l2);
            return c0303l2;
        }
        return enumC9342l;
    }

    public void loadAd(String str, String str2) {
        AbstractC12081l.crashlytics(str);
        AbstractC12081l.amazon(str2, str);
        AbstractC12081l.loadAd(this, str, str2);
    }

    public void metrica() {
        ((AbstractC0306l) this.f32482l).getClass();
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        ListenableFuture listenableFutureAmazon;
        switch (this.f32483l) {
            case 12:
                ((C5807l) this.f32482l).amazon(th);
                return;
            default:
                C15615l c15615l = (C15615l) this.f32482l;
                RunnableC11297l runnableC11297l = new RunnableC11297l(13, c15615l);
                if (AbstractC12225l.purchase()) {
                    runnableC11297l.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    AbstractC5641l.purchase("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new RunnableC10311l(runnableC11297l, countDownLatch, 14)));
                    try {
                        if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e) {
                        throw new C6451l(6, e);
                    }
                }
                C5762l c5762l = (C5762l) c15615l.f30481l;
                if (c5762l != null) {
                    AbstractC3984l.ad(c5762l.vip.vip, new C1412l(21, c15615l));
                    listenableFutureAmazon = ((C5762l) c15615l.f30481l).amazon();
                } else {
                    listenableFutureAmazon = C11077l.f22285l;
                }
                synchronized (c15615l.f30480l) {
                    c15615l.f30486l = null;
                    c15615l.f30487l = listenableFutureAmazon;
                    ((HashMap) c15615l.f30483l).clear();
                    ((HashSet) c15615l.f30485l).clear();
                    Unit unit = Unit.INSTANCE;
                }
                c15615l.metrica(null, null);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
    
        if (r0 == r9) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object premium(defpackage.C16864l r15, defpackage.C13694l r16, defpackage.AbstractC0283l r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16543l.premium(lٗؓ۟, lٍْ۟, lّؑۧ):java.lang.Object");
    }

    public void pro() {
        C11561l c11561l = (C11561l) this.f32482l;
        c11561l.getClass();
        if (C11561l.loadAd.getAndSet(c11561l, EnumC10706l.f21710l) == EnumC10706l.f21711l) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object purchase(AbstractC0283l abstractC0283l) {
        C4949l c4949l;
        if (abstractC0283l instanceof C4949l) {
            c4949l = (C4949l) abstractC0283l;
            int i = c4949l.f10084l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4949l.f10084l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4949l = new C4949l(this, abstractC0283l);
            }
        } else {
            c4949l = new C4949l(this, abstractC0283l);
        }
        Object obj = c4949l.f10083l;
        int i2 = c4949l.f10084l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            throw null;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        if (((C11561l) this.f32482l).yandex(EnumC10706l.f21712l, EnumC10706l.f21711l)) {
            return Unit.INSTANCE;
        }
        throw null;
    }

    public void remoteconfig(float f, float f2, float f3, float f4, int i) {
        ((C18449l) this.f32482l).m4555synchronized().metrica(f, f2, f3, f4, i);
    }

    public void signatures(String str, String str2) {
        AbstractC12081l.crashlytics(str);
        AbstractC12081l.amazon(str2, str);
        ad(str);
        AbstractC12081l.loadAd(this, str, str2);
    }

    public C8309l smaato() {
        return new C8309l((String[]) ((ArrayList) this.f32482l).toArray(new String[0]));
    }

    public void startapp(byte[] bArr) {
        int i = 0;
        while (true) {
            C3585l[] c3585lArr = (C3585l[]) this.f32482l;
            if (i >= c3585lArr.length) {
                return;
            }
            C3585l c3585l = c3585lArr[i];
            int i2 = i << 8;
            int i3 = 0;
            while (true) {
                C18449l[] c18449lArr = (C18449l[]) c3585l.f7511l;
                if (i3 < c18449lArr.length) {
                    C18449l c18449l = c18449lArr[i3];
                    short s = (short) (i2 + i3);
                    C2494l c2494l = (C2494l) c18449l.f36012l;
                    c2494l.getClass();
                    C17951l c17951l = (C17951l) c2494l.f5291l;
                    byte[] bArr2 = new byte[842];
                    c17951l.reset();
                    c17951l.billing(0, bArr.length, bArr);
                    c17951l.billing(0, 2, new byte[]{(byte) s, (byte) (s >> 8)});
                    int i4 = 840;
                    c17951l.remoteconfig(0, 840, bArr2);
                    int iM4531final = C18449l.m4531final(c18449l, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES, bArr2, 840);
                    while (iM4531final < 256) {
                        int i5 = i4 % 3;
                        for (int i6 = 0; i6 < i5; i6++) {
                            bArr2[i6] = bArr2[(i4 - i5) + i6];
                        }
                        c17951l.remoteconfig(i5, 168, bArr2);
                        i4 = 168 + i5;
                        iM4531final += C18449l.m4531final(c18449l, iM4531final, 256 - iM4531final, bArr2, i4);
                    }
                    i3++;
                }
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC1003l
    public FileChannel subs() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f32482l;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        C1759l.ads(parcelFileDescriptor, "Not a file: ");
        return null;
    }

    public void subscription(float f, float f2, float f3, float f4) {
        C18449l c18449l = (C18449l) this.f32482l;
        InterfaceC14859l interfaceC14859lM4555synchronized = c18449l.m4555synchronized();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c18449l.m4551private() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18449l.m4551private() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            AbstractC11597l.yandex("Width and height must be greater than or equal to zero");
        }
        c18449l.m4534abstract(jFloatToRawIntBits);
        interfaceC14859lM4555synchronized.startapp(f, f2);
    }

    public void tapsense(int i, long j) throws C17655l {
        C17316l c17316l = (C17316l) this.f32482l;
        if (i == 240) {
            if (c17316l.isVip) {
                return;
            }
            c17316l.mopub(i);
            if (c17316l.f33618synchronized == -1) {
                c17316l.f33618synchronized = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (c17316l.isVip) {
                return;
            }
            c17316l.mopub(i);
            if (c17316l.f33611package == -1) {
                c17316l.f33611package = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C17655l.yandex(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C17655l.yandex(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    c17316l.admob(i);
                    c17316l.advert.purchase = 2;
                    return;
                }
                if (i2 == 2) {
                    c17316l.admob(i);
                    c17316l.advert.purchase = 1;
                    return;
                } else if (i2 == 17) {
                    c17316l.admob(i);
                    c17316l.advert.purchase = 3;
                    return;
                } else if (i2 != 33) {
                    c17316l.admob(i);
                    c17316l.advert.purchase = -1;
                    return;
                } else {
                    c17316l.admob(i);
                    c17316l.advert.purchase = 5;
                    return;
                }
            case 136:
                c17316l.admob(i);
                c17316l.advert.f7587final = j == 1;
                return;
            case 155:
                c17316l.f33600else = c17316l.metrica(j);
                return;
            case 159:
                c17316l.admob(i);
                c17316l.advert.f7585else = (int) j;
                return;
            case 176:
                c17316l.admob(i);
                c17316l.advert.vip = (int) j;
                return;
            case 179:
                if (c17316l.isVip) {
                    return;
                }
                c17316l.mopub(i);
                c17316l.inmobi = c17316l.metrica(j);
                return;
            case 186:
                c17316l.admob(i);
                c17316l.advert.metrica = (int) j;
                return;
            case 215:
                c17316l.admob(i);
                c17316l.advert.amazon = (int) j;
                return;
            case 231:
                c17316l.f33601extends = c17316l.metrica(j);
                return;
            case 238:
                c17316l.f33599default = (int) j;
                return;
            case 247:
                if (c17316l.isVip) {
                    return;
                }
                c17316l.mopub(i);
                c17316l.f33621throws = (int) j;
                return;
            case 251:
                c17316l.f33602final = true;
                return;
            case 16871:
                c17316l.admob(i);
                c17316l.advert.admob = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C17655l.yandex(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw C17655l.yandex(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C17655l.yandex(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C17655l.yandex(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C17655l.yandex(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                c17316l.premium = j + c17316l.subscription;
                return;
            case 21432:
                int i3 = (int) j;
                c17316l.admob(i);
                if (i3 == 0) {
                    c17316l.advert.advert = 0;
                    return;
                }
                if (i3 == 1) {
                    c17316l.advert.advert = 2;
                    return;
                } else if (i3 == 3) {
                    c17316l.advert.advert = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    c17316l.advert.advert = 3;
                    return;
                }
            case 21680:
                c17316l.admob(i);
                c17316l.advert.adcel = (int) j;
                return;
            case 21682:
                c17316l.admob(i);
                c17316l.advert.subscription = (int) j;
                return;
            case 21690:
                c17316l.admob(i);
                c17316l.advert.ads = (int) j;
                return;
            case 21930:
                c17316l.admob(i);
                c17316l.advert.f7584default = j == 1;
                return;
            case 21938:
                c17316l.admob(i);
                C3632l c3632l = c17316l.advert;
                c3632l.isVip = true;
                c3632l.startapp = (int) j;
                return;
            case 21998:
                c17316l.admob(i);
                c17316l.advert.mopub = (int) j;
                return;
            case 22186:
                c17316l.admob(i);
                c17316l.advert.f7583continue = j;
                return;
            case 22203:
                c17316l.admob(i);
                c17316l.advert.f7582class = j;
                return;
            case 25188:
                c17316l.admob(i);
                c17316l.advert.f7580case = (int) j;
                return;
            case 30114:
                c17316l.f33610new = j;
                return;
            case 30321:
                c17316l.admob(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    c17316l.advert.tapsense = 0;
                    return;
                }
                if (i4 == 1) {
                    c17316l.advert.tapsense = 1;
                    return;
                } else if (i4 == 2) {
                    c17316l.advert.tapsense = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    c17316l.advert.tapsense = 3;
                    return;
                }
            case 2352003:
                c17316l.admob(i);
                c17316l.advert.billing = (int) j;
                return;
            case 2807729:
                c17316l.tapsense = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c17316l.admob(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            c17316l.advert.applovin = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            c17316l.advert.applovin = 1;
                            return;
                        }
                    case 21946:
                        c17316l.admob(i);
                        int iMopub = C1591l.mopub((int) j);
                        if (iMopub != -1) {
                            c17316l.advert.premium = iMopub;
                            return;
                        }
                        return;
                    case 21947:
                        c17316l.admob(i);
                        c17316l.advert.isVip = true;
                        int iBilling = C1591l.billing((int) j);
                        if (iBilling != -1) {
                            c17316l.advert.signatures = iBilling;
                            return;
                        }
                        return;
                    case 21948:
                        c17316l.admob(i);
                        c17316l.advert.appmetrica = (int) j;
                        return;
                    case 21949:
                        c17316l.admob(i);
                        c17316l.advert.inmobi = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // defpackage.InterfaceC18266l
    /* JADX INFO: renamed from: throws */
    public void mo614throws(InterfaceC3128l interfaceC3128l) {
        ((C7294l) this.f32482l).amazon.f13135l.crashlytics.yandex(3).loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void vip(C5591l c5591l, AbstractC0283l abstractC0283l) {
        C16850l c16850l;
        if (abstractC0283l instanceof C16850l) {
            c16850l = (C16850l) abstractC0283l;
            int i = c16850l.f32885l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16850l.f32885l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16850l = new C16850l(this, abstractC0283l);
            }
        } else {
            c16850l = new C16850l(this, abstractC0283l);
        }
        Object obj = c16850l.f32884l;
        int i2 = c16850l.f32885l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C1008l c1008l = (C1008l) this.f32482l;
            c16850l.f32885l = 1;
            c1008l.yandex(c5591l, c16850l);
            return;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
        } else {
            AbstractC2829l.crashlytics(obj);
            C17132l.firebase();
        }
    }

    @Override // defpackage.InterfaceC17433l
    public boolean yandex(MenuC4984l menuC4984l, MenuItem menuItem) {
        InterfaceC6784l interfaceC6784l = ((ActionMenuView) this.f32482l).f163l;
        return interfaceC6784l != null && interfaceC6784l.onMenuItemClick(menuItem);
    }

    public C16543l(C16827l c16827l) {
        this.f32483l = 22;
        int i = c16827l.loadAd;
        this.f32482l = new C3585l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C3585l[]) this.f32482l)[i2] = new C3585l(c16827l);
        }
    }

    public C16543l(Set set) {
        this.f32483l = 0;
        this.f32482l = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2187l c2187l = (C2187l) it.next();
            HashMap map = (HashMap) this.f32482l;
            c2187l.getClass();
            map.put(AbstractC17716l.class, c2187l.yandex);
        }
    }

    public /* synthetic */ C16543l(int i, Object obj) {
        this.f32483l = i;
        this.f32482l = obj;
    }

    public C16543l(AbstractC3872l abstractC3872l) {
        this.f32483l = 25;
        this.f32482l = AbstractC1805l.crashlytics(EnumC10706l.f21712l);
    }

    public C16543l(Notification notification) {
        this.f32483l = 18;
        notification.getClass();
        this.f32482l = notification;
    }

    public C16543l(int i) {
        this.f32483l = 20;
        this.f32482l = AbstractC11190l.yandex(new int[i]);
    }
}
