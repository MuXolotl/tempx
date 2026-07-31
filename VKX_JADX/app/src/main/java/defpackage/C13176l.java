package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.car.app.model.Alert;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: lؘْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13176l {
    public float amazon;
    public VelocityTracker crashlytics;
    public final InterfaceC11713l loadAd;
    public final Context yandex;
    public int purchase = -1;
    public int billing = -1;
    public int mopub = -1;
    public final int[] admob = {Alert.DURATION_SHOW_INDEFINITELY, 0};

    public C13176l(Context context, InterfaceC11713l interfaceC11713l) {
        this.yandex = context;
        this.loadAd = interfaceC11713l;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0168  */
    public final void yandex(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float f;
        float yVelocity;
        long j;
        int i4;
        float fSqrt;
        float f2;
        float[] fArr;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i5 = this.billing;
        int[] iArr = this.admob;
        if (i5 == source && this.mopub == deviceId && this.purchase == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.yandex;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i6 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i6 >= 34) {
                Method method = AbstractC12697l.yandex;
                scaledMinimumFlingVelocity = AbstractC5917l.ads(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = AbstractC12697l.yandex;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Alert.DURATION_SHOW_INDEFINITELY;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i6 >= 34) {
                scaledMaximumFlingVelocity = AbstractC5917l.adcel(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.billing = source;
            this.mopub = deviceId;
            this.purchase = i;
            z = true;
        }
        int i7 = iArr[i3];
        VelocityTracker velocityTracker = this.crashlytics;
        if (i7 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.crashlytics = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.crashlytics = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.crashlytics;
        Map map = AbstractC6029l.yandex;
        velocityTracker2.addMovement(motionEvent);
        float f3 = 0.0f;
        int i8 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC6029l.yandex;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C15771l());
            }
            C15771l c15771l = (C15771l) map2.get(velocityTracker2);
            long[] jArr = c15771l.loadAd;
            long eventTime = motionEvent.getEventTime();
            if (c15771l.amazon != 0 && eventTime - jArr[c15771l.purchase] > 40) {
                c15771l.amazon = i3;
                c15771l.crashlytics = 0.0f;
            }
            int i9 = (c15771l.purchase + 1) % 20;
            c15771l.purchase = i9;
            int i10 = c15771l.amazon;
            if (i10 != 20) {
                c15771l.amazon = i10 + 1;
            }
            c15771l.yandex[i9] = motionEvent.getAxisValue(26);
            jArr[c15771l.purchase] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C15771l c15771l2 = (C15771l) AbstractC6029l.yandex.get(velocityTracker2);
        if (c15771l2 != null) {
            float[] fArr2 = c15771l2.yandex;
            long[] jArr2 = c15771l2.loadAd;
            int i11 = c15771l2.amazon;
            if (i11 < 2) {
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i12 = c15771l2.purchase;
                int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                long j2 = jArr2[i12];
                while (true) {
                    j = jArr2[i13];
                    long j3 = j2 - j;
                    i4 = c15771l2.amazon;
                    if (j3 <= 100) {
                        break;
                    }
                    c15771l2.amazon = i4 - 1;
                    i13 = (i13 + 1) % 20;
                }
                if (i4 < 2) {
                    fSqrt = 0.0f;
                    f = 0.0f;
                } else if (i4 == 2) {
                    int i14 = (i13 + 1) % 20;
                    long j4 = jArr2[i14];
                    if (j == j4) {
                        fSqrt = 0.0f;
                        f = 0.0f;
                    } else {
                        fSqrt = fArr2[i14] / (j4 - j);
                        f = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (i15 >= c15771l2.amazon - 1) {
                            break;
                        }
                        int i17 = i15 + i13;
                        long j5 = jArr2[i17 % 20];
                        int i18 = (i17 + 1) % i8;
                        if (jArr2[i18] == j5) {
                            f2 = f3;
                            fArr = fArr2;
                        } else {
                            i16++;
                            f2 = f3;
                            fArr = fArr2;
                            float fSqrt2 = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i18] / (jArr2[i18] - j5);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i16 == i2) {
                                fAbs *= 0.5f;
                            }
                        }
                        i15++;
                        f3 = f2;
                        fArr2 = fArr;
                        i8 = 20;
                        i2 = 1;
                    }
                    f = f3;
                    fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000.0f;
            c15771l2.crashlytics = f5;
            if (f5 < (-Math.abs((float) r4))) {
                c15771l2.crashlytics = -Math.abs(Float.MAX_VALUE);
            } else if (c15771l2.crashlytics > Math.abs((float) r4)) {
                c15771l2.crashlytics = Math.abs((float) r4);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC5917l.admob(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            C15771l c15771l3 = (C15771l) AbstractC6029l.yandex.get(velocityTracker2);
            yVelocity = (c15771l3 == null || i != 26) ? f : c15771l3.crashlytics;
        }
        InterfaceC11713l interfaceC11713l = this.loadAd;
        float fAmazon = interfaceC11713l.amazon() * yVelocity;
        float fSignum = Math.signum(fAmazon);
        if (z || (fSignum != Math.signum(this.amazon) && fSignum != f)) {
            interfaceC11713l.purchase();
        }
        if (Math.abs(fAmazon) < iArr[0]) {
            return;
        }
        int i19 = iArr[1];
        float fMax = Math.max(-i19, Math.min(fAmazon, i19));
        this.amazon = interfaceC11713l.yandex(fMax) ? fMax : f;
    }
}
