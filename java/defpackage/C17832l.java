package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lَۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17832l extends AbstractC7469l implements InterfaceC6389l {
    public static final int[] applovin = {R.attr.state_pressed};
    public static final int[] appmetrica = new int[0];
    public final Drawable admob;
    public final Drawable amazon;
    public final int billing;
    public final StateListDrawable crashlytics;
    public int firebase;
    public final int isPro;
    public final ValueAnimator isVip;
    public final int loadAd;
    public int metrica;
    public final StateListDrawable mopub;
    public final RunnableC5360l premium;
    public final int purchase;
    public float remoteconfig;
    public int signatures;
    public int smaato;
    public float startapp;
    public final int subs;
    public final RecyclerView subscription;
    public int vip;
    public final int yandex;
    public int adcel = 0;
    public int ads = 0;
    public boolean tapsense = false;
    public boolean Signature = false;
    public int license = 0;
    public int pro = 0;
    public final int[] ad = new int[2];
    public final int[] advert = new int[2];

    public C17832l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.isVip = valueAnimatorOfFloat;
        this.signatures = 0;
        RunnableC5360l runnableC5360l = new RunnableC5360l(7, this);
        this.premium = runnableC5360l;
        C12520l c12520l = new C12520l(0, this);
        this.crashlytics = stateListDrawable;
        this.amazon = drawable;
        this.mopub = stateListDrawable2;
        this.admob = drawable2;
        this.purchase = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.billing = Math.max(i, drawable.getIntrinsicWidth());
        this.subs = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.isPro = Math.max(i, drawable2.getIntrinsicWidth());
        this.yandex = i2;
        this.loadAd = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C11752l(this));
        valueAnimatorOfFloat.addUpdateListener(new C5551l(2, this));
        RecyclerView recyclerView2 = this.subscription;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.subscription.removeOnItemTouchListener(this);
            this.subscription.removeOnScrollListener(c12520l);
            this.subscription.removeCallbacks(runnableC5360l);
        }
        this.subscription = recyclerView;
        recyclerView.addItemDecoration(this);
        this.subscription.addOnItemTouchListener(this);
        this.subscription.addOnScrollListener(c12520l);
    }

    public static int subs(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    public final boolean admob(float f, float f2) {
        int layoutDirection = this.subscription.getLayoutDirection();
        int i = this.purchase;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.adcel - i) {
            return false;
        }
        int i2 = this.smaato;
        int i3 = this.firebase / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    @Override // defpackage.AbstractC7469l
    public final void billing(Canvas canvas, RecyclerView recyclerView) {
        int i = this.adcel;
        RecyclerView recyclerView2 = this.subscription;
        if (i != recyclerView2.getWidth() || this.ads != recyclerView2.getHeight()) {
            this.adcel = recyclerView2.getWidth();
            this.ads = recyclerView2.getHeight();
            isPro(0);
            return;
        }
        if (this.signatures != 0) {
            if (this.tapsense) {
                int i2 = this.adcel;
                int i3 = this.purchase;
                int i4 = i2 - i3;
                int i5 = this.smaato;
                int i6 = this.firebase;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.crashlytics;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.billing;
                int i9 = this.ads;
                Drawable drawable = this.amazon;
                drawable.setBounds(0, 0, i8, i9);
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.Signature) {
                int i10 = this.ads;
                int i11 = this.subs;
                int i12 = i10 - i11;
                int i13 = this.metrica;
                int i14 = this.vip;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.mopub;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.adcel;
                int i17 = this.isPro;
                Drawable drawable2 = this.admob;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final void firebase() {
        int i = this.signatures;
        ValueAnimator valueAnimator = this.isVip;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.signatures = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    public final void isPro(int i) {
        RecyclerView recyclerView = this.subscription;
        RunnableC5360l runnableC5360l = this.premium;
        StateListDrawable stateListDrawable = this.crashlytics;
        if (i == 2 && this.license != 2) {
            stateListDrawable.setState(applovin);
            recyclerView.removeCallbacks(runnableC5360l);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            firebase();
        }
        if (this.license == 2 && i != 2) {
            stateListDrawable.setState(appmetrica);
            recyclerView.removeCallbacks(runnableC5360l);
            recyclerView.postDelayed(runnableC5360l, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(runnableC5360l);
            recyclerView.postDelayed(runnableC5360l, 1500L);
        }
        this.license = i;
    }

    @Override // defpackage.InterfaceC6389l
    public final boolean loadAd(MotionEvent motionEvent) {
        int i = this.license;
        if (i != 1) {
            return i == 2;
        }
        boolean zAdmob = admob(motionEvent.getX(), motionEvent.getY());
        boolean zMopub = mopub(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zAdmob && !zMopub) {
            return false;
        }
        if (zMopub) {
            this.pro = 1;
            this.startapp = (int) motionEvent.getX();
        } else if (zAdmob) {
            this.pro = 2;
            this.remoteconfig = (int) motionEvent.getY();
        }
        isPro(2);
        return true;
    }

    public final boolean mopub(float f, float f2) {
        if (f2 < this.ads - this.subs) {
            return false;
        }
        int i = this.metrica;
        int i2 = this.vip;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    @Override // defpackage.InterfaceC6389l
    public final void yandex(MotionEvent motionEvent) {
        if (this.license == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zAdmob = admob(motionEvent.getX(), motionEvent.getY());
            boolean zMopub = mopub(motionEvent.getX(), motionEvent.getY());
            if (zAdmob || zMopub) {
                if (zMopub) {
                    this.pro = 1;
                    this.startapp = (int) motionEvent.getX();
                } else if (zAdmob) {
                    this.pro = 2;
                    this.remoteconfig = (int) motionEvent.getY();
                }
                isPro(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.license == 2) {
            this.remoteconfig = 0.0f;
            this.startapp = 0.0f;
            isPro(1);
            this.pro = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.license == 2) {
            firebase();
            int i = this.pro;
            RecyclerView recyclerView = this.subscription;
            int i2 = this.loadAd;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.advert;
                iArr[0] = i2;
                int i3 = this.adcel - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.metrica - fMax) >= 2.0f) {
                    int iSubs = subs(this.startapp, fMax, iArr, recyclerView.computeHorizontalScrollRange(), recyclerView.computeHorizontalScrollOffset(), this.adcel);
                    if (iSubs != 0) {
                        recyclerView.scrollBy(iSubs, 0);
                    }
                    this.startapp = fMax;
                }
            }
            if (this.pro == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.ad;
                iArr2[0] = i2;
                int i4 = this.ads - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.smaato - fMax2) < 2.0f) {
                    return;
                }
                int iSubs2 = subs(this.remoteconfig, fMax2, iArr2, recyclerView.computeVerticalScrollRange(), recyclerView.computeVerticalScrollOffset(), this.ads);
                if (iSubs2 != 0) {
                    recyclerView.scrollBy(0, iSubs2);
                }
                this.remoteconfig = fMax2;
            }
        }
    }

    @Override // defpackage.InterfaceC6389l
    public final void crashlytics(boolean z) {
    }
}
