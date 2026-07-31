package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.billing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّۢٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12930l {
    public static Resources loadAd;
    public static VKXApplication yandex;
    public static final SparseIntArray crashlytics = new SparseIntArray();
    public static final SparseArray amazon = new SparseArray();
    public static final ArrayList purchase = new ArrayList();
    public static final ArrayList billing = new ArrayList();
    public static final ArrayList mopub = new ArrayList();
    public static final ArrayList admob = new ArrayList();
    public static final HashMap subs = new HashMap();
    public static final ArrayList isPro = new ArrayList();

    public static void amazon(int i) {
        int next;
        int identifier;
        int next2;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = purchase;
        if (arrayList.contains(numValueOf)) {
            return;
        }
        boolean zContains = mopub.contains(Integer.valueOf(i));
        SparseArray sparseArray = amazon;
        if (zContains) {
            sparseArray.put(i, new SparseArray());
            arrayList.add(Integer.valueOf(i));
            return;
        }
        Iterator it = admob.iterator();
        while (it.hasNext()) {
            ((C0490l) it.next()).getClass();
            if (i == R.layout.preference_material) {
                SparseArray sparseArray2 = new SparseArray();
                C13750l c13750l = new C13750l();
                c13750l.yandex = android.R.id.title;
                c13750l.loadAd.add(new C3822l(android.R.attr.textColor, R.attr.text_primary));
                sparseArray2.put(android.R.id.title, c13750l);
                C13750l c13750l2 = new C13750l();
                c13750l2.yandex = android.R.id.summary;
                c13750l2.loadAd.add(new C3822l(android.R.attr.textColor, R.attr.text_secondary));
                sparseArray2.put(android.R.id.summary, c13750l2);
                sparseArray.put(i, sparseArray2);
                if (arrayList.contains(Integer.valueOf(i))) {
                    return;
                }
                arrayList.add(Integer.valueOf(i));
                return;
            }
        }
        try {
            XmlResourceParser layout = loadAd.getLayout(i);
            do {
                next = layout.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(layout.getPositionDescription() + ": No start tag found!");
            }
            SparseArray sparseArray3 = new SparseArray();
            int depth = layout.getDepth();
            do {
                String name = layout.getName();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                String attributeValue = null;
                int i2 = 0;
                if (name.equals("include")) {
                    int attributeResourceValue = attributeSetAsAttributeSet.getAttributeResourceValue(null, "layout", 0);
                    if (attributeResourceValue != 0 && !arrayList.contains(Integer.valueOf(attributeResourceValue))) {
                        amazon(attributeResourceValue);
                    }
                    if (attributeResourceValue != 0) {
                        SparseArray sparseArray4 = (SparseArray) sparseArray.get(attributeResourceValue);
                        while (i2 < sparseArray4.size()) {
                            sparseArray3.put(sparseArray4.keyAt(i2), (C13750l) sparseArray4.valueAt(i2));
                            i2++;
                        }
                    }
                } else {
                    for (int i3 = 0; i3 < attributeSetAsAttributeSet.getAttributeCount(); i3++) {
                        if (attributeSetAsAttributeSet.getAttributeName(i3).equals("id")) {
                            attributeValue = attributeSetAsAttributeSet.getAttributeValue(i3);
                            break;
                        }
                    }
                    int i4 = attributeValue == null ? -1 : Integer.parseInt(attributeValue.substring(1));
                    if (i4 != -1) {
                        C13750l c13750l3 = new C13750l();
                        c13750l3.yandex = i4;
                        while (i2 < attributeSetAsAttributeSet.getAttributeCount()) {
                            int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i2);
                            String attributeValue2 = attributeSetAsAttributeSet.getAttributeValue(i2);
                            if (attributeValue2.startsWith("?")) {
                                try {
                                    identifier = Integer.parseInt(attributeValue2.substring(1));
                                } catch (NumberFormatException unused) {
                                    int i5 = 9;
                                    boolean zEquals = attributeValue2.substring(1, Math.min(attributeValue2.length(), 9)).equals("android:");
                                    Resources resources = loadAd;
                                    if (!zEquals) {
                                        i5 = 1;
                                    }
                                    identifier = resources.getIdentifier(attributeValue2.substring(i5), "attr", zEquals ? "android" : yandex.getPackageName());
                                }
                                try {
                                    AbstractC13209l.yandex(identifier);
                                    c13750l3.loadAd.add(new C3822l(attributeNameResource, identifier));
                                } catch (Exception unused2) {
                                }
                            }
                            i2++;
                        }
                        sparseArray3.put(c13750l3.yandex, c13750l3);
                    }
                }
                next2 = layout.next();
                if (next2 == 3 && layout.getDepth() <= depth) {
                    break;
                }
            } while (next2 != 1);
            if (!arrayList.contains(Integer.valueOf(i))) {
                arrayList.add(Integer.valueOf(i));
            }
            sparseArray.put(i, sparseArray3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void crashlytics(View view, SparseArray sparseArray) {
        C13750l c13750l;
        int id = view.getId();
        if (id != -1 && !billing.contains(Integer.valueOf(id)) && sparseArray != null && (c13750l = (C13750l) sparseArray.get(id)) != null) {
            ArrayList arrayList = c13750l.loadAd;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((C3822l) it.next()).yandex));
            }
            Iterator it2 = isPro.iterator();
            if (it2.hasNext()) {
                throw AbstractC15560l.adcel(it2);
            }
            view.setTag(R.id.theme_tag, c13750l);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                crashlytics(viewGroup.getChildAt(i), sparseArray);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void loadAd(View view) {
        int id = view.getId();
        if (id == -1 || !billing.contains(Integer.valueOf(id))) {
            Object tag = view.getTag(R.id.theme_tag);
            if (tag instanceof C13750l) {
                for (C3822l c3822l : ((C13750l) tag).loadAd) {
                    int i = c3822l.yandex;
                    if (((C1740l) InterfaceC6697l.loadAd.get(i << (c3822l.loadAd + 32))) != null) {
                        view.setBackground(new RippleDrawable(ColorStateList.valueOf(AbstractC13209l.yandex(android.R.attr.colorControlHighlight)), null, null));
                    } else {
                        List list = (List) InterfaceC6697l.yandex.get(i);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC6697l) it.next()).yandex(view, AbstractC13209l.yandex(c3822l.loadAd));
                            }
                        }
                    }
                }
            }
            if (view instanceof InterfaceC8959l) {
                ((InterfaceC8959l) view).refreshTheme();
            }
            if (view instanceof RecyclerView) {
                billing.yandex((RecyclerView) view);
            }
            if (view instanceof C9967l) {
                C9967l c9967l = (C9967l) view;
                Iterator<View> it2 = c9967l.getDestroyedViews().iterator();
                while (it2.hasNext()) {
                    loadAd(it2.next());
                }
                Iterator<AbstractC17777l> it3 = c9967l.getFragmentStack().iterator();
                while (it3.hasNext()) {
                    it3.next().mo1148strictfp();
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    loadAd(viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public static void yandex(Class cls, Class cls2) {
        try {
            subs.put(cls.getName(), cls2.getConstructor(Context.class, AttributeSet.class));
        } catch (NoSuchMethodException e) {
            C11467l.metrica(e);
        }
    }
}
