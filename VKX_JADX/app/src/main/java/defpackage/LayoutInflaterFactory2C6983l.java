package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C6983l implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f14652l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14653l;

    public /* synthetic */ LayoutInflaterFactory2C6983l(int i, Object obj) {
        this.f14653l = i;
        this.f14652l = obj;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C2872l c2872lMopub;
        int i = this.f14653l;
        Object obj = this.f14652l;
        switch (i) {
            case 0:
                C13734l c13734l = (C13734l) obj;
                if (C0025l.class.getName().equals(str)) {
                    return new C0025l(context, attributeSet, c13734l);
                }
                if ("fragment".equals(str)) {
                    String attributeValue = attributeSet.getAttributeValue(null, "class");
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4796l.yandex);
                    if (attributeValue == null) {
                        attributeValue = typedArrayObtainStyledAttributes.getString(0);
                    }
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
                    String string = typedArrayObtainStyledAttributes.getString(2);
                    typedArrayObtainStyledAttributes.recycle();
                    if (attributeValue != null) {
                        try {
                            zIsAssignableFrom = AbstractComponentCallbacksC4411l.class.isAssignableFrom(C13439l.loadAd(context.getClassLoader(), attributeValue));
                        } catch (ClassNotFoundException unused) {
                            zIsAssignableFrom = false;
                        }
                        if (zIsAssignableFrom) {
                            int id = view != null ? view.getId() : 0;
                            if (id == -1 && resourceId == -1 && string == null) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                            }
                            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lApplovin = resourceId != -1 ? c13734l.applovin(resourceId) : null;
                            if (abstractComponentCallbacksC4411lApplovin == null && string != null) {
                                C10038l c10038l = c13734l.crashlytics;
                                ArrayList arrayList = (ArrayList) c10038l.f20463l;
                                int size = arrayList.size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        Iterator it = ((HashMap) c10038l.f20462l).values().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C2872l c2872l = (C2872l) it.next();
                                                if (c2872l != null) {
                                                    AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c2872l.crashlytics;
                                                    if (string.equals(abstractComponentCallbacksC4411l.f8978l)) {
                                                        abstractComponentCallbacksC4411lApplovin = abstractComponentCallbacksC4411l;
                                                    }
                                                }
                                            } else {
                                                abstractComponentCallbacksC4411lApplovin = null;
                                            }
                                        }
                                    } else {
                                        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l2 = (AbstractComponentCallbacksC4411l) arrayList.get(size);
                                        if (abstractComponentCallbacksC4411l2 == null || !string.equals(abstractComponentCallbacksC4411l2.f8978l)) {
                                            size--;
                                        } else {
                                            abstractComponentCallbacksC4411lApplovin = abstractComponentCallbacksC4411l2;
                                        }
                                    }
                                }
                            }
                            if (abstractComponentCallbacksC4411lApplovin == null && id != -1) {
                                abstractComponentCallbacksC4411lApplovin = c13734l.applovin(id);
                            }
                            if (abstractComponentCallbacksC4411lApplovin == null) {
                                C13439l c13439lM3741package = c13734l.m3741package();
                                context.getClassLoader();
                                abstractComponentCallbacksC4411lApplovin = c13439lM3741package.yandex(attributeValue);
                                abstractComponentCallbacksC4411lApplovin.f8986l = true;
                                abstractComponentCallbacksC4411lApplovin.f8962l = resourceId != 0 ? resourceId : id;
                                abstractComponentCallbacksC4411lApplovin.f8970l = id;
                                abstractComponentCallbacksC4411lApplovin.f8978l = string;
                                abstractComponentCallbacksC4411lApplovin.f8973l = true;
                                abstractComponentCallbacksC4411lApplovin.f8955l = c13734l;
                                C6239l c6239l = c13734l.pro;
                                abstractComponentCallbacksC4411lApplovin.f8954l = c6239l;
                                AbstractActivityC16046l abstractActivityC16046l = c6239l.f13181l;
                                abstractComponentCallbacksC4411lApplovin.f8968l = true;
                                if ((c6239l == null ? null : c6239l.f13179l) != null) {
                                    abstractComponentCallbacksC4411lApplovin.f8968l = true;
                                }
                                c2872lMopub = c13734l.yandex(abstractComponentCallbacksC4411lApplovin);
                                if (C13734l.m3727volatile(2)) {
                                    Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC4411lApplovin + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                                }
                            } else {
                                if (abstractComponentCallbacksC4411lApplovin.f8973l) {
                                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                                }
                                abstractComponentCallbacksC4411lApplovin.f8973l = true;
                                abstractComponentCallbacksC4411lApplovin.f8955l = c13734l;
                                C6239l c6239l2 = c13734l.pro;
                                abstractComponentCallbacksC4411lApplovin.f8954l = c6239l2;
                                AbstractActivityC16046l abstractActivityC16046l2 = c6239l2.f13181l;
                                abstractComponentCallbacksC4411lApplovin.f8968l = true;
                                if ((c6239l2 == null ? null : c6239l2.f13179l) != null) {
                                    abstractComponentCallbacksC4411lApplovin.f8968l = true;
                                }
                                c2872lMopub = c13734l.mopub(abstractComponentCallbacksC4411lApplovin);
                                if (C13734l.m3727volatile(2)) {
                                    Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC4411lApplovin + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            C18086l c18086l = AbstractC7311l.yandex;
                            AbstractC7311l.loadAd(new C6611l(abstractComponentCallbacksC4411lApplovin, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC4411lApplovin + " to container " + viewGroup));
                            AbstractC7311l.yandex(abstractComponentCallbacksC4411lApplovin).getClass();
                            abstractComponentCallbacksC4411lApplovin.f8981l = viewGroup;
                            c2872lMopub.isPro();
                            c2872lMopub.subs();
                            C8339l.smaato(AbstractC15560l.Signature("Fragment ", attributeValue, " did not create a view."));
                        }
                    }
                    break;
                }
                return null;
            default:
                HashMap map = AbstractC12930l.subs;
                if (!map.containsKey(str)) {
                    return ((LayoutInflater.Factory2) obj).onCreateView(view, str, context, attributeSet);
                }
                try {
                    return (View) ((Constructor) map.get(str)).newInstance(context, attributeSet);
                } catch (Exception e) {
                    C11467l.metrica(e);
                    return null;
                }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        switch (this.f14653l) {
            case 0:
                return onCreateView(null, str, context, attributeSet);
            default:
                HashMap map = AbstractC12930l.subs;
                if (map.containsKey(str)) {
                    try {
                        return (View) ((Constructor) map.get(str)).newInstance(context, attributeSet);
                    } catch (Exception e) {
                        C11467l.metrica(e);
                        return null;
                    }
                }
                return ((LayoutInflater.Factory2) this.f14652l).onCreateView(str, context, attributeSet);
        }
    }
}
