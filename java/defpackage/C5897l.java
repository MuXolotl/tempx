package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٌؘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5897l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2814l f12434l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12435l;

    public /* synthetic */ C5897l(C2814l c2814l, int i) {
        this.f12435l = i;
        this.f12434l = c2814l;
    }

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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f12435l;
        int i2 = 4;
        boolean z = false;
        z = false;
        byte b = 0;
        C2814l c2814l = this.f12434l;
        switch (i) {
            case 0:
                C15050l c15050l = (C15050l) obj;
                if (((C4645l) AbstractC16584l.loadAd().f15735l).yandex == c15050l.yandex) {
                    c2814l.amazon(C11538l.f23209l);
                } else {
                    AbstractC9033l.crashlytics(c2814l.yandex, new C5163l(c15050l, c2814l, b == true ? 1 : 0, 14));
                }
                return Unit.INSTANCE;
            case 1:
                EnumC12111l enumC12111l = (EnumC12111l) EnumC12111l.f24085l.get(Integer.parseInt((String) obj));
                c2814l.amazon.put(c2814l.loadAd, enumC12111l);
                boolean zPurchase = true;
                if (c2814l.subs != enumC12111l.ordinal()) {
                    if (c2814l.subs != -1) {
                        C2491l c2491l = C2491l.yandex;
                        c2491l.getClass();
                        C8634l c8634l = C2491l.admob;
                        InterfaceC13922l interfaceC13922l = C2491l.loadAd[4];
                        if (!((Boolean) c8634l.pro(c2491l)).booleanValue()) {
                            z = true;
                        }
                    }
                    zPurchase = c2814l.purchase(enumC12111l, z);
                } else {
                    c2814l.yandex();
                }
                return Boolean.valueOf(zPurchase);
            default:
                c2814l.crashlytics(new C3755l(i2));
                AppActivity appActivity = c2814l.yandex;
                FrameLayout[] frameLayoutArr = c2814l.purchase;
                FrameLayout frameLayout = frameLayoutArr[8];
                if (frameLayout != null) {
                    View childAt = frameLayout.getChildAt(0);
                    C9967l c9967l = childAt instanceof C9967l ? (C9967l) childAt : null;
                    if (c9967l != null) {
                        c9967l.crashlytics(AbstractC5852l.loadAd);
                    }
                }
                FrameLayout frameLayout2 = frameLayoutArr[9];
                if (frameLayout2 != null) {
                    View childAt2 = frameLayout2.getChildAt(0);
                    C9967l c9967l2 = childAt2 instanceof C9967l ? (C9967l) childAt2 : null;
                    if (c9967l2 != null) {
                        c9967l2.crashlytics(AbstractC5852l.loadAd);
                    }
                }
                C7644l c7644l = appActivity.f36640l;
                C13530l c13530l = appActivity.f36642l;
                ((LinearLayout) c7644l.f15739l).setPadding(0, 0, 0, AbstractC5852l.loadAd);
                C9879l c9879l = c13530l.crashlytics;
                int i3 = AbstractC5852l.yandex;
                int i4 = AbstractC5852l.loadAd;
                C15700l c15700l = c9879l.loadAd;
                c15700l.yandex.subs(i3);
                c15700l.loadAd.subs(i4);
                FrameLayout frameLayout3 = (FrameLayout) appActivity.f36640l.f15740l;
                int i5 = AbstractC5852l.crashlytics;
                int i6 = AbstractC5852l.amazon;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout3.getLayoutParams();
                marginLayoutParams.leftMargin = i5;
                marginLayoutParams.rightMargin = i6;
                frameLayout3.setLayoutParams(marginLayoutParams);
                AppActivity appActivity2 = c13530l.yandex;
                if (c13530l.loadAd()) {
                    CustomBottomSheetBehavior customBottomSheetBehavior = c13530l.amazon;
                    if (customBottomSheetBehavior == null) {
                        customBottomSheetBehavior = null;
                    }
                    if (customBottomSheetBehavior.f645private == 3) {
                        ((LinearLayout) appActivity2.f36640l.f15739l).measure(0, 0);
                        LinearLayout linearLayout = (LinearLayout) appActivity2.f36640l.f15739l;
                        int i7 = -Math.max(0, linearLayout.getMeasuredHeight() + AbstractC5852l.loadAd);
                        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        int i8 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                        marginLayoutParams3.topMargin = i8;
                        marginLayoutParams3.bottomMargin = i7;
                        linearLayout.setLayoutParams(marginLayoutParams3);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
