package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.isPro;
import androidx.recyclerview.widget.metrica;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؚٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16678l extends AbstractC7469l implements InterfaceC15471l {
    public ArrayList Signature;
    public GestureDetector ad;
    public int adcel;
    public float admob;
    public RecyclerView ads;
    public C17011l advert;
    public float amazon;
    public float billing;
    public float firebase;
    public float isPro;
    public ArrayList license;
    public int metrica;
    public float mopub;
    public long premium;
    public float purchase;
    public final C7221l remoteconfig;
    public Rect signatures;
    public float subs;
    public VelocityTracker tapsense;
    public final ArrayList yandex = new ArrayList();
    public final float[] loadAd = new float[2];
    public metrica crashlytics = null;
    public int smaato = -1;
    public int vip = 0;
    public final ArrayList startapp = new ArrayList();
    public final RunnableC5360l subscription = new RunnableC5360l(12, this);
    public View pro = null;
    public final C7666l isVip = new C7666l(this);

    public C16678l(C7221l c7221l) {
        this.remoteconfig = c7221l;
    }

    public static boolean remoteconfig(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void admob(int i, int i2, MotionEvent motionEvent) {
        View viewFirebase;
        if (this.crashlytics == null && i == 2 && this.vip != 2) {
            C7221l c7221l = this.remoteconfig;
            c7221l.getClass();
            if (this.ads.getScrollState() == 1) {
                return;
            }
            isPro layoutManager = this.ads.getLayoutManager();
            int i3 = this.smaato;
            metrica childViewHolder = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.amazon;
                float y = motionEvent.getY(iFindPointerIndex) - this.purchase;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.adcel;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.amazon()) && ((fAbs2 <= fAbs || !layoutManager.purchase()) && (viewFirebase = firebase(motionEvent)) != null))) {
                    childViewHolder = this.ads.getChildViewHolder(viewFirebase);
                }
            }
            if (childViewHolder == null) {
                return;
            }
            int iPurchase = (C7221l.purchase(c7221l.isPro(childViewHolder), this.ads.getLayoutDirection()) & 65280) >> 8;
            if (iPurchase == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.amazon;
            float f3 = y2 - this.purchase;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.adcel;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iPurchase & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iPurchase & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iPurchase & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iPurchase & 2) == 0) {
                        return;
                    }
                }
                this.subs = 0.0f;
                this.admob = 0.0f;
                this.smaato = motionEvent.getPointerId(0);
                metrica(childViewHolder, 1);
            }
        }
    }

    @Override // defpackage.AbstractC7469l
    public final void amazon(Rect rect, View view, RecyclerView recyclerView) {
        rect.setEmpty();
    }

    @Override // defpackage.AbstractC7469l
    public final void billing(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.crashlytics != null) {
            float[] fArr = this.loadAd;
            smaato(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        metrica metricaVar = this.crashlytics;
        this.remoteconfig.getClass();
        ArrayList arrayList = this.startapp;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C9603l c9603l = (C9603l) arrayList.get(i);
            int iSave = canvas.save();
            View view = c9603l.purchase.yandex;
            canvas.restoreToCount(iSave);
        }
        if (metricaVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C9603l c9603l2 = (C9603l) arrayList.get(i2);
            boolean z2 = c9603l2.smaato;
            if (z2 && !c9603l2.admob) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final View firebase(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        metrica metricaVar = this.crashlytics;
        if (metricaVar != null) {
            View view = metricaVar.yandex;
            if (remoteconfig(view, x, y, this.isPro + this.admob, this.firebase + this.subs)) {
                return view;
            }
        }
        ArrayList arrayList = this.startapp;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C9603l c9603l = (C9603l) arrayList.get(size);
            View view2 = c9603l.purchase.yandex;
            if (remoteconfig(view2, x, y, c9603l.subs, c9603l.isPro)) {
                return view2;
            }
        }
        return this.ads.findChildViewUnder(x, y);
    }

    public final void isPro(metrica metricaVar, boolean z) {
        ArrayList arrayList = this.startapp;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C9603l c9603l = (C9603l) arrayList.get(size);
            if (c9603l.purchase == metricaVar) {
                c9603l.firebase |= z;
                if (!c9603l.smaato) {
                    c9603l.mopub.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void metrica(metrica metricaVar, int i) {
        C7221l c7221l;
        int i2;
        boolean z;
        metrica metricaVar2;
        metrica metricaVar3;
        int iSubs;
        float fSignum;
        long j;
        if (metricaVar == this.crashlytics && i == this.vip) {
            return;
        }
        this.premium = Long.MIN_VALUE;
        int i3 = this.vip;
        isPro(metricaVar, true);
        this.vip = i;
        if (i == 2) {
            if (metricaVar == null) {
                C8339l.metrica("Must pass a ViewHolder when dragging");
                return;
            }
            this.pro = metricaVar.yandex;
        }
        int i4 = (1 << ((i * 8) + 8)) - 1;
        metrica metricaVar4 = this.crashlytics;
        metrica metricaVar5 = null;
        C7221l c7221l2 = this.remoteconfig;
        boolean z2 = false;
        if (metricaVar4 != null) {
            View view = metricaVar4.yandex;
            if (view.getParent() != null) {
                if (i3 == 2 || this.vip == 2) {
                    iSubs = 0;
                } else {
                    int iIsPro = c7221l2.isPro(metricaVar4);
                    int iPurchase = (C7221l.purchase(iIsPro, this.ads.getLayoutDirection()) & 65280) >> 8;
                    if (iPurchase == 0) {
                        iSubs = 0;
                    } else {
                        int i5 = (iIsPro & 65280) >> 8;
                        if (Math.abs(this.admob) > Math.abs(this.subs)) {
                            iSubs = mopub(iPurchase);
                            if (iSubs <= 0) {
                                iSubs = subs(iPurchase);
                                if (iSubs <= 0) {
                                    iSubs = 0;
                                }
                            } else if ((i5 & iSubs) == 0) {
                                iSubs = C7221l.billing(iSubs, this.ads.getLayoutDirection());
                            }
                        } else {
                            iSubs = subs(iPurchase);
                            if (iSubs <= 0) {
                                iSubs = mopub(iPurchase);
                                if (iSubs <= 0) {
                                    iSubs = 0;
                                } else if ((i5 & iSubs) == 0) {
                                    iSubs = C7221l.billing(iSubs, this.ads.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.tapsense;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.tapsense = null;
                }
                char c = 4;
                float fSignum2 = 0.0f;
                if (iSubs == 1 || iSubs == 2) {
                    fSignum = Math.signum(this.subs) * this.ads.getHeight();
                } else if (iSubs == 4 || iSubs == 8 || iSubs == 16 || iSubs == 32) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.admob) * this.ads.getWidth();
                } else {
                    fSignum = 0.0f;
                }
                if (i3 == 2) {
                    c = '\b';
                } else if (iSubs > 0) {
                    c = 2;
                }
                float[] fArr = this.loadAd;
                smaato(fArr);
                char c2 = c;
                i2 = 0;
                C9603l c9603l = new C9603l(this, metricaVar4, i3, fArr[0], fArr[1], fSignum2, fSignum, iSubs, metricaVar4);
                RecyclerView recyclerView = this.ads;
                c7221l2.getClass();
                AbstractC13735l itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c2 == '\b' ? 200L : 250L;
                } else {
                    j = c2 == '\b' ? itemAnimator.purchase : itemAnimator.amazon;
                }
                ValueAnimator valueAnimator = c9603l.mopub;
                valueAnimator.setDuration(j);
                this.startapp.add(c9603l);
                metricaVar4.startapp(false);
                valueAnimator.start();
                c7221l = c7221l2;
                metricaVar3 = null;
                z2 = true;
            } else {
                i2 = 0;
                if (view == this.pro) {
                    metricaVar2 = null;
                    this.pro = null;
                } else {
                    metricaVar2 = null;
                }
                c7221l = c7221l2;
                c7221l.yandex(metricaVar4);
                z2 = false;
                metricaVar3 = metricaVar2;
            }
            this.crashlytics = metricaVar3;
            metricaVar5 = metricaVar3;
        } else {
            c7221l = c7221l2;
            i2 = 0;
        }
        if (metricaVar != null) {
            View view2 = metricaVar.yandex;
            this.metrica = (C7221l.purchase(c7221l.isPro(metricaVar), this.ads.getLayoutDirection()) & i4) >> (this.vip * 8);
            this.isPro = view2.getLeft();
            this.firebase = view2.getTop();
            this.crashlytics = metricaVar;
            if (i == 2) {
                view2.performHapticFeedback(i2);
            }
        }
        ?? parent = this.ads.getParent();
        if (parent != 0) {
            parent.requestDisallowInterceptTouchEvent(this.crashlytics != null ? 1 : i2);
        }
        if (z2) {
            z = true;
        } else {
            z = true;
            this.ads.getLayoutManager().billing = true;
        }
        int i6 = this.vip;
        C1770l c1770l = (C1770l) c7221l.f15053l;
        ?? r12 = i6 != 2 ? z : i2;
        View view3 = ((AbstractC9694l) c1770l.f4179l).f5280l;
        ?? r0 = metricaVar5;
        if (view3 != null) {
            r0 = view3;
        }
        r0.setEnabled(r12);
        this.ads.invalidate();
    }

    public final int mopub(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.admob > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.tapsense;
        C7221l c7221l = this.remoteconfig;
        if (velocityTracker != null && this.smaato > -1) {
            float f = this.mopub;
            c7221l.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.tapsense.getXVelocity(this.smaato);
            float yVelocity = this.tapsense.getYVelocity(this.smaato);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.billing && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.ads.getWidth();
        c7221l.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.admob) <= f2) {
            return 0;
        }
        return i2;
    }

    @Override // defpackage.AbstractC7469l
    public final void purchase(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.crashlytics != null) {
            float[] fArr = this.loadAd;
            smaato(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        metrica metricaVar = this.crashlytics;
        this.remoteconfig.getClass();
        ArrayList arrayList = this.startapp;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C9603l c9603l = (C9603l) arrayList.get(i);
            metrica metricaVar2 = c9603l.purchase;
            float f3 = c9603l.yandex;
            float f4 = c9603l.crashlytics;
            if (f3 == f4) {
                c9603l.subs = metricaVar2.yandex.getTranslationX();
            } else {
                c9603l.subs = AbstractC4338l.Signature(f4, f3, c9603l.remoteconfig, f3);
            }
            float f5 = c9603l.loadAd;
            float f6 = c9603l.amazon;
            if (f5 == f6) {
                c9603l.isPro = metricaVar2.yandex.getTranslationY();
            } else {
                c9603l.isPro = AbstractC4338l.Signature(f6, f5, c9603l.remoteconfig, f5);
            }
            int iSave = canvas.save();
            C7221l.smaato(recyclerView, c9603l.purchase, c9603l.subs, c9603l.isPro, false);
            canvas.restoreToCount(iSave);
        }
        if (metricaVar != null) {
            int iSave2 = canvas.save();
            C7221l.smaato(recyclerView, metricaVar, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public final void smaato(float[] fArr) {
        if ((this.metrica & 12) != 0) {
            fArr[0] = (this.isPro + this.admob) - this.crashlytics.yandex.getLeft();
        } else {
            fArr[0] = this.crashlytics.yandex.getTranslationX();
        }
        if ((this.metrica & 3) != 0) {
            fArr[1] = (this.firebase + this.subs) - this.crashlytics.yandex.getTop();
        } else {
            fArr[1] = this.crashlytics.yandex.getTranslationY();
        }
    }

    public final void startapp(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.amazon;
        this.admob = f;
        this.subs = y - this.purchase;
        if ((i & 4) == 0) {
            this.admob = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.admob = Math.min(0.0f, this.admob);
        }
        if ((i & 1) == 0) {
            this.subs = Math.max(0.0f, this.subs);
        }
        if ((i & 2) == 0) {
            this.subs = Math.min(0.0f, this.subs);
        }
    }

    public final int subs(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.subs > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.tapsense;
        C7221l c7221l = this.remoteconfig;
        if (velocityTracker != null && this.smaato > -1) {
            float f = this.mopub;
            c7221l.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.tapsense.getXVelocity(this.smaato);
            float yVelocity = this.tapsense.getYVelocity(this.smaato);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.billing && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.ads.getHeight();
        c7221l.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.subs) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void vip(metrica metricaVar) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        int i2;
        int i3;
        if (!this.ads.isLayoutRequested() && this.vip == 2) {
            C7221l c7221l = this.remoteconfig;
            c7221l.getClass();
            int i4 = (int) (this.isPro + this.admob);
            int i5 = (int) (this.firebase + this.subs);
            View view = metricaVar.yandex;
            if (Math.abs(i5 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i4 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.Signature;
                if (arrayList2 == null) {
                    this.Signature = new ArrayList();
                    this.license = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.license.clear();
                }
                int iRound = Math.round(this.isPro + this.admob);
                int iRound2 = Math.round(this.firebase + this.subs);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i6 = (iRound + width) / 2;
                int i7 = (iRound2 + height) / 2;
                isPro layoutManager = this.ads.getLayoutManager();
                int iLicense = layoutManager.license();
                int i8 = 0;
                while (i8 < iLicense) {
                    View viewSignature = layoutManager.Signature(i8);
                    if (viewSignature == view) {
                        i = i8;
                    } else {
                        i = i8;
                        if (viewSignature.getBottom() >= iRound2 && viewSignature.getTop() <= height && viewSignature.getRight() >= iRound && viewSignature.getLeft() <= width) {
                            metrica childViewHolder = this.ads.getChildViewHolder(viewSignature);
                            i2 = i4;
                            Object obj = this.crashlytics.subscription;
                            i3 = i5;
                            if ((obj instanceof InterfaceC4364l) && (childViewHolder.subscription instanceof InterfaceC4364l) && ((InterfaceC4364l) obj).crashlytics() && ((InterfaceC4364l) childViewHolder.subscription).crashlytics()) {
                                int iAbs5 = Math.abs(i6 - ((viewSignature.getRight() + viewSignature.getLeft()) / 2));
                                int iAbs6 = Math.abs(i7 - ((viewSignature.getBottom() + viewSignature.getTop()) / 2));
                                int i9 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                                int size = this.Signature.size();
                                int i10 = 0;
                                int i11 = 0;
                                while (i11 < size) {
                                    int i12 = size;
                                    if (i9 <= ((Integer) this.license.get(i11)).intValue()) {
                                        break;
                                    }
                                    i10++;
                                    i11++;
                                    size = i12;
                                }
                                this.Signature.add(i10, childViewHolder);
                                this.license.add(i10, Integer.valueOf(i9));
                            }
                            i8 = i + 1;
                            i4 = i2;
                            i5 = i3;
                            iRound = iRound;
                        }
                        i8 = i + 1;
                        i4 = i2;
                        i5 = i3;
                        iRound = iRound;
                    }
                    i2 = i4;
                    i3 = i5;
                    i8 = i + 1;
                    i4 = i2;
                    i5 = i3;
                    iRound = iRound;
                }
                int i13 = i4;
                int i14 = i5;
                ArrayList arrayList3 = this.Signature;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i13;
                int height2 = view.getHeight() + i14;
                int left2 = i13 - view.getLeft();
                int top2 = i14 - view.getTop();
                int size2 = arrayList3.size();
                metrica metricaVar2 = null;
                int i15 = -1;
                int i16 = 0;
                while (i16 < size2) {
                    metrica metricaVar3 = (metrica) arrayList3.get(i16);
                    if (left2 <= 0 || (right = metricaVar3.yandex.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (metricaVar3.yandex.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i15) {
                            i15 = iAbs4;
                            metricaVar2 = metricaVar3;
                        }
                    }
                    if (left2 < 0 && (left = metricaVar3.yandex.getLeft() - i13) > 0 && metricaVar3.yandex.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i15) {
                        i15 = iAbs3;
                        metricaVar2 = metricaVar3;
                    }
                    if (top2 < 0 && (top = metricaVar3.yandex.getTop() - i14) > 0 && metricaVar3.yandex.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i15) {
                        i15 = iAbs2;
                        metricaVar2 = metricaVar3;
                    }
                    if (top2 > 0 && (bottom = metricaVar3.yandex.getBottom() - height2) < 0 && metricaVar3.yandex.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i15) {
                        i15 = iAbs;
                        metricaVar2 = metricaVar3;
                    }
                    i16++;
                    arrayList3 = arrayList;
                }
                if (metricaVar2 == null) {
                    this.Signature.clear();
                    this.license.clear();
                    return;
                }
                View view2 = metricaVar2.yandex;
                int iLoadAd = metricaVar2.loadAd();
                metricaVar.loadAd();
                if (metricaVar.billing != metricaVar2.billing) {
                    return;
                }
                c7221l.f15052l = metricaVar.crashlytics();
                int iCrashlytics = metricaVar2.crashlytics();
                c7221l.f15051l = iCrashlytics;
                if (c7221l.f15048l == -1) {
                    c7221l.f15048l = c7221l.f15052l;
                }
                ((InterfaceC4364l) metricaVar.subscription).loadAd(c7221l.f15052l, iCrashlytics);
                RecyclerView recyclerView = this.ads;
                isPro layoutManager2 = recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    if (layoutManager2.amazon()) {
                        if (isPro.signatures(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.scrollToPosition(iLoadAd);
                        }
                        if (isPro.appmetrica(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.scrollToPosition(iLoadAd);
                        }
                    }
                    if (layoutManager2.purchase()) {
                        if (isPro.inmobi(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.scrollToPosition(iLoadAd);
                        }
                        if (isPro.advert(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.scrollToPosition(iLoadAd);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                linearLayoutManager.crashlytics("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.m68l();
                linearLayoutManager.m85l();
                int iM126native = isPro.m126native(view);
                int iM126native2 = isPro.m126native(view2);
                byte b = iM126native < iM126native2 ? (byte) 1 : (byte) -1;
                boolean z = linearLayoutManager.Signature;
                AbstractC0962l abstractC0962l = linearLayoutManager.ads;
                if (z) {
                    if (b == 1) {
                        linearLayoutManager.m80l(iM126native2, abstractC0962l.mopub() - (linearLayoutManager.ads.crashlytics(view) + linearLayoutManager.ads.purchase(view2)));
                        return;
                    } else {
                        linearLayoutManager.m80l(iM126native2, abstractC0962l.mopub() - linearLayoutManager.ads.loadAd(view2));
                        return;
                    }
                }
                if (b == -1) {
                    linearLayoutManager.m80l(iM126native2, abstractC0962l.purchase(view2));
                } else {
                    linearLayoutManager.m80l(iM126native2, abstractC0962l.loadAd(view2) - linearLayoutManager.ads.crashlytics(view));
                }
            }
        }
    }
}
