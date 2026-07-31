package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: lِؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11629l extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11629l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.yandex) {
            case 2:
                C11273l c11273l = (C11273l) this.loadAd;
                c11273l.subs = motionEvent.getX();
                c11273l.isPro = motionEvent.getY();
                c11273l.firebase = 1;
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.yandex) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C14972l c14972l = (C14972l) obj;
                if (c14972l.f29464l || c14972l.f29468l || !c14972l.f29467l || f2 < 1200.0f) {
                    return false;
                }
                c14972l.f29468l = false;
                c14972l.getChildAt(1).dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                c14972l.f29464l = false;
                c14972l.f29467l = false;
                c14972l.f29468l = true;
                c14972l.f29470l.purchase();
                return true;
            case 1:
                C9967l c9967l = (C9967l) obj;
                if (c9967l.f20338l || c9967l.f20353l || !c9967l.f20339l || c9967l.f20342l == null || f < 600.0f) {
                    return false;
                }
                c9967l.f20353l = false;
                c9967l.f20348l = null;
                c9967l.loadAd();
                c9967l.billing(true, false);
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        boolean z;
        EnumC14806l enumC14806l;
        EnumC14806l enumC14806l2;
        EnumC14806l enumC14806l3;
        C9967l c9967l;
        float f4 = f2;
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C14972l c14972l = (C14972l) obj;
                int i2 = c14972l.f29465l;
                if (!c14972l.f29471l && !c14972l.f29464l && !c14972l.f29468l) {
                    if (!c14972l.f29467l) {
                        if (f2 > (-i2) || Math.abs(f2) * 0.5f <= Math.abs(f)) {
                            c14972l.f29464l = true;
                        } else if (f2 > (-i2) || Math.abs(f2) * 0.5f <= Math.abs(f)) {
                            c14972l.f29464l = true;
                        } else {
                            View childAt = c14972l.getChildAt(1);
                            if (C14972l.crashlytics((ViewGroup) childAt, motionEvent2, c14972l.f29466l)) {
                                c14972l.f29464l = true;
                            } else {
                                int measuredHeight = childAt.getMeasuredHeight();
                                if (measuredHeight <= 0) {
                                    Point point = new Point();
                                    ((WindowManager) childAt.getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(point.x, RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(point.y, RecyclerView.UNDEFINED_DURATION));
                                    measuredHeight = childAt.getMeasuredHeight();
                                }
                                c14972l.f29472l = measuredHeight;
                                c14972l.f29467l = true;
                                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, motionEvent2.getX(), motionEvent2.getY(), 0);
                                for (int i3 = 0; i3 < c14972l.getChildCount(); i3++) {
                                    c14972l.getChildAt(i3).dispatchTouchEvent(motionEventObtain);
                                }
                                motionEventObtain.recycle();
                                c14972l.requestLayout();
                            }
                        }
                    }
                    c14972l.f29473l = Math.min(c14972l.f29472l, Math.max(0.0f, motionEvent2.getY() - motionEvent.getY())) / c14972l.f29472l;
                    c14972l.loadAd();
                    return true;
                }
                return false;
            case 1:
                C9967l c9967l2 = (C9967l) obj;
                Rect rect = c9967l2.f20351l;
                int i4 = c9967l2.f20331l;
                int size = c9967l2.f20330l.size();
                EnumC14806l enumC14806l4 = EnumC14806l.f28956l;
                EnumC14806l enumC14806l5 = EnumC14806l.f28952l;
                if (size <= 1) {
                    if (!c9967l2.f20338l && !c9967l2.f20353l) {
                        double dAsin = (Math.asin(((double) f4) / Math.sqrt((f4 * f4) + (f * f))) / 1.5707963267948966d) * 100.0d;
                        EnumC14806l[] enumC14806lArrValues = EnumC14806l.values();
                        int length = enumC14806lArrValues.length;
                        int i5 = 0;
                        while (i5 < length) {
                            EnumC14806l enumC14806l6 = enumC14806lArrValues[i5];
                            if ((!enumC14806l6.loadAd(c9967l2.f20343l) || f > i4) && ((!enumC14806l6.crashlytics(c9967l2.f20343l) || f < (-i4)) && ((enumC14806l6 != enumC14806l5 || f4 > i4) && (enumC14806l6 != enumC14806l4 || f4 < (-i4))))) {
                                enumC14806l3 = enumC14806l4;
                            } else if (enumC14806l6.yandex()) {
                                enumC14806l3 = enumC14806l4;
                                if (Math.abs(dAsin) <= C9967l.f20322l) {
                                    c9967l = c9967l2;
                                    if (c9967l.getCurrentFragment().signatures()) {
                                        c9967l.loadAd();
                                        c9967l.f20338l = true;
                                    } else {
                                        c9967l2 = c9967l;
                                        if (c9967l2.subs((ViewGroup) c9967l2.getFrontView(), motionEvent2, enumC14806l6, rect)) {
                                            c9967l2.f20338l = true;
                                        } else {
                                            c9967l2.f20338l = true;
                                        }
                                    }
                                    return false;
                                }
                                continue;
                            } else {
                                enumC14806l3 = enumC14806l4;
                                c9967l = c9967l2;
                                if (Math.abs(dAsin) >= 90.0f - C9967l.f20322l) {
                                    if (c9967l.getCurrentFragment().signatures()) {
                                        c9967l.loadAd();
                                        c9967l.f20338l = true;
                                    } else {
                                        c9967l2 = c9967l;
                                        if (c9967l2.subs((ViewGroup) c9967l2.getFrontView(), motionEvent2, enumC14806l6, rect)) {
                                            c9967l2.f20338l = true;
                                        } else {
                                            c9967l2.f20338l = true;
                                        }
                                    }
                                    return false;
                                }
                                c9967l2 = c9967l;
                            }
                            i5++;
                            enumC14806l4 = enumC14806l3;
                        }
                    }
                    z = false;
                } else {
                    EnumC14806l enumC14806l7 = enumC14806l4;
                    if (c9967l2.f20342l == null) {
                        return c9967l2.f20339l;
                    }
                    if (!c9967l2.f20338l && !c9967l2.f20353l) {
                        if (((AbstractC17777l) c9967l2.f20330l.peek()).signatures()) {
                            c9967l2.f20338l = true;
                        } else {
                            if (c9967l2.f20338l || c9967l2.f20339l) {
                                f3 = 1.0f;
                            } else {
                                double dAsin2 = (Math.asin(((double) f4) / Math.sqrt((f4 * f4) + (f * f))) / 1.5707963267948966d) * 100.0d;
                                EnumC14806l[] enumC14806lArr = c9967l2.f20332l;
                                int length2 = enumC14806lArr.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length2) {
                                        enumC14806l = enumC14806lArr[i6];
                                        if ((!enumC14806l.loadAd(c9967l2.f20343l) || f > i4) && ((!enumC14806l.crashlytics(c9967l2.f20343l) || f < (-i4)) && (enumC14806l != enumC14806l5 || f4 > (-i4)))) {
                                            enumC14806l2 = enumC14806l7;
                                            if (enumC14806l != enumC14806l2 || f4 < i4) {
                                                i4 = i4;
                                                length2 = length2;
                                            }
                                            i6++;
                                            f4 = f2;
                                            i4 = i4;
                                            length2 = length2;
                                            enumC14806l7 = enumC14806l2;
                                        } else {
                                            enumC14806l2 = enumC14806l7;
                                        }
                                        if (enumC14806l.yandex()) {
                                            f3 = 1.0f;
                                            if (Math.abs(dAsin2) > C9967l.f20322l) {
                                                i6++;
                                                f4 = f2;
                                                i4 = i4;
                                                length2 = length2;
                                                enumC14806l7 = enumC14806l2;
                                            }
                                        } else {
                                            f3 = 1.0f;
                                            if (Math.abs(dAsin2) >= 90.0f - C9967l.f20322l) {
                                            }
                                            i6++;
                                            f4 = f2;
                                            i4 = i4;
                                            length2 = length2;
                                            enumC14806l7 = enumC14806l2;
                                        }
                                    } else {
                                        z = false;
                                        c9967l2.f20338l = true;
                                    }
                                }
                                if (c9967l2.subs((ViewGroup) c9967l2.getFrontView(), motionEvent2, enumC14806l, rect)) {
                                    c9967l2.f20338l = true;
                                    return false;
                                }
                                c9967l2.f20327l = enumC14806l;
                                c9967l2.f20352l = f3 - ((C4269l) c9967l2.f20342l).vip(c9967l2, motionEvent, motionEvent2);
                                c9967l2.f20339l = true;
                                Stack stack = c9967l2.f20330l;
                                AbstractC17777l abstractC17777l = (AbstractC17777l) stack.get(stack.size() - 2);
                                AbstractC17777l abstractC17777l2 = (AbstractC17777l) c9967l2.f20330l.peek();
                                c9967l2.f20348l = new C4816l(abstractC17777l, abstractC17777l2, abstractC17777l.advert(), 8);
                                Iterator it = c9967l2.f20328l.iterator();
                                while (it.hasNext()) {
                                    ((C0380l) it.next()).loadAd(abstractC17777l, abstractC17777l2);
                                }
                                c9967l2.getFrontView();
                                c9967l2.getBackView();
                                ((InterfaceC9215l) c9967l2.f20348l.f9862l).getClass();
                                MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 3, motionEvent2.getX(), motionEvent2.getY(), 0);
                                if (c9967l2.getFrontView() != null) {
                                    c9967l2.getFrontView().dispatchTouchEvent(motionEventObtain2);
                                }
                                if (c9967l2.getBackView() != null) {
                                    c9967l2.getBackView().dispatchTouchEvent(motionEventObtain2);
                                }
                                motionEventObtain2.recycle();
                                if (c9967l2.getBackView() != null) {
                                    c9967l2.getBackView().setVisibility(0);
                                }
                                c9967l2.admob();
                            }
                            c9967l2.f20350l = Math.max(0.0f, Math.min(f3, ((C4269l) c9967l2.f20342l).vip(c9967l2, motionEvent, motionEvent2) + c9967l2.f20352l));
                            c9967l2.admob();
                        }
                        return true;
                    }
                    z = false;
                }
                return z;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }
}
