package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَؙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10613l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21533l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21534l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21535l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f21536l;

    public /* synthetic */ RunnableC10613l(C8857l c8857l, C15421l c15421l, C5807l c5807l) {
        this.f21535l = 10;
        Map map = Collections.EMPTY_MAP;
        this.f21534l = c8857l;
        this.f21533l = c15421l;
        this.f21536l = c5807l;
    }

    private final void yandex() {
        C3585l c3585l = (C3585l) this.f21534l;
        AbstractC15422l abstractC15422l = (AbstractC15422l) this.f21533l;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f21536l;
        try {
            C9412l c9412lLoadAd = AbstractC17716l.loadAd((Context) c3585l.f7511l);
            if (c9412lLoadAd == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            C10535l c10535l = (C10535l) ((InterfaceC17172l) c9412lLoadAd.loadAd);
            synchronized (c10535l.f21439l) {
                c10535l.f21440l = threadPoolExecutor;
            }
            ((InterfaceC17172l) c9412lLoadAd.loadAd).amazon(new C5286l(abstractC15422l, threadPoolExecutor));
        } catch (Throwable th) {
            abstractC15422l.purchase(th);
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0455  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    @Override // java.lang.Runnable
    public final void run() {
        int iMakeMeasureSpec;
        C8195l c8195l;
        C8195l c8195l2;
        int i;
        InterfaceC15879l interfaceC15879l;
        AbstractC8769l abstractC8769lYandex;
        C16749l c16749l;
        C12417l c12417l;
        ListenableFuture listenableFuturePurchase;
        int i2 = 9;
        int i3 = 3;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        Object obj = null;
        C12417l c12417l2 = null;
        Bitmap bitmap = null;
        switch (this.f21535l) {
            case 0:
                Throwable th = (Throwable) this.f21534l;
                C4200l c4200l = (C4200l) this.f21533l;
                List list = (List) this.f21536l;
                if (th != null) {
                    c4200l.loadAd.onError(th);
                    return;
                } else {
                    c4200l.loadAd.yandex(list);
                    return;
                }
            case 1:
                C18439l c18439l = (C18439l) this.f21534l;
                C4496l c4496l = (C4496l) this.f21533l;
                C17644l c17644l = (C17644l) this.f21536l;
                ActionMode actionModeStartActionMode = c18439l.yandex.startActionMode(new ActionModeCallbackC13058l(c4496l), 1);
                AbstractC8576l.yandex(c18439l.admob, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    c17644l.close();
                    return;
                }
                return;
            case 2:
                C18595l c18595l = (C18595l) this.f21534l;
                C5978l c5978l = (C5978l) this.f21533l;
                C7977l c7977l = (C7977l) this.f21536l;
                SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l = (SurfaceHolderCallbackC18330l) c18595l.f36316l;
                String str = AbstractC15323l.yandex;
                C17505l c17505l = surfaceHolderCallbackC18330l.yandex.f34701l;
                C5597l c5597lM4397goto = c17505l.m4397goto();
                c17505l.m4401super(c5597lM4397goto, 1009, new C0890l(c5597lM4397goto, c5978l, c7977l, 1));
                return;
            case 3:
                AudioTrack audioTrack = (AudioTrack) this.f21534l;
                Handler handler = (Handler) this.f21533l;
                C8961l c8961l = (C8961l) this.f21536l;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC16112l(i2, c8961l));
                    }
                    synchronized (C4636l.tapsense) {
                        try {
                            int i7 = C4636l.license - 1;
                            C4636l.license = i7;
                            if (i7 == 0) {
                                ScheduledExecutorService scheduledExecutorService = C4636l.Signature;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                C4636l.Signature = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new RunnableC16112l(i2, c8961l));
                    }
                    synchronized (C4636l.tapsense) {
                        try {
                            int i8 = C4636l.license - 1;
                            C4636l.license = i8;
                            if (i8 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = C4636l.Signature;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                C4636l.Signature = null;
                            }
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 4:
                C14262l c14262l = (C14262l) this.f21534l;
                View view = (View) this.f21533l;
                C16052l c16052l = (C16052l) this.f21536l;
                boolean zLoadAd = c14262l.loadAd(view);
                PopupWindow popupWindow = c14262l.f27869l;
                PopupWindow popupWindow2 = c14262l.f27866l;
                C15615l c15615l = c14262l.f27860l;
                C10024l c10024l = c14262l.f27863l;
                if ((zLoadAd ? Boolean.valueOf(zLoadAd) : null) != null) {
                    int i9 = c10024l.f20430native;
                    int i10 = c10024l.f20421catch;
                    c14262l.f27861l = true;
                    long j = c10024l.f20434strictfp;
                    if (j != -1) {
                        ((Handler) c14262l.f27868l.getValue()).postDelayed((RunnableC6970l) c14262l.f27865l.getValue(), j);
                    }
                    VectorTextView vectorTextView = (VectorTextView) c15615l.f30481l;
                    RadiusLayout radiusLayout = (RadiusLayout) c15615l.f30485l;
                    c14262l.isPro(vectorTextView, radiusLayout);
                    int i11 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
                    float f = c10024l.crashlytics;
                    if (f == 0.0f) {
                        int i12 = c10024l.yandex;
                        if (i12 != Integer.MIN_VALUE) {
                            if (i12 <= i11) {
                                i11 = i12;
                            }
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                        } else {
                            int i13 = c10024l.loadAd;
                            if (i13 <= i11) {
                                i11 = i13;
                            }
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, RecyclerView.UNDEFINED_DURATION);
                        }
                    } else {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (i11 * f), 1073741824);
                    }
                    int i14 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).y;
                    int i15 = c10024l.amazon;
                    ((FrameLayout) c15615l.f30483l).measure(iMakeMeasureSpec, i15 != Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(i14, RecyclerView.UNDEFINED_DURATION));
                    popupWindow2.setWidth(c14262l.admob());
                    popupWindow2.setHeight(c14262l.billing());
                    ((VectorTextView) c15615l.f30481l).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    ImageView imageView = (ImageView) c15615l.f30486l;
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(c10024l.loadAd(), c10024l.yandex()));
                    imageView.setAlpha(c10024l.pro);
                    imageView.setPadding(0, 0, 0, 0);
                    int i16 = c10024l.isPro;
                    if (i16 != Integer.MIN_VALUE) {
                        imageView.setImageTintList(ColorStateList.valueOf(i16));
                    } else {
                        imageView.setImageTintList(ColorStateList.valueOf(c10024l.adcel));
                    }
                    imageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
                    radiusLayout.post(new RunnableC10613l(c14262l, view, imageView, 5));
                    c14262l.subs();
                    if (c10024l.f20432private != Integer.MIN_VALUE) {
                        popupWindow.setAnimationStyle(i9);
                    } else if (AbstractC15698l.yandex[AbstractC5020l.inmobi(c10024l.f20424default)] == 1) {
                        popupWindow.setAnimationStyle(R.style.Balloon_Fade_Anim);
                    } else {
                        popupWindow.setAnimationStyle(R.style.Balloon_Normal_Anim);
                    }
                    List list2 = c16052l.loadAd;
                    if (c10024l.advert) {
                        boolean zIsEmpty = list2.isEmpty();
                        C3797l c3797l = c14262l.f27867l;
                        if (zIsEmpty) {
                            ((BalloonAnchorOverlayView) c3797l.f7902l).setAnchorView(view);
                        } else {
                            ((BalloonAnchorOverlayView) c3797l.f7902l).setAnchorViewList(AbstractC16901l.m4218final(view, list2));
                        }
                        popupWindow.showAtLocation(view, c10024l.applovin, 0, 0);
                    }
                    if (i9 == Integer.MIN_VALUE) {
                        int iInmobi = AbstractC5020l.inmobi(c10024l.f20433static);
                        if (iInmobi == 0) {
                            popupWindow2.setAnimationStyle(R.style.Balloon_None_Anim);
                        } else if (iInmobi == 1) {
                            popupWindow2.setAnimationStyle(R.style.Balloon_Elastic_Anim);
                        } else if (iInmobi == 2) {
                            popupWindow2.setAnimationStyle(R.style.Balloon_Fade_Anim);
                        } else if (iInmobi == 3) {
                            View contentView = popupWindow2.getContentView();
                            long j2 = c10024l.f20426extends;
                            contentView.setVisibility(4);
                            contentView.post(new RunnableC13086l(contentView, j2, 1));
                            popupWindow2.setAnimationStyle(R.style.Balloon_Normal_Dispose_Anim);
                        } else {
                            if (iInmobi != 4) {
                                C18725l.billing();
                                return;
                            }
                            popupWindow2.setAnimationStyle(R.style.Balloon_Overshoot_Anim);
                        }
                    } else {
                        popupWindow2.setAnimationStyle(i9);
                    }
                    ((FrameLayout) c15615l.f30480l).post(new RunnableC15054l(c14262l, 1));
                    int i17 = c16052l.amazon;
                    int i18 = c16052l.crashlytics;
                    View view2 = c16052l.yandex;
                    int iInmobi2 = AbstractC5020l.inmobi(i17);
                    if (iInmobi2 == 0) {
                        int iAds = AbstractC5573l.ads(view2.getMeasuredWidth() * 0.5f);
                        int iAds2 = AbstractC5573l.ads(view2.getMeasuredHeight() * 0.5f);
                        int iAds3 = AbstractC5573l.ads(c14262l.admob() * 0.5f);
                        int iAds4 = AbstractC5573l.ads(c14262l.billing() * 0.5f);
                        int iInmobi3 = AbstractC5020l.inmobi(i18);
                        if (iInmobi3 == 0) {
                            c8195l = new C8195l(Integer.valueOf((-c14262l.admob()) * i10), Integer.valueOf(-(iAds4 + iAds2)));
                        } else if (iInmobi3 == 1) {
                            c8195l = new C8195l(Integer.valueOf(view2.getMeasuredWidth() * i10), Integer.valueOf(-(iAds4 + iAds2)));
                        } else if (iInmobi3 == 2) {
                            c8195l2 = new C8195l(Integer.valueOf((iAds - iAds3) * i10), Integer.valueOf(-(view2.getMeasuredHeight() + c14262l.billing())));
                            c8195l = c8195l2;
                        } else {
                            if (iInmobi3 != 3) {
                                C18725l.billing();
                                return;
                            }
                            c8195l = new C8195l(Integer.valueOf((iAds - iAds3) * i10), 0);
                        }
                    } else if (iInmobi2 == 1) {
                        c8195l = new C8195l(0, 0);
                    } else {
                        if (iInmobi2 != 2) {
                            C18725l.billing();
                            return;
                        }
                        int iAds5 = AbstractC5573l.ads(view2.getMeasuredWidth() * 0.5f);
                        int iAds6 = AbstractC5573l.ads(view2.getMeasuredHeight() * 0.5f);
                        int iAds7 = AbstractC5573l.ads(c14262l.admob() * 0.5f);
                        int iAds8 = AbstractC5573l.ads(c14262l.billing() * 0.5f);
                        int iInmobi4 = AbstractC5020l.inmobi(i18);
                        if (iInmobi4 == 0) {
                            c8195l = new C8195l(Integer.valueOf((iAds5 - c14262l.admob()) * i10), Integer.valueOf((-iAds8) - iAds6));
                        } else if (iInmobi4 == 1) {
                            c8195l = new C8195l(Integer.valueOf(iAds5 * i10), Integer.valueOf((-iAds8) - iAds6));
                        } else if (iInmobi4 == 2) {
                            c8195l2 = new C8195l(Integer.valueOf((iAds5 - iAds7) * i10), Integer.valueOf(-(c14262l.billing() + iAds6)));
                            c8195l = c8195l2;
                        } else {
                            if (iInmobi4 != 3) {
                                C18725l.billing();
                                return;
                            }
                            c8195l = new C8195l(Integer.valueOf((iAds5 - iAds7) * i10), Integer.valueOf(-iAds6));
                        }
                    }
                    popupWindow2.showAsDropDown(view, ((Number) c8195l.f17098l).intValue() + ((int) view.getTranslationX()), ((Number) c8195l.f17097l).intValue() + ((int) view.getTranslationY()));
                    return;
                }
                return;
            case 5:
                EnumC6748l enumC6748l = EnumC6748l.f14147l;
                C14262l c14262l2 = (C14262l) this.f21534l;
                View view3 = (View) this.f21533l;
                ImageView imageView2 = (ImageView) this.f21536l;
                EnumC6748l enumC6748l2 = EnumC6748l.f14151l;
                EnumC6748l enumC6748l3 = EnumC6748l.f14149l;
                C10024l c10024l2 = c14262l2.f27863l;
                if (c10024l2.f20429interface == 2) {
                    i = 0;
                } else {
                    Rect rect = new Rect();
                    view3.getGlobalVisibleRect(rect);
                    int[] iArr = {0, 0};
                    c14262l2.f27866l.getContentView().getLocationOnScreen(iArr);
                    EnumC6748l enumC6748l4 = c10024l2.metrica;
                    i = 0;
                    EnumC6748l enumC6748l5 = EnumC6748l.f14148l;
                    if (enumC6748l4 == enumC6748l5 && iArr[1] < rect.bottom) {
                        c10024l2.metrica = enumC6748l3;
                    } else if (enumC6748l4 == enumC6748l3 && iArr[1] > rect.top) {
                        c10024l2.metrica = enumC6748l5;
                    }
                    EnumC6748l enumC6748l6 = c10024l2.metrica;
                    if (enumC6748l6 == enumC6748l && iArr[0] < rect.right) {
                        c10024l2.metrica = enumC6748l2;
                    } else if (enumC6748l6 == enumC6748l2 && iArr[0] > rect.left) {
                        c10024l2.metrica = enumC6748l;
                    }
                    c14262l2.subs();
                }
                C15615l c15615l2 = c14262l2.f27860l;
                ImageView imageView3 = (ImageView) c15615l2.f30486l;
                RadiusLayout radiusLayout2 = (RadiusLayout) c15615l2.f30485l;
                EnumC6748l enumC6748l7 = c10024l2.metrica;
                if (c10024l2.f20437throw) {
                    int iOrdinal = enumC6748l7.ordinal();
                    if (iOrdinal == 2) {
                        enumC6748l = enumC6748l2;
                    } else if (iOrdinal != 3) {
                        enumC6748l = enumC6748l7;
                    }
                } else {
                    enumC6748l = enumC6748l7;
                }
                int iOrdinal2 = enumC6748l.ordinal();
                if (iOrdinal2 == 0) {
                    imageView3.setRotation(180.0f);
                    imageView3.setX(c14262l2.amazon(view3));
                    imageView3.setY((radiusLayout2.getY() + radiusLayout2.getHeight()) - 1.0f);
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    imageView3.setElevation(0.0f);
                    imageView3.getX();
                    radiusLayout2.getHeight();
                    imageView3.setForeground(null);
                } else if (iOrdinal2 == 1) {
                    imageView3.setRotation(0.0f);
                    imageView3.setX(c14262l2.amazon(view3));
                    imageView3.setY((radiusLayout2.getY() - c10024l2.yandex()) + 1.0f);
                    imageView3.getX();
                    imageView3.setForeground(null);
                } else if (iOrdinal2 == 2) {
                    imageView3.setRotation(-90.0f);
                    imageView3.setX((radiusLayout2.getX() - c10024l2.loadAd()) + 1.0f);
                    imageView3.setY(c14262l2.purchase(view3));
                    imageView3.getY();
                    imageView3.setForeground(null);
                } else {
                    if (iOrdinal2 != 3) {
                        C18725l.billing();
                        return;
                    }
                    imageView3.setRotation(90.0f);
                    imageView3.setX((radiusLayout2.getX() + radiusLayout2.getWidth()) - 1.0f);
                    imageView3.setY(c14262l2.purchase(view3));
                    radiusLayout2.getWidth();
                    imageView3.getY();
                    imageView3.setForeground(null);
                }
                imageView2.setVisibility(c10024l2.subs ? i : 8);
                return;
            case 6:
                ((AbstractC4829l) this.f21534l).loadAd(C10035l.crashlytics((InterfaceC10687l) this.f21533l), (C9992l) this.f21536l);
                return;
            case 7:
                ((AbstractC4829l) this.f21534l).crashlytics(C10035l.crashlytics((InterfaceC10687l) this.f21533l), (C18450l) this.f21536l);
                return;
            case 8:
                ArrayList arrayList = (ArrayList) this.f21534l;
                InterfaceC2810l interfaceC2810l = (InterfaceC2810l) this.f21533l;
                String str2 = (String) this.f21536l;
                try {
                    for (Object obj2 : arrayList) {
                        if (AbstractC8576l.yandex(((InterfaceC15879l) obj2).mopub(), str2)) {
                            obj = obj2;
                            interfaceC15879l = (InterfaceC15879l) obj;
                            if (interfaceC15879l != null || (abstractC8769lYandex = interfaceC15879l.yandex()) == null) {
                                return;
                            }
                            abstractC8769lYandex.admob(interfaceC2810l);
                            return;
                        }
                    }
                    interfaceC15879l = (InterfaceC15879l) obj;
                    if (interfaceC15879l != null) {
                        return;
                    } else {
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 9:
                C8857l c8857l = (C8857l) this.f21534l;
                Runnable runnable = (Runnable) this.f21533l;
                Runnable runnable2 = (Runnable) this.f21536l;
                if (c8857l.f18212l) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 10:
                C8857l c8857l2 = (C8857l) this.f21534l;
                C15421l c15421l = (C15421l) this.f21533l;
                Map map = Collections.EMPTY_MAP;
                C5807l c5807l = (C5807l) this.f21536l;
                try {
                    c8857l2.f18211l.admob(c15421l);
                    c5807l.loadAd(null);
                    return;
                } catch (RuntimeException e) {
                    c5807l.amazon(e);
                    return;
                }
            case 11:
                C13281l c13281l = (C13281l) this.f21534l;
                ((InterfaceC11885l) this.f21533l).yandex(c13281l.yandex, c13281l.loadAd, (Exception) this.f21536l);
                return;
            case 12:
                C13281l c13281l2 = (C13281l) this.f21534l;
                ((InterfaceC11885l) this.f21533l).purchase(c13281l2.yandex, c13281l2.loadAd, (C2183l) this.f21536l);
                return;
            case 13:
                C0284l c0284l = (C0284l) this.f21534l;
                C15421l c15421l2 = (C15421l) this.f21533l;
                Map map2 = Collections.EMPTY_MAP;
                C5807l c5807l2 = (C5807l) this.f21536l;
                try {
                    c0284l.f1300l.admob(c15421l2);
                    c5807l2.loadAd(null);
                    return;
                } catch (RuntimeException e2) {
                    c5807l2.amazon(e2);
                    return;
                }
            case 14:
                C0284l c0284l2 = (C0284l) this.f21534l;
                Runnable runnable3 = (Runnable) this.f21533l;
                Runnable runnable4 = (Runnable) this.f21536l;
                if (c0284l2.f1305l) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 15:
                yandex();
                return;
            case 16:
                C7025l c7025l = (C7025l) this.f21534l;
                ArrayList arrayList2 = (ArrayList) this.f21533l;
                Runnable runnable5 = (Runnable) this.f21536l;
                if (c7025l.f14718throws != 8) {
                    if (!arrayList2.isEmpty()) {
                        AbstractC5088l.yandex(c7025l.yandex, "encoded data and input buffers are returned");
                    }
                    if ((c7025l.billing instanceof C14315l) && !c7025l.applovin && AbstractC1469l.yandex.loadAd(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        boolean z = c7025l.subscription;
                        String str3 = c7025l.yandex;
                        if (z) {
                            AbstractC5088l.yandex(str3, "mMediaCodec.stop()");
                            c7025l.purchase.stop();
                        } else {
                            AbstractC5088l.yandex(str3, "mMediaCodec.flush()");
                            c7025l.purchase.flush();
                        }
                        c7025l.premium = true;
                    } else {
                        AbstractC5088l.yandex(c7025l.yandex, "mMediaCodec.stop()");
                        c7025l.purchase.stop();
                    }
                }
                runnable5.run();
                int i19 = c7025l.f14718throws;
                if (i19 == 7) {
                    c7025l.amazon();
                    return;
                }
                if (!c7025l.premium) {
                    c7025l.billing();
                }
                c7025l.admob(1);
                if (i19 == 5 || i19 == 6) {
                    c7025l.admob.execute(new RunnableC2963l(c7025l, c7025l.adcel.crashlytics(), i6));
                    if (i19 == 6) {
                        c7025l.admob.execute(new RunnableC2963l(c7025l, c7025l.adcel.crashlytics(), i5));
                        return;
                    }
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((InterfaceC0713l) this.f21533l).Signature(new C10756l(6, (String) this.f21536l, (Throwable) this.f21534l));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10398l c10398l = (C10398l) this.f21534l;
                InterfaceC15984l interfaceC15984l = (InterfaceC15984l) this.f21533l;
                Executor executor = (Executor) this.f21536l;
                LinkedHashMap linkedHashMap = c10398l.f21220l;
                interfaceC15984l.getClass();
                executor.getClass();
                linkedHashMap.put(interfaceC15984l, executor);
                executor.execute(new RunnableC0336l(interfaceC15984l, c10398l.f21219l, 18));
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C18676l c18676l = (C18676l) this.f21534l;
                Executor executor2 = (Executor) this.f21533l;
                InterfaceC0713l interfaceC0713l = (InterfaceC0713l) this.f21536l;
                C7025l c7025l2 = c18676l.smaato;
                if (c7025l2.f14718throws == 8) {
                    return;
                }
                try {
                    Objects.requireNonNull(interfaceC0713l);
                    executor2.execute(new RunnableC11992l(interfaceC0713l, i4));
                    return;
                } catch (RejectedExecutionException e3) {
                    AbstractC5088l.amazon(c7025l2.yandex, "Unable to post to the supplied executor.", e3);
                    return;
                }
            case 20:
                FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f21534l;
                Intent intent = (Intent) this.f21533l;
                C2350l c2350l = (C2350l) this.f21536l;
                try {
                    firebaseMessagingService.loadAd(intent);
                    return;
                } finally {
                    c2350l.loadAd(null);
                }
            case 21:
                AbstractC8769l abstractC8769l = (AbstractC8769l) this.f21534l;
                C8157l c8157l = (C8157l) this.f21533l;
                C13716l c13716l = (C13716l) this.f21536l;
                if (abstractC8769l != null && (c16749l = (C16749l) c8157l.smaato.billing(abstractC8769l)) != null) {
                    c16749l.yandex.admob(c16749l);
                }
                c8157l.firebase(c13716l, new C11564l(i4, new C8250l(i4, c8157l)));
                return;
            case 22:
                ListenableFuture listenableFuture = (ListenableFuture) this.f21534l;
                C1090l c1090l = (C1090l) this.f21533l;
                C2427l c2427l = (C2427l) this.f21536l;
                try {
                    bitmap = (Bitmap) AbstractC7151l.crashlytics(listenableFuture);
                } catch (CancellationException | ExecutionException e4) {
                    AbstractC6427l.mopub("MLSLegacyStub", "failed to get bitmap", e4);
                }
                c1090l.smaato(AbstractC18585l.yandex(c2427l, bitmap));
                return;
            case 23:
                ServiceC16415l serviceC16415l = (ServiceC16415l) this.f21534l;
                C6499l c6499l = (C6499l) this.f21533l;
                AbstractC14330l abstractC14330l = (AbstractC14330l) this.f21536l;
                if (!serviceC16415l.f32115l.m3301extends(c6499l, 50004)) {
                    abstractC14330l.billing(null);
                    return;
                } else {
                    C1090l c1090lM3983this = AbstractC15323l.m3983this(serviceC16415l.f32112l.license(c6499l), new C6680l(serviceC16415l, i5));
                    c1090lM3983this.yandex(new RunnableC10879l(c1090lM3983this, abstractC14330l, i5), EnumC1535l.f3808l);
                    return;
                }
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ServiceC16415l serviceC16415l2 = (ServiceC16415l) this.f21534l;
                C6499l c6499l2 = (C6499l) this.f21533l;
                String str4 = (String) this.f21536l;
                if (serviceC16415l2.f32115l.m3301extends(c6499l2, 50002)) {
                    serviceC16415l2.f32112l.m1417package(c6499l2, str4);
                    return;
                }
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C3726l) this.f21534l).m1418strictfp((C6499l) this.f21533l, (String) this.f21536l);
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C16811l c16811l = (C16811l) this.f21534l;
                String str5 = (String) this.f21533l;
                Bundle bundle = (Bundle) this.f21536l;
                c16811l.m4198l();
                InterfaceC11345l interfaceC11345l = c16811l.f32834l;
                AbstractC10199l it = (!interfaceC11345l.mo319l() ? C14023l.loadAd : interfaceC11345l.mo312l()).yandex.iterator();
                while (it.hasNext()) {
                    C12417l c12417l3 = (C12417l) it.next();
                    if (c12417l3.yandex == 0 && c12417l3.loadAd.equals(str5)) {
                        c12417l2 = c12417l3;
                        if (c12417l2 == null || C14869l.vip(str5)) {
                            c12417l = new C12417l(str5, bundle);
                            c16811l.m4198l();
                            if (interfaceC11345l.mo319l()) {
                                listenableFuturePurchase = interfaceC11345l.mo340l(c12417l, bundle);
                            } else {
                                listenableFuturePurchase = AbstractC7151l.purchase(new C5159l(-100));
                            }
                            listenableFuturePurchase.yandex(new RunnableC9929l(listenableFuturePurchase, new C10828l(str5, i3), i2), EnumC1535l.f3808l);
                            return;
                        }
                        return;
                    }
                }
                if (c12417l2 == null) {
                }
                c12417l = new C12417l(str5, bundle);
                c16811l.m4198l();
                if (interfaceC11345l.mo319l()) {
                    listenableFuturePurchase = interfaceC11345l.mo340l(c12417l, bundle);
                } else {
                    listenableFuturePurchase = AbstractC7151l.purchase(new C5159l(-100));
                }
                listenableFuturePurchase.yandex(new RunnableC9929l(listenableFuturePurchase, new C10828l(str5, i3), i2), EnumC1535l.f3808l);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C12031l c12031l = (C12031l) this.f21534l;
                C16971l c16971l = (C16971l) this.f21533l;
                C5019l c5019l = (C5019l) this.f21536l;
                C17505l c17505l2 = c12031l.crashlytics;
                C13708l c13708lMopub = c16971l.mopub();
                C1424l c1424l = c17505l2.f34108l;
                InterfaceC9814l interfaceC9814l = c17505l2.f34103l;
                interfaceC9814l.getClass();
                c1424l.getClass();
                c1424l.f3602l = AbstractC1186l.Signature(c13708lMopub);
                if (!c13708lMopub.isEmpty()) {
                    c1424l.f3604l = (C5019l) c13708lMopub.get(0);
                    c5019l.getClass();
                    c1424l.f3606l = c5019l;
                }
                if (((C5019l) c1424l.f3605l) == null) {
                    c1424l.f3605l = C1424l.m892default(interfaceC9814l, (AbstractC1186l) c1424l.f3602l, (C5019l) c1424l.f3604l, (C3904l) c1424l.f3603l);
                }
                c1424l.m925l(interfaceC9814l.mo2791l());
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                HandlerC0341l handlerC0341l = (HandlerC0341l) this.f21534l;
                C6499l c6499l3 = (C6499l) this.f21533l;
                KeyEvent keyEvent = (KeyEvent) this.f21536l;
                C3726l c3726l = (C3726l) handlerC0341l.crashlytics;
                if (c3726l.vip(c6499l3)) {
                    c3726l.amazon(keyEvent, false, false);
                } else {
                    C13350l c13350l = c3726l.admob;
                    C16701l c16701l = c6499l3.yandex;
                    c16701l.getClass();
                    c13350l.getClass();
                    c13350l.m3633default(1, new C14240l(c13350l, i5), c16701l, true);
                }
                handlerC0341l.loadAd = null;
                return;
            default:
                C3726l c3726l2 = (C3726l) this.f21534l;
                C9896l c9896l = (C9896l) this.f21536l;
                if (c3726l2.metrica()) {
                    return;
                }
                AbstractC8672l.billing(c3726l2.tapsense, c9896l);
                return;
        }
    }

    public /* synthetic */ RunnableC10613l(AbstractC4829l abstractC4829l, C10035l c10035l, InterfaceC10687l interfaceC10687l, Object obj, int i) {
        this.f21535l = i;
        this.f21534l = abstractC4829l;
        this.f21533l = interfaceC10687l;
        this.f21536l = obj;
    }

    public /* synthetic */ RunnableC10613l(C0284l c0284l, C15421l c15421l, C5807l c5807l) {
        this.f21535l = 13;
        Map map = Collections.EMPTY_MAP;
        this.f21534l = c0284l;
        this.f21533l = c15421l;
        this.f21536l = c5807l;
    }

    public /* synthetic */ RunnableC10613l(InterfaceC0713l interfaceC0713l, int i, String str, Throwable th) {
        this.f21535l = 17;
        this.f21533l = interfaceC0713l;
        this.f21536l = str;
        this.f21534l = th;
    }

    public /* synthetic */ RunnableC10613l(ServiceC16415l serviceC16415l, C6499l c6499l, AbstractC14330l abstractC14330l, String str) {
        this.f21535l = 23;
        this.f21534l = serviceC16415l;
        this.f21533l = c6499l;
        this.f21536l = abstractC14330l;
    }

    public /* synthetic */ RunnableC10613l(C9716l c9716l, C16811l c16811l, String str, Bundle bundle) {
        this.f21535l = 26;
        this.f21534l = c16811l;
        this.f21533l = str;
        this.f21536l = bundle;
    }

    public /* synthetic */ RunnableC10613l(Object obj, Object obj2, Object obj3, int i) {
        this.f21535l = i;
        this.f21534l = obj;
        this.f21533l = obj2;
        this.f21536l = obj3;
    }
}
