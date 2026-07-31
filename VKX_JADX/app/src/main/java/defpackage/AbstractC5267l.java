package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٟؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5267l {
    public static final int crashlytics;
    public static final int loadAd;
    public static final Map yandex = AbstractC8676l.remoteconfig(new C8195l(EnumC18024l.f35249l, Integer.valueOf(R.layout.glance_text)), new C8195l(EnumC18024l.f35248l, Integer.valueOf(R.layout.glance_list)), new C8195l(EnumC18024l.f35254l, Integer.valueOf(R.layout.glance_check_box)), new C8195l(EnumC18024l.f35234l, Integer.valueOf(R.layout.glance_check_box_backport)), new C8195l(EnumC18024l.f35237l, Integer.valueOf(R.layout.glance_button)), new C8195l(EnumC18024l.f35258l, Integer.valueOf(R.layout.glance_swtch)), new C8195l(EnumC18024l.f35242l, Integer.valueOf(R.layout.glance_swtch_backport)), new C8195l(EnumC18024l.f35253l, Integer.valueOf(R.layout.glance_frame)), new C8195l(EnumC18024l.f35236l, Integer.valueOf(R.layout.glance_image_crop)), new C8195l(EnumC18024l.f35259l, Integer.valueOf(R.layout.glance_image_crop_decorative)), new C8195l(EnumC18024l.f35235l, Integer.valueOf(R.layout.glance_image_fit)), new C8195l(EnumC18024l.f35239l, Integer.valueOf(R.layout.glance_image_fit_decorative)), new C8195l(EnumC18024l.f35231l, Integer.valueOf(R.layout.glance_image_fill_bounds)), new C8195l(EnumC18024l.f35245l, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new C8195l(EnumC18024l.f35246l, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new C8195l(EnumC18024l.f35255l, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new C8195l(EnumC18024l.f35252l, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new C8195l(EnumC18024l.f35232l, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new C8195l(EnumC18024l.f35256l, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new C8195l(EnumC18024l.f35247l, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new C8195l(EnumC18024l.f35238l, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new C8195l(EnumC18024l.f35243l, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new C8195l(EnumC18024l.f35251l, Integer.valueOf(R.layout.glance_radio_button)), new C8195l(EnumC18024l.f35230l, Integer.valueOf(R.layout.glance_radio_button_backport)));

    static {
        int size = AbstractC4468l.billing.size();
        loadAd = size;
        crashlytics = Build.VERSION.SDK_INT >= 31 ? AbstractC4468l.admob : AbstractC4468l.admob / size;
    }

    public static final int admob(AbstractC11876l abstractC11876l) {
        if (abstractC11876l instanceof C10365l) {
            return 1;
        }
        if (abstractC11876l instanceof C1617l) {
            return 3;
        }
        if (abstractC11876l instanceof C16589l) {
            return 4;
        }
        if ((abstractC11876l instanceof C9402l) || (abstractC11876l instanceof C3287l)) {
            return 2;
        }
        C18725l.billing();
        return 0;
    }

    public static final C5697l amazon(RemoteViews remoteViews, C4372l c4372l, int i, InterfaceC12001l interfaceC12001l) {
        Integer numValueOf;
        int iIntValue;
        int i2 = c4372l.purchase;
        Context context = c4372l.yandex;
        C8079l c8079l = (C8079l) interfaceC12001l.purchase(null, C15460l.f30254l);
        AbstractC11876l abstractC11876l = C10365l.yandex;
        AbstractC11876l abstractC11876l2 = c8079l != null ? c8079l.yandex : abstractC11876l;
        C4538l c4538l = (C4538l) interfaceC12001l.purchase(null, C15460l.f30245l);
        if (c4538l != null) {
            abstractC11876l = c4538l.yandex;
        }
        if (interfaceC12001l.mopub(new C2613l(17))) {
            numValueOf = null;
        } else {
            if (c4372l.subs.getAndSet(true)) {
                C8339l.smaato("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int iIncrementAndGet = c4372l.mopub.incrementAndGet();
                if (iIncrementAndGet >= AbstractC4468l.isPro) {
                    C8339l.smaato("There are too many views");
                    return null;
                }
                iIntValue = iIncrementAndGet + AbstractC4468l.subs;
            }
            RemoteViews remoteViewsApplovin = AbstractC12148l.applovin(i, iIntValue, context.getPackageName());
            int i4 = c4372l.admob.yandex;
            if (i3 >= 31) {
                AbstractC12148l.yandex(remoteViews, i4, remoteViewsApplovin, i2);
            } else {
                remoteViews.addView(i4, remoteViewsApplovin);
            }
            return new C5697l(iIntValue, 0, null, 6);
        }
        if (i3 >= 31) {
            C1617l c1617l = C1617l.yandex;
            return new C5697l(AbstractC10547l.crashlytics(remoteViews, c4372l, billing(remoteViews, c4372l, i2, abstractC11876l2.equals(c1617l) ? 3 : 1, abstractC11876l.equals(c1617l) ? 3 : 1), i, numValueOf), 0, null, 6);
        }
        int iAdmob = admob(purchase(abstractC11876l2, context));
        int iAdmob2 = admob(purchase(abstractC11876l, context));
        int iBilling = billing(remoteViews, c4372l, i2, iAdmob, iAdmob2);
        if (iAdmob != 2 && iAdmob2 != 2) {
            return new C5697l(AbstractC10547l.crashlytics(remoteViews, c4372l, iBilling, i, numValueOf), 0, null, 6);
        }
        C8471l c8471l = (C8471l) AbstractC4468l.purchase.get(new C18738l(iAdmob, iAdmob2));
        if (c8471l != null) {
            return new C5697l(AbstractC10547l.crashlytics(remoteViews, c4372l, R.id.glanceViewStub, i, numValueOf), AbstractC10547l.crashlytics(remoteViews, c4372l, iBilling, c8471l.yandex, null), null, 4);
        }
        C8936l.remoteconfig("Could not find complex layout for width=", AbstractC1757l.m1039switch(iAdmob), ", height=", AbstractC1757l.m1039switch(iAdmob2));
        return null;
    }

    public static final int billing(RemoteViews remoteViews, C4372l c4372l, int i, int i2, int i3) {
        C18738l c18738l = new C18738l(i2 == 2 ? 1 : i2, i3 != 2 ? i3 : 1);
        Map map = (Map) c4372l.admob.crashlytics.get(Integer.valueOf(i));
        if (map == null) {
            C8339l.smaato(AbstractC0653l.vip(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(c18738l);
        if (num == null) {
            StringBuilder sbSignature = AbstractC2812l.Signature("No child for position ", i, " and size ");
            sbSignature.append(AbstractC1757l.m1039switch(i2));
            sbSignature.append(" x ");
            C10754l.tapsense(sbSignature, AbstractC1757l.m1039switch(i3));
            return 0;
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC10547l.crashlytics(remoteViews, c4372l, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    public static final C5697l crashlytics(RemoteViews remoteViews, C4372l c4372l, EnumC18024l enumC18024l, InterfaceC12001l interfaceC12001l) {
        Integer numMopub = mopub(enumC18024l, interfaceC12001l);
        if (numMopub != null || (numMopub = (Integer) yandex.get(enumC18024l)) != null) {
            return amazon(remoteViews, c4372l, numMopub.intValue(), interfaceC12001l);
        }
        C1759l.ads(enumC18024l, "Cannot use `insertView` with a container like ");
        return null;
    }

    public static final C5697l loadAd(RemoteViews remoteViews, C4372l c4372l, EnumC18024l enumC18024l, int i, InterfaceC12001l interfaceC12001l, C12347l c12347l, C15667l c15667l) {
        int iIntValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + enumC18024l + " container from " + i + " to 10 elements", new IllegalArgumentException(enumC18024l + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer numMopub = mopub(enumC18024l, interfaceC12001l);
        if (numMopub != null) {
            iIntValue = numMopub.intValue();
        } else {
            C13719l c13719l = (C13719l) AbstractC4468l.yandex.get(new C13848l(enumC18024l, i2, c12347l, c15667l));
            Integer numValueOf = c13719l != null ? Integer.valueOf(c13719l.yandex) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + enumC18024l + " with " + i + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) AbstractC4468l.loadAd.get(enumC18024l);
        if (map == null) {
            C1759l.ads(enumC18024l, "Cannot find generated children for ");
            return null;
        }
        C5697l c5697lAmazon = amazon(remoteViews, c4372l, iIntValue, interfaceC12001l);
        int i3 = c5697lAmazon.yandex;
        C5697l c5697l = new C5697l(i3, c5697lAmazon.loadAd, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return c5697l;
    }

    public static final Integer mopub(EnumC18024l enumC18024l, InterfaceC12001l interfaceC12001l) {
        if (Build.VERSION.SDK_INT >= 33) {
            C14732l c14732l = (C14732l) interfaceC12001l.purchase(null, C15460l.f30237l);
            C8079l c8079l = (C8079l) interfaceC12001l.purchase(null, C15460l.f30241l);
            C1617l c1617l = C1617l.yandex;
            boolean zEquals = c8079l != null ? c8079l.yandex.equals(c1617l) : false;
            C4538l c4538l = (C4538l) interfaceC12001l.purchase(null, C15460l.f30256l);
            boolean zEquals2 = c4538l != null ? c4538l.yandex.equals(c1617l) : false;
            if (c14732l != null) {
                C9224l c9224l = c14732l.yandex;
                C8471l c8471l = (C8471l) AbstractC4468l.crashlytics.get(new C2420l(enumC18024l, c9224l.yandex, c9224l.loadAd));
                if (c8471l != null) {
                    return Integer.valueOf(c8471l.yandex);
                }
                C1759l.smaato("Cannot find ", enumC18024l, " with alignment ", c9224l);
                return null;
            }
            if (zEquals || zEquals2) {
                C8471l c8471l2 = (C8471l) AbstractC4468l.amazon.get(new C14820l(enumC18024l, zEquals, zEquals2));
                if (c8471l2 != null) {
                    return Integer.valueOf(c8471l2.yandex);
                }
                C10754l.startapp(enumC18024l, " with defaultWeight set", "Cannot find ");
                return null;
            }
        }
        return null;
    }

    public static final AbstractC11876l purchase(AbstractC11876l abstractC11876l, Context context) {
        if (!(abstractC11876l instanceof C3287l)) {
            return abstractC11876l;
        }
        float dimension = context.getResources().getDimension(((C3287l) abstractC11876l).yandex);
        int i = (int) dimension;
        if (i != -2) {
            return i != -1 ? new C9402l(dimension / context.getResources().getDisplayMetrics().density) : C16589l.yandex;
        }
        return C10365l.yandex;
    }

    public static final C8683l yandex(C4372l c4372l, InterfaceC12001l interfaceC12001l, int i) {
        Integer numValueOf = Integer.valueOf(R.id.rootStubId);
        Context context = c4372l.yandex;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            int i3 = AbstractC4468l.admob;
            if (i >= i3) {
                C10754l.metrica(AbstractC12589l.premium(i3, i, "Index of the root view cannot be more than ", ", currently "));
                return null;
            }
            C18738l c18738l = new C18738l(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC4468l.mopub + i);
            C8079l c8079l = (C8079l) interfaceC12001l.purchase(null, C15460l.f30250l);
            if (c8079l != null) {
                AbstractC7236l.crashlytics(context, remoteViews, c8079l, R.id.rootView);
            }
            C4538l c4538l = (C4538l) interfaceC12001l.purchase(null, C15460l.f30231l);
            if (c4538l != null) {
                AbstractC7236l.loadAd(context, remoteViews, c4538l, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            return new C8683l(remoteViews, new C5697l(R.id.rootView, 0, i2 >= 33 ? C14054l.f27396l : Collections.singletonMap(0, Collections.singletonMap(c18738l, numValueOf)), 2));
        }
        int i4 = loadAd * i;
        int i5 = AbstractC4468l.admob;
        if (i4 >= i5) {
            C11467l.subs(i5 / 4, i, ", currently ", "Index of the root view cannot be more than ");
            return null;
        }
        C8079l c8079l2 = (C8079l) interfaceC12001l.purchase(null, C15460l.f30244l);
        AbstractC11876l abstractC11876lPurchase = C10365l.yandex;
        AbstractC11876l abstractC11876lPurchase2 = c8079l2 != null ? purchase(c8079l2.yandex, context) : abstractC11876lPurchase;
        C4538l c4538l2 = (C4538l) interfaceC12001l.purchase(null, C15460l.f30253l);
        if (c4538l2 != null) {
            abstractC11876lPurchase = purchase(c4538l2.yandex, context);
        }
        C16589l c16589l = C16589l.yandex;
        int i6 = abstractC11876lPurchase2.equals(c16589l) ? 4 : 1;
        int i7 = abstractC11876lPurchase.equals(c16589l) ? 4 : 1;
        C18738l c18738l2 = new C18738l(i6 == 2 ? 1 : i6, i7 != 2 ? i7 : 1);
        Integer num = (Integer) AbstractC4468l.billing.get(c18738l2);
        if (num != null) {
            return new C8683l(new RemoteViews(context.getPackageName(), i4 + AbstractC4468l.mopub + num.intValue()), new C5697l(0, 0, Collections.singletonMap(0, Collections.singletonMap(c18738l2, numValueOf)), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + AbstractC1757l.m1039switch(i6) + ", " + AbstractC1757l.m1039switch(i7) + ']');
    }
}
