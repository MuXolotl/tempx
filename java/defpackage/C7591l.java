package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؚۢٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7591l extends FrameLayout {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C0111l f15596l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16950l f15597l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AtomicReference f15598l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public AbstractC2786l f15599l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC12694l f15600l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public EnumC2529l f15601l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C11273l f15602l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C7026l f15603l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f15604l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8788l f15605l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public MotionEvent f15606l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C14212l f15607l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C13716l f15608l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public InterfaceC15879l f15609l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final ViewOnLayoutChangeListenerC18363l f15610l;

    public C7591l(Context context) {
        super(context, null, 0, 0);
        this.f15601l = EnumC2529l.PERFORMANCE;
        C8788l c8788l = new C8788l();
        c8788l.admob = EnumC7078l.FILL_CENTER;
        this.f15605l = c8788l;
        this.f15604l = true;
        this.f15608l = new C13716l(EnumC7384l.f15311l);
        this.f15598l = new AtomicReference();
        this.f15607l = new C14212l(c8788l);
        this.f15596l = new C0111l(1, this);
        this.f15610l = new ViewOnLayoutChangeListenerC18363l(2, this);
        this.f15603l = new C7026l(17, this);
        AbstractC12225l.crashlytics();
        Resources.Theme theme = context.getTheme();
        int[] iArr = AbstractC0887l.yandex;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        AbstractC15872l.remoteconfig(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, ((EnumC7078l) c8788l.admob).f14827l);
            for (EnumC7078l enumC7078l : EnumC7078l.values()) {
                if (enumC7078l.f14827l == integer) {
                    setScaleType(enumC7078l);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (EnumC2529l enumC2529l : EnumC2529l.values()) {
                        if (enumC2529l.f5511l == integer2) {
                            setImplementationMode(enumC2529l);
                            typedArrayObtainStyledAttributes.recycle();
                            this.f15602l = new C11273l(context, new C6536l(26, this));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            C16950l c16950l = new C16950l(context, null, 0, 0);
                            c16950l.setBackgroundColor(-1);
                            c16950l.setAlpha(0.0f);
                            c16950l.setElevation(Float.MAX_VALUE);
                            this.f15597l = c16950l;
                            c16950l.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean crashlytics(C15691l c15691l, EnumC2529l enumC2529l) {
        boolean zEquals = c15691l.purchase.adcel().subscription().equals("androidx.camera.camera2.legacy");
        boolean z = (AbstractC1769l.yandex.loadAd(SurfaceViewStretchedQuirk.class) == null && AbstractC1769l.yandex.loadAd(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z) {
            int iOrdinal = enumC2529l.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                C1759l.ads(enumC2529l, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private InterfaceC2406l getScreenFlashInternal() {
        return this.f15597l.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    C1759l.isPro(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(InterfaceC2406l interfaceC2406l) {
        AbstractC2786l abstractC2786l = this.f15599l;
        if (abstractC2786l == null) {
            AbstractC5088l.yandex("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        EnumC17323l enumC17323l = EnumC17323l.f33635l;
        C4738l c4738l = new C4738l(enumC17323l, interfaceC2406l);
        C4738l c4738lAdmob = abstractC2786l.admob();
        abstractC2786l.appmetrica.put(enumC17323l, c4738l);
        C4738l c4738lAdmob2 = abstractC2786l.admob();
        if (c4738lAdmob2 == null || c4738lAdmob2.equals(c4738lAdmob)) {
            return;
        }
        abstractC2786l.startapp();
    }

    public Bitmap getBitmap() {
        AbstractC12225l.crashlytics();
        AbstractC12694l abstractC12694l = this.f15600l;
        if (abstractC12694l == null) {
            return null;
        }
        FrameLayout frameLayout = abstractC12694l.loadAd;
        Bitmap bitmapLoadAd = abstractC12694l.loadAd();
        if (bitmapLoadAd == null) {
            return null;
        }
        C8788l c8788l = abstractC12694l.crashlytics;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!c8788l.admob()) {
            return bitmapLoadAd;
        }
        Matrix matrixBilling = c8788l.billing();
        RectF rectFMopub = c8788l.mopub(layoutDirection, size);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapLoadAd.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixBilling);
        matrix.postScale(rectFMopub.width() / ((Size) c8788l.purchase).getWidth(), rectFMopub.height() / ((Size) c8788l.purchase).getHeight());
        matrix.postTranslate(rectFMopub.left, rectFMopub.top);
        canvas.drawBitmap(bitmapLoadAd, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public AbstractC2786l getController() {
        AbstractC12225l.crashlytics();
        return this.f15599l;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public EnumC2529l getImplementationMode() {
        AbstractC12225l.crashlytics();
        return this.f15601l;
    }

    public AbstractC3286l getMeteringPointFactory() {
        AbstractC12225l.crashlytics();
        return this.f15607l;
    }

    public C5570l getOutputTransform() {
        Matrix matrixPurchase;
        C8788l c8788l = this.f15605l;
        AbstractC12225l.crashlytics();
        try {
            matrixPurchase = c8788l.purchase(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrixPurchase = null;
        }
        Rect rect = (Rect) c8788l.billing;
        if (matrixPurchase == null || rect == null) {
            AbstractC5088l.yandex("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = AbstractC18611l.yandex;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(AbstractC18611l.yandex, rectF2, Matrix.ScaleToFit.FILL);
        matrixPurchase.preConcat(matrix);
        if (this.f15600l instanceof C3608l) {
            matrixPurchase.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            AbstractC5088l.tapsense("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new C5570l();
    }

    public AbstractC8769l getPreviewStreamState() {
        return this.f15608l;
    }

    public EnumC7078l getScaleType() {
        AbstractC12225l.crashlytics();
        return (EnumC7078l) this.f15605l.admob;
    }

    public InterfaceC2406l getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        AbstractC12225l.crashlytics();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        C8788l c8788l = this.f15605l;
        if (!c8788l.admob()) {
            return null;
        }
        Matrix matrix = new Matrix((Matrix) c8788l.mopub);
        matrix.postConcat(c8788l.purchase(layoutDirection, size));
        return matrix;
    }

    public InterfaceC4969l getSurfaceProvider() {
        AbstractC12225l.crashlytics();
        return this.f15603l;
    }

    public C14671l getViewPort() {
        AbstractC12225l.crashlytics();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        int rotation = defaultDisplay.getRotation();
        AbstractC12225l.crashlytics();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        C14671l c14671l = new C14671l();
        c14671l.yandex = viewPortScaleType;
        c14671l.loadAd = rational;
        c14671l.crashlytics = rotation;
        c14671l.amazon = layoutDirection;
        return c14671l;
    }

    public final void loadAd() {
        Rect rect;
        Display defaultDisplay;
        InterfaceC15879l interfaceC15879l;
        AbstractC12225l.crashlytics();
        if (this.f15600l != null) {
            if (this.f15604l && (defaultDisplay = getDefaultDisplay()) != null && (interfaceC15879l = this.f15609l) != null) {
                C8788l c8788l = this.f15605l;
                int iTapsense = interfaceC15879l.tapsense(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (c8788l.amazon) {
                    c8788l.yandex = iTapsense;
                    c8788l.loadAd = rotation;
                }
            }
            this.f15600l.billing();
        }
        C14212l c14212l = this.f15607l;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        c14212l.getClass();
        AbstractC12225l.crashlytics();
        synchronized (c14212l) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = c14212l.crashlytics) == null) {
                    c14212l.amazon = null;
                } else {
                    c14212l.amazon = c14212l.loadAd.crashlytics(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC2786l abstractC2786l = this.f15599l;
        if (abstractC2786l != null) {
            Matrix sensorToViewTransform = getSensorToViewTransform();
            AbstractC12225l.crashlytics();
            C2773l c2773l = abstractC2786l.billing;
            if (c2773l != null && c2773l.f6025l == 1) {
                if (sensorToViewTransform == null) {
                    c2773l.f6027l = null;
                } else {
                    c2773l.getClass();
                    c2773l.f6027l = new Matrix(sensorToViewTransform);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.f15596l, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f15610l);
        AbstractC12694l abstractC12694l = this.f15600l;
        if (abstractC12694l != null) {
            abstractC12694l.crashlytics();
        }
        yandex(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f15610l);
        AbstractC12694l abstractC12694l = this.f15600l;
        if (abstractC12694l != null) {
            abstractC12694l.amazon();
        }
        AbstractC2786l abstractC2786l = this.f15599l;
        if (abstractC2786l != null) {
            abstractC2786l.loadAd();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f15596l);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0158  */
    /* JADX WARN: Code duplicated, block: B:102:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x018f  */
    /* JADX WARN: Code duplicated, block: B:115:0x019b  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:132:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionIndex;
        int i;
        int i2;
        float x;
        float y;
        float f;
        float f2;
        int i3;
        float fAbs;
        float fAbs2;
        float f3;
        float fHypot;
        boolean z3;
        if (this.f15599l == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z4 = motionEvent.getPointerCount() == 1;
        boolean z5 = motionEvent.getAction() == 1;
        boolean z6 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z4 && z5 && z6) {
            this.f15606l = motionEvent;
            performClick();
            return true;
        }
        C11273l c11273l = this.f15602l;
        int i4 = c11273l.yandex;
        C6536l c6536l = c11273l.loadAd;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (c11273l.crashlytics) {
            c11273l.smaato.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z7 = (motionEvent.getButtonState() & 32) != 0;
        boolean z8 = c11273l.firebase == 2 && !z7;
        boolean z9 = actionMasked == 1 || actionMasked == 3 || z8;
        if (actionMasked == 0 || z9) {
            if (c11273l.mopub) {
                c11273l.yandex();
                c6536l.firebase(new C1895l());
                c11273l.mopub = false;
                c11273l.admob = 0.0f;
                c11273l.firebase = 0;
            } else if (c11273l.loadAd() && z9) {
                c11273l.mopub = false;
                c11273l.admob = 0.0f;
                c11273l.firebase = 0;
            }
            if (!z9) {
                if (!c11273l.mopub && c11273l.amazon && !c11273l.loadAd() && !z9 && z7) {
                    c11273l.subs = motionEvent.getX();
                    c11273l.isPro = motionEvent.getY();
                    c11273l.firebase = 2;
                    c11273l.admob = 0.0f;
                }
                if (actionMasked != 0 || actionMasked == 6 || actionMasked == 5 || z8) {
                    z = true;
                } else {
                    z = false;
                }
                if (actionMasked == 6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    actionIndex = motionEvent.getActionIndex();
                } else {
                    actionIndex = -1;
                }
                if (z2) {
                    i = pointerCount - 1;
                } else {
                    i = pointerCount;
                }
                if (c11273l.loadAd()) {
                    f2 = c11273l.subs;
                    f = c11273l.isPro;
                    if (motionEvent.getY() < f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c11273l.remoteconfig = z3;
                } else {
                    x = 0.0f;
                    y = 0.0f;
                    for (i2 = 0; i2 < pointerCount; i2++) {
                        if (actionIndex != i2) {
                            x = motionEvent.getX(i2) + x;
                            y = motionEvent.getY(i2) + y;
                        }
                    }
                    float f4 = i;
                    float f5 = x / f4;
                    f = y / f4;
                    f2 = f5;
                }
                fAbs = 0.0f;
                fAbs2 = 0.0f;
                for (i3 = 0; i3 < pointerCount; i3++) {
                    if (actionIndex != i3) {
                        fAbs = Math.abs(motionEvent.getX(i3) - f2) + fAbs;
                        fAbs2 = Math.abs(motionEvent.getY(i3) - f) + fAbs2;
                    }
                }
                float f6 = i;
                f3 = (fAbs / f6) * 2.0f;
                fHypot = 2.0f * (fAbs2 / f6);
                if (c11273l.loadAd()) {
                    fHypot = (float) Math.hypot(f3, fHypot);
                }
                boolean z10 = c11273l.mopub;
                AbstractC5573l.ads(f2);
                AbstractC5573l.ads(f);
                if (!c11273l.loadAd() && c11273l.mopub && (fHypot < 0 || z)) {
                    c11273l.yandex();
                    c6536l.firebase(new C1895l());
                    c11273l.mopub = false;
                    c11273l.admob = fHypot;
                }
                if (z) {
                    c11273l.purchase = fHypot;
                    c11273l.billing = fHypot;
                    c11273l.admob = fHypot;
                }
                int i5 = c11273l.loadAd() ? i4 : 0;
                if (!c11273l.mopub && fHypot >= i5 && (z10 || Math.abs(fHypot - c11273l.admob) > i4)) {
                    c11273l.purchase = fHypot;
                    c11273l.billing = fHypot;
                    c6536l.firebase(new C1895l());
                    c11273l.mopub = true;
                }
                if (actionMasked == 2) {
                    c11273l.purchase = fHypot;
                    if (c11273l.mopub) {
                        c6536l.firebase(new C10394l(c11273l.yandex()));
                    }
                    c11273l.billing = c11273l.purchase;
                }
            }
        } else {
            if (!c11273l.mopub) {
                c11273l.subs = motionEvent.getX();
                c11273l.isPro = motionEvent.getY();
                c11273l.firebase = 2;
                c11273l.admob = 0.0f;
            }
            if (actionMasked != 0) {
                z = true;
            } else {
                z = true;
            }
            if (actionMasked == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                actionIndex = motionEvent.getActionIndex();
            } else {
                actionIndex = -1;
            }
            if (z2) {
                i = pointerCount - 1;
            } else {
                i = pointerCount;
            }
            if (c11273l.loadAd()) {
                f2 = c11273l.subs;
                f = c11273l.isPro;
                if (motionEvent.getY() < f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c11273l.remoteconfig = z3;
            } else {
                x = 0.0f;
                y = 0.0f;
                while (i2 < pointerCount) {
                    if (actionIndex != i2) {
                        x = motionEvent.getX(i2) + x;
                        y = motionEvent.getY(i2) + y;
                    }
                }
                float f7 = i;
                float f8 = x / f7;
                f = y / f7;
                f2 = f8;
            }
            fAbs = 0.0f;
            fAbs2 = 0.0f;
            while (i3 < pointerCount) {
                if (actionIndex != i3) {
                    fAbs = Math.abs(motionEvent.getX(i3) - f2) + fAbs;
                    fAbs2 = Math.abs(motionEvent.getY(i3) - f) + fAbs2;
                }
            }
            float f9 = i;
            f3 = (fAbs / f9) * 2.0f;
            fHypot = 2.0f * (fAbs2 / f9);
            if (c11273l.loadAd()) {
                fHypot = (float) Math.hypot(f3, fHypot);
            }
            boolean z11 = c11273l.mopub;
            AbstractC5573l.ads(f2);
            AbstractC5573l.ads(f);
            if (!c11273l.loadAd()) {
                c11273l.yandex();
                c6536l.firebase(new C1895l());
                c11273l.mopub = false;
                c11273l.admob = fHypot;
            }
            if (z) {
                c11273l.purchase = fHypot;
                c11273l.billing = fHypot;
                c11273l.admob = fHypot;
            }
            if (c11273l.loadAd()) {
            }
            if (!c11273l.mopub) {
                c11273l.purchase = fHypot;
                c11273l.billing = fHypot;
                c6536l.firebase(new C1895l());
                c11273l.mopub = true;
            }
            if (actionMasked == 2) {
                c11273l.purchase = fHypot;
                if (c11273l.mopub) {
                    c6536l.firebase(new C10394l(c11273l.yandex()));
                }
                c11273l.billing = c11273l.purchase;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f15599l != null) {
            MotionEvent motionEvent = this.f15606l;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.f15606l;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            AbstractC2786l abstractC2786l = this.f15599l;
            C13716l c13716l = abstractC2786l.advert;
            long j = abstractC2786l.inmobi;
            if (!abstractC2786l.isPro()) {
                AbstractC5088l.tapsense("CameraController", "Use cases not attached to camera.");
            } else if (abstractC2786l.Signature) {
                PointF pointF = new PointF(x, y);
                float f = pointF.x;
                float f2 = pointF.y;
                C14212l c14212l = this.f15607l;
                C5071l c5071lYandex = c14212l.yandex(f, f2, 0.16666667f);
                C5071l c5071lYandex2 = c14212l.yandex(pointF.x, pointF.y, 0.25f);
                C0093l c0093l = new C0093l(c5071lYandex);
                c0093l.loadAd(c5071lYandex2, 2);
                if (j > 0) {
                    AbstractC5641l.loadAd(j >= 1, "autoCancelDuration must be at least 1");
                    c0093l.f1006l = j / 1000000;
                } else {
                    c0093l.f1006l = 0L;
                }
                C0093l c0093l2 = new C0093l(c0093l);
                AbstractC5088l.yandex("CameraController", "Tap to focus started: " + x + ", " + y);
                C8634l c8634l = abstractC2786l.license;
                if (c8634l != null) {
                    c8634l.close();
                }
                c13716l.isPro(new C17690l(1));
                C8634l c8634l2 = new C8634l(pointF, c13716l);
                abstractC2786l.license = c8634l2;
                ListenableFuture listenableFutureSubs = ((C14767l) abstractC2786l.remoteconfig.purchase()).crashlytics.subs(c0093l2);
                listenableFutureSubs.yandex(new RunnableC9929l(listenableFutureSubs, c8634l2, 0), AbstractC12272l.yandex());
                long j2 = j / 1000000;
                AbstractC5088l.yandex("CameraController", "Tap to focus auto cancel duration: " + j2 + " ms");
                if (j2 > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC16112l(12, c8634l2), j2);
                }
            } else {
                AbstractC5088l.yandex("CameraController", "Tap to focus disabled. ");
            }
        }
        this.f15606l = null;
        return super.performClick();
    }

    public void setController(AbstractC2786l abstractC2786l) {
        AbstractC12225l.crashlytics();
        AbstractC2786l abstractC2786l2 = this.f15599l;
        if (abstractC2786l2 != null && abstractC2786l2 != abstractC2786l) {
            abstractC2786l2.loadAd();
            setScreenFlashUiInfo(null);
        }
        this.f15599l = abstractC2786l;
        yandex(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(EnumC2529l enumC2529l) {
        AbstractC12225l.crashlytics();
        this.f15601l = enumC2529l;
    }

    public void setScaleType(EnumC7078l enumC7078l) {
        AbstractC12225l.crashlytics();
        this.f15605l.admob = enumC7078l;
        loadAd();
        yandex(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f15597l.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        AbstractC12225l.crashlytics();
        this.f15597l.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public final void yandex(boolean z) {
        AbstractC12225l.crashlytics();
        C14671l viewPort = getViewPort();
        if (this.f15599l == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.f15599l.yandex(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            AbstractC5088l.amazon("PreviewView", e.toString(), e);
        }
    }
}
