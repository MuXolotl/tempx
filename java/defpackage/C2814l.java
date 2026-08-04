package defpackage;

import android.app.FragmentBreadCrumbs;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lٟؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2814l {
    public Ctry admob;
    public final LinkedHashMap amazon;
    public C1796l billing;
    public boolean crashlytics;
    public Cgoto loadAd;
    public C1796l mopub;
    public final FrameLayout[] purchase;
    public int subs;
    public final AppActivity yandex;

    public C2814l(AppActivity appActivity) {
        this.yandex = appActivity;
        EnumC18423l enumC18423l = EnumC18423l.OrbitPlayer;
        this.loadAd = C11538l.f23209l;
        this.amazon = new LinkedHashMap();
        this.purchase = new FrameLayout[EnumC12111l.f24085l.pro()];
        this.subs = -1;
    }

    public final void amazon(Cgoto cgoto) {
        if (AbstractC8576l.yandex(this.loadAd, cgoto)) {
            return;
        }
        this.loadAd = cgoto;
        this.subs = -1;
        loadAd(true);
        ((NextDockView) this.yandex.f36640l.f15742l).refreshTheme();
    }

    public final void crashlytics(Function2 function2) {
        FrameLayout[] frameLayoutArr = this.purchase;
        int length = frameLayoutArr.length;
        for (int i = 0; i < length; i++) {
            FrameLayout frameLayout = frameLayoutArr[i];
            C0380l c0380l = null;
            View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
            C9967l c9967l = childAt instanceof C9967l ? (C9967l) childAt : null;
            View childAt2 = frameLayout != null ? frameLayout.getChildAt(1) : null;
            if (childAt2 instanceof C0380l) {
                c0380l = (C0380l) childAt2;
            }
            function2.invoke(c9967l, c0380l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    public final void loadAd(boolean z) {
        EnumC18423l enumC18423l;
        if (!z) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            if (AbstractC8576l.yandex(vKXApplication.getApplicationContext().getPackageName(), "ua.itaysonlab.vkx")) {
                C16287l.yandex.getClass();
                if (!C16287l.yandex() || C2491l.yandex.loadAd()) {
                    enumC18423l = EnumC18423l.OrbitPlayer;
                } else {
                    enumC18423l = EnumC18423l.VKX;
                }
            } else {
                enumC18423l = EnumC18423l.OrbitPlayer;
            }
            this.loadAd = enumC18423l.f35976l;
        }
        AppActivity appActivity = this.yandex;
        NextDockView nextDockView = (NextDockView) appActivity.f36640l.f15742l;
        ArrayList arrayList = nextDockView.f36849l;
        if (!arrayList.isEmpty()) {
            while (!arrayList.isEmpty()) {
                int iSmaato = AbstractC14055l.smaato(arrayList);
                nextDockView.removeViewAt(iSmaato);
                arrayList.remove(iSmaato);
                nextDockView.setWeightSum(arrayList.size());
            }
        }
        EnumC12111l[] enumC12111lArr = (EnumC12111l[]) this.loadAd.f833l;
        ArrayList arrayList2 = new ArrayList(enumC12111lArr.length);
        for (EnumC12111l enumC12111l : enumC12111lArr) {
            arrayList2.add(new C17572l(String.valueOf(enumC12111l.ordinal()), enumC12111l.f24086l, enumC12111l.f24087l));
        }
        nextDockView.yandex(arrayList2);
        int i = 1;
        if (!this.crashlytics) {
            SharedPreferences sharedPreferences = AbstractC3630l.yandex;
            nextDockView.setLegacyMode(AbstractC3630l.yandex(EnumC14530l.f28446l));
            this.crashlytics = true;
        }
        nextDockView.setOnItemClickListener(new C5897l(this, i));
        nextDockView.setOnLongItemClickListener(new C15707l(8, this));
        Cgoto cgoto = this.loadAd;
        boolean z2 = cgoto instanceof C11538l;
        LinkedHashMap linkedHashMap = this.amazon;
        EnumC12111l enumC12111l2 = EnumC12111l.f24084l;
        if (z2) {
            C16287l.yandex.getClass();
            boolean zYandex = C16287l.yandex();
            C7644l c7644l = appActivity.f36640l;
            if (zYandex) {
                AbstractC5833l.subs((NextDockView) c7644l.f15742l);
                NextDockView nextDockView2 = (NextDockView) appActivity.f36640l.f15742l;
                C11538l c11538l = C11538l.f23209l;
                EnumC12111l[] enumC12111lArr2 = (EnumC12111l[]) c11538l.f833l;
                EnumC12111l enumC12111l3 = (EnumC12111l) linkedHashMap.get(c11538l);
                if (enumC12111l3 == null) {
                    VKXApplication.Companion companion = VKXApplication.f36628l;
                    enumC12111l3 = !VKXApplication.Companion.crashlytics() ? EnumC12111l.f24083l : enumC12111lArr2[AbstractC8576l.billing(C2491l.yandex.yandex(), new C8934l(0, enumC12111lArr2.length - 1, 1))];
                }
                nextDockView2.loadAd(String.valueOf(enumC12111l3.ordinal()), (6 & 2) != 0, true);
                C7206l.yandex.yandex(((NextDockView) appActivity.f36640l.f15742l).getCurrentFrameView(), EnumC10788l.f21806l);
            } else {
                AbstractC5833l.purchase((LinearLayout) c7644l.f15739l);
                AbstractC5833l.purchase((CoordinatorLayout) appActivity.f36640l.f15741l);
                purchase(enumC12111l2, false);
            }
        } else {
            if (!(cgoto instanceof C1722l)) {
                C18725l.billing();
                return;
            }
            C16287l.yandex.getClass();
            if (C16287l.yandex() || !AbstractC8576l.yandex(appActivity.getPackageName(), "ua.itaysonlab.vkx") || C2491l.yandex.loadAd()) {
                AbstractC5833l.subs((NextDockView) appActivity.f36640l.f15742l);
                NextDockView nextDockView3 = (NextDockView) appActivity.f36640l.f15742l;
                EnumC12111l enumC12111l4 = (EnumC12111l) linkedHashMap.get(C1722l.f4118l);
                if (enumC12111l4 == null) {
                    enumC12111l4 = EnumC12111l.f24077l;
                }
                nextDockView3.loadAd(String.valueOf(enumC12111l4.ordinal()), (6 & 2) != 0, true);
            } else {
                AbstractC5833l.purchase((LinearLayout) appActivity.f36640l.f15739l);
                AbstractC5833l.purchase((CoordinatorLayout) appActivity.f36640l.f15741l);
                purchase(enumC12111l2, false);
            }
        }
        C7644l c7644l2 = appActivity.f36640l;
        if (c7644l2 != null) {
            ((LinearLayout) c7644l2.f15739l).setBackgroundColor(AbstractC13209l.yandex(R.attr.nextdock_background));
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean purchase(EnumC12111l enumC12111l, boolean z) {
        float f;
        boolean z2;
        Constructor constructor;
        C13750l c13750l;
        boolean z3;
        AbstractC17777l c13220l;
        C7644l c7644l;
        Object objLastElement;
        Stack<AbstractC17777l> fragmentStack;
        boolean z4 = false;
        boolean z5 = false;
        if (this.subs == enumC12111l.ordinal()) {
            return false;
        }
        AppActivity appActivity = this.yandex;
        if (appActivity.f36640l == null) {
            return false;
        }
        int i = 22;
        InterfaceC14029l interfaceC14029l = null;
        if (enumC12111l == EnumC12111l.f24079l) {
            C5993l c5993l = C3544l.loadAd;
            if (!c5993l.yandex()) {
                C1027l c1027l = new C1027l(this, enumC12111l, z);
                if (c5993l.yandex()) {
                    c1027l.invoke();
                    return false;
                }
                AbstractC9033l.crashlytics(appActivity, new C15559l(appActivity, c1027l, interfaceC14029l, i));
                return false;
            }
        }
        int i2 = this.subs;
        int iOrdinal = enumC12111l.ordinal();
        FrameLayout[] frameLayoutArr = this.purchase;
        if (i2 != -1) {
            FragmentBreadCrumbs fragmentBreadCrumbs = frameLayoutArr[i2];
            View childAt = fragmentBreadCrumbs != 0 ? fragmentBreadCrumbs.getChildAt(0) : null;
            C9967l c9967l = childAt instanceof C9967l ? (C9967l) childAt : null;
            if (c9967l != null) {
                AbstractC15450l.crashlytics(c9967l, C11776l.f23569l);
            }
            try {
                FragmentBreadCrumbs fragmentBreadCrumbs2 = frameLayoutArr[i2];
                View childAt2 = fragmentBreadCrumbs2 != 0 ? fragmentBreadCrumbs2.getChildAt(0) : null;
                C9967l c9967l2 = childAt2 instanceof C9967l ? (C9967l) childAt2 : null;
                if (c9967l2 == null || (fragmentStack = c9967l2.getFragmentStack()) == null) {
                    objLastElement = null;
                } else {
                    if (fragmentStack.isEmpty()) {
                        fragmentStack = null;
                    }
                    if (fragmentStack != null) {
                        objLastElement = fragmentStack.lastElement();
                    } else {
                        objLastElement = null;
                    }
                }
                InterfaceC17091l interfaceC17091l = objLastElement instanceof InterfaceC17091l ? (InterfaceC17091l) objLastElement : null;
                if (interfaceC17091l != null) {
                    interfaceC17091l.startapp();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable unused) {
            }
        }
        if (((FrameLayout) appActivity.f36640l.f15740l).getChildCount() != 0) {
            C7644l c7644l2 = appActivity.f36640l;
            if (z) {
                int childCount = ((FrameLayout) c7644l2.f15740l).getChildCount() - 1;
                int i3 = 0;
                f = 0.75f;
                while (true) {
                    c7644l = appActivity.f36640l;
                    if (i3 >= childCount) {
                        break;
                    }
                    ((FrameLayout) c7644l.f15740l).removeViewAt(i3);
                    i3++;
                }
                final View childAt3 = ((FrameLayout) c7644l.f15740l).getChildAt(0);
                Ctry ctry = new Ctry(this, childAt3, i);
                C1796l c1796l = this.billing;
                if (c1796l != null) {
                    c1796l.loadAd();
                    this.admob.invoke();
                }
                childAt3.setAlpha(1.0f);
                childAt3.setTranslationX(0.0f);
                C7644l c7644l3 = appActivity.f36640l;
                final float width = (iOrdinal > i2 ? -((FrameLayout) c7644l3.f15740l).getWidth() : ((FrameLayout) c7644l3.f15740l).getWidth()) * 0.75f;
                C1796l c1796lM1708break = ((C5138l) ((C3797l) C9967l.getSpringModule()).f7903l).m1708break((C1414l) ((C3797l) C9967l.getSpringModule()).f7902l);
                final boolean z6 = z5 ? 1 : 0;
                c1796lM1708break.yandex(new InterfaceC9547l() { // from class: lؙٞۗ
                    @Override // defpackage.InterfaceC9547l
                    public final void yandex(C1796l c1796l2) {
                        int i4 = z6;
                        float f2 = width;
                        View view = childAt3;
                        switch (i4) {
                            case 0:
                                float f3 = c1796l2.yandex;
                                view.setTranslationX(f2 * f3);
                                view.setAlpha(1.0f - f3);
                                break;
                            default:
                                FrameLayout frameLayout = (FrameLayout) view;
                                float f4 = c1796l2.yandex;
                                frameLayout.setTranslationX((1.0f - f4) * f2);
                                frameLayout.setAlpha(f4);
                                break;
                        }
                    }
                });
                ((ArrayList) c1796lM1708break.amazon).add(new C11614l(this, ctry));
                c1796lM1708break.amazon();
                this.billing = c1796lM1708break;
                this.admob = ctry;
            } else {
                f = 0.75f;
                ((FrameLayout) c7644l2.f15740l).removeAllViews();
            }
        } else {
            f = 0.75f;
        }
        this.subs = iOrdinal;
        FragmentBreadCrumbs fragmentBreadCrumbs3 = frameLayoutArr[iOrdinal];
        if (fragmentBreadCrumbs3 == 0) {
            C0380l c0380l = new C0380l(appActivity);
            c0380l.f1468l = -1;
            c0380l.f1465l = -1;
            c0380l.f1473l = new Rect();
            c0380l.f1464l = new Paint(1);
            c0380l.f1469l = new C0992l(c0380l.getContext(), AbstractC13209l.yandex(android.R.attr.colorAccent));
            c0380l.f1467l = (int) TypedValue.applyDimension(1, 8.0f, c0380l.getResources().getDisplayMetrics());
            TypedArray typedArrayObtainStyledAttributes = c0380l.getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.actionBarSize});
            c0380l.f1475l = (int) typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            c0380l.setWillNotDraw(true);
            c0380l.refreshTheme();
            c0380l.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            c0380l.setStatusbarHeight(AbstractC5852l.yandex);
            C12796l c12796l = new C12796l();
            try {
                HashMap map = C12796l.loadAd;
                if (map.containsKey(FrameLayout.class)) {
                    constructor = (Constructor) map.get(FrameLayout.class);
                } else {
                    try {
                        Constructor constructor2 = FrameLayout.class.getConstructor(Context.class);
                        map.put(FrameLayout.class, constructor2);
                        constructor = constructor2;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                View view = (View) constructor.newInstance(appActivity);
                c12796l.yandex = view;
                if (view == null) {
                    C8339l.smaato("You should set view with method with(...) first!");
                    return false;
                }
                C13750l c13750l2 = (C13750l) view.getTag(R.id.theme_tag);
                if (c13750l2 == null) {
                    c13750l = new C13750l();
                    view.setTag(R.id.theme_tag, c13750l);
                } else {
                    c13750l = c13750l2;
                }
                Iterator it = c13750l.loadAd.iterator();
                while (true) {
                    z3 = z4;
                    if (!it.hasNext()) {
                        View view2 = c12796l.yandex;
                        if (view2 == null) {
                            C8339l.smaato("You should set view with method with(...) first!");
                            return z3;
                        }
                        C13750l c13750l3 = (C13750l) view2.getTag(R.id.theme_tag);
                        if (c13750l3 == null) {
                            c13750l3 = new C13750l();
                            view2.setTag(R.id.theme_tag, c13750l3);
                        }
                        c13750l3.loadAd.add(new C3822l(android.R.attr.background, android.R.attr.windowBackground));
                        break;
                    }
                    C3822l c3822l = (C3822l) it.next();
                    if (c3822l.yandex == 16842964) {
                        c3822l.loadAd = android.R.attr.windowBackground;
                        break;
                    }
                    z4 = z3 ? 1 : 0;
                }
                int iYandex = AbstractC13209l.yandex(android.R.attr.windowBackground);
                View view3 = c12796l.yandex;
                if (view3 == null) {
                    C8339l.smaato("You should set view with method with(...) first!");
                    return z3;
                }
                view3.setBackgroundColor(iYandex);
                C9967l c9967l3 = new C9967l(appActivity);
                c9967l3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c9967l3.getSharedTransformListeners().add(c0380l);
                c9967l3.setInsetExtension(new C4568l(2, c0380l));
                switch (enumC12111l.ordinal()) {
                    case 0:
                        C9633l c9633l = new C9633l();
                        c9633l.f19633l = AbstractC14055l.remoteconfig(new C6164l(), new C15191l());
                        VKXApplication.Companion companion = VKXApplication.f36628l;
                        c9633l.f19634l = AbstractC14055l.remoteconfig(VKXApplication.Companion.loadAd(R.string.odin_tab_foryou), VKXApplication.Companion.loadAd(R.string.odin_search));
                        c13220l = c9633l;
                        break;
                    case 1:
                        c13220l = new C13220l();
                        break;
                    case 2:
                        c13220l = new C5124l();
                        break;
                    case 3:
                        c13220l = new C7711l();
                        break;
                    case 4:
                        c13220l = new C1774l();
                        break;
                    case 5:
                        c13220l = new C16385l(1);
                        break;
                    case 6:
                        c13220l = new C16385l(z3 ? 1 : 0);
                        break;
                    case 7:
                        c13220l = new C9502l();
                        break;
                    case 8:
                        c13220l = new C17984l(z3 ? 1 : 0);
                        break;
                    case 9:
                        c13220l = new C13640l(z3 ? 1 : 0);
                        break;
                    default:
                        C18725l.billing();
                        return z3;
                }
                c9967l3.remoteconfig(c13220l);
                c9967l3.amazon(AbstractC5852l.yandex);
                c9967l3.crashlytics(AbstractC10026l.yandex.admob() + AbstractC5852l.loadAd);
                Unit unit2 = Unit.INSTANCE;
                View view4 = c12796l.yandex;
                if (view4 == null) {
                    C8339l.smaato("You should set view with method with(...) first!");
                    return false;
                }
                if (!(view4 instanceof ViewGroup)) {
                    C8339l.metrica("You can't add views to something other than ViewGroup");
                    return false;
                }
                ((ViewGroup) view4).addView(c9967l3);
                View view5 = c12796l.yandex;
                if (view5 == null) {
                    C8339l.smaato("You should set view with method with(...) first!");
                    return false;
                }
                if (!(view5 instanceof ViewGroup)) {
                    C8339l.metrica("You can't add views to something other than ViewGroup");
                    return false;
                }
                ((ViewGroup) view5).addView(c0380l);
                View view6 = c12796l.yandex;
                if (view6 == null) {
                    C8339l.smaato("You should set view with method with(...) first!");
                    return false;
                }
                frameLayoutArr[iOrdinal] = view6;
                z2 = true;
            } catch (Exception e2) {
                C11467l.metrica(e2);
                return false;
            }
        } else {
            View childAt4 = fragmentBreadCrumbs3.getChildAt(0);
            C9967l c9967l4 = childAt4 instanceof C9967l ? (C9967l) childAt4 : null;
            if (c9967l4 != null) {
                AbstractC15450l.crashlytics(c9967l4, C11744l.f23522l);
            }
            z2 = false;
        }
        final FragmentBreadCrumbs fragmentBreadCrumbs4 = frameLayoutArr[iOrdinal];
        if (fragmentBreadCrumbs4.getParent() != null) {
            ((ViewGroup) fragmentBreadCrumbs4.getParent()).removeView(fragmentBreadCrumbs4);
        }
        ((FrameLayout) appActivity.f36640l.f15740l).addView(fragmentBreadCrumbs4);
        if (z) {
            C1796l c1796l2 = this.mopub;
            if (c1796l2 != null) {
                c1796l2.loadAd();
            }
            C7644l c7644l4 = appActivity.f36640l;
            final float width2 = (iOrdinal > i2 ? ((FrameLayout) c7644l4.f15740l).getWidth() : -((FrameLayout) c7644l4.f15740l).getWidth()) * f;
            fragmentBreadCrumbs4.setAlpha(0.0f);
            fragmentBreadCrumbs4.setTranslationX(width2);
            C1796l c1796lM1708break2 = ((C5138l) ((C3797l) C9967l.getSpringModule()).f7903l).m1708break((C1414l) ((C3797l) C9967l.getSpringModule()).f7902l);
            final int i4 = 1;
            c1796lM1708break2.yandex(new InterfaceC9547l() { // from class: lؙٞۗ
                @Override // defpackage.InterfaceC9547l
                public final void yandex(C1796l c1796l3) {
                    int i5 = i4;
                    float f2 = width2;
                    View view7 = fragmentBreadCrumbs4;
                    switch (i5) {
                        case 0:
                            float f3 = c1796l3.yandex;
                            view7.setTranslationX(f2 * f3);
                            view7.setAlpha(1.0f - f3);
                            break;
                        default:
                            FrameLayout frameLayout = (FrameLayout) view7;
                            float f4 = c1796l3.yandex;
                            frameLayout.setTranslationX((1.0f - f4) * f2);
                            frameLayout.setAlpha(f4);
                            break;
                    }
                }
            });
            ((ArrayList) c1796lM1708break2.amazon).add(new C12073l(this));
            c1796lM1708break2.amazon();
            this.mopub = c1796lM1708break2;
        } else {
            fragmentBreadCrumbs4.setAlpha(1.0f);
            fragmentBreadCrumbs4.setTranslationX(0.0f);
        }
        C9967l c9967l5 = (C9967l) frameLayoutArr[iOrdinal].getChildAt(0);
        appActivity.f5599l = c9967l5;
        c9967l5.setNavigationListener(appActivity);
        appActivity.Signature();
        if (!z2) {
            return true;
        }
        appActivity.f5599l.amazon(AbstractC5852l.yandex);
        appActivity.f5599l.crashlytics(AbstractC10026l.yandex.admob() + AbstractC5852l.loadAd);
        return true;
    }

    public final void yandex() {
        FrameLayout frameLayout = this.purchase[this.subs];
        View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        C9967l c9967l = childAt instanceof C9967l ? (C9967l) childAt : null;
        if (c9967l == null) {
            return;
        }
        if (c9967l.getFragmentStack().size() == 1) {
            InterfaceC3177l interfaceC3177l = c9967l.getFragmentStack().get(0);
            InterfaceC0489l interfaceC0489l = interfaceC3177l instanceof InterfaceC0489l ? (InterfaceC0489l) interfaceC3177l : null;
            if (interfaceC0489l != null) {
                interfaceC0489l.subs();
                return;
            }
            return;
        }
        if (c9967l.getFragmentStack().size() == 2) {
            c9967l.billing(true, true);
            return;
        }
        if (c9967l.getFragmentStack().size() > 2) {
            for (int iSmaato = AbstractC14055l.smaato(c9967l.getFragmentStack()) - 1; iSmaato > 0; iSmaato--) {
                Stack stack = c9967l.f20349l;
                if (iSmaato >= c9967l.f20330l.size() - 2) {
                    if (iSmaato == c9967l.f20330l.size() - 1) {
                        c9967l.removeViewAt(c9967l.getChildCount() - 1);
                    } else {
                        c9967l.removeViewAt(0);
                    }
                } else if (iSmaato > 2 && !stack.isEmpty()) {
                    stack.remove(iSmaato - 2);
                }
                if (c9967l.f20330l.size() > 2 && c9967l.getChildCount() < 2) {
                    View view = (View) stack.pop();
                    view.setVisibility(8);
                    c9967l.addView(view, 0);
                    Stack stack2 = c9967l.f20330l;
                    ((AbstractC17777l) stack2.get(stack2.size() - 2)).mo2208synchronized();
                }
                AbstractC17777l abstractC17777l = (AbstractC17777l) c9967l.f20330l.remove(iSmaato);
                c9967l.f20333l.remove(iSmaato);
                abstractC17777l.appmetrica();
                int size = c9967l.f20330l.size();
                AbstractC17777l abstractC17777l2 = size > 0 ? (AbstractC17777l) c9967l.f20330l.peek() : null;
                AbstractC17777l abstractC17777l3 = size > 1 ? (AbstractC17777l) c9967l.f20330l.get(size - 2) : null;
                for (C0380l c0380l : c9967l.f20328l) {
                    c0380l.loadAd(abstractC17777l3, abstractC17777l2);
                    c0380l.crashlytics(null, abstractC17777l3, abstractC17777l2, 1.0f);
                }
            }
            c9967l.billing(true, true);
        }
    }
}
