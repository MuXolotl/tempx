package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؑ۠ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0637l extends ViewGroup.MarginLayoutParams {
    public int admob;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public View firebase;
    public int isPro;
    public boolean loadAd;
    public boolean metrica;
    public final int mopub;
    public final int purchase;
    public boolean remoteconfig;
    public View smaato;
    public final Rect startapp;
    public int subs;
    public boolean vip;
    public AbstractC8012l yandex;

    public C0637l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadAd = false;
        this.crashlytics = 0;
        this.amazon = 0;
        this.purchase = -1;
        this.billing = -1;
        this.mopub = 0;
        this.admob = 0;
        this.startapp = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6217l.loadAd);
        this.crashlytics = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.billing = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.amazon = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.purchase = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.mopub = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.admob = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.loadAd = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f358l;
            AbstractC8012l abstractC8012l = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f358l;
                    if (!TextUtils.isEmpty(str2)) {
                        string = AbstractC11043l.admob('.', str2, string);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f356l;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f357l);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC8012l = (AbstractC8012l) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    C18073l.Signature("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.yandex = abstractC8012l;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC8012l abstractC8012l2 = this.yandex;
        if (abstractC8012l2 != null) {
            abstractC8012l2.crashlytics(this);
        }
    }

    public final void loadAd(AbstractC8012l abstractC8012l) {
        AbstractC8012l abstractC8012l2 = this.yandex;
        if (abstractC8012l2 != abstractC8012l) {
            if (abstractC8012l2 != null) {
                abstractC8012l2.billing();
            }
            this.yandex = abstractC8012l;
            this.loadAd = true;
            if (abstractC8012l != null) {
                abstractC8012l.crashlytics(this);
            }
        }
    }

    public final boolean yandex(int i) {
        if (i == 0) {
            return this.remoteconfig;
        }
        if (i != 1) {
            return false;
        }
        return this.vip;
    }

    public C0637l(int i) {
        super(i, -2);
        this.loadAd = false;
        this.crashlytics = 0;
        this.amazon = 0;
        this.purchase = -1;
        this.billing = -1;
        this.mopub = 0;
        this.admob = 0;
        this.startapp = new Rect();
    }

    public C0637l(C0637l c0637l) {
        super((ViewGroup.MarginLayoutParams) c0637l);
        this.loadAd = false;
        this.crashlytics = 0;
        this.amazon = 0;
        this.purchase = -1;
        this.billing = -1;
        this.mopub = 0;
        this.admob = 0;
        this.startapp = new Rect();
    }

    public C0637l(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.loadAd = false;
        this.crashlytics = 0;
        this.amazon = 0;
        this.purchase = -1;
        this.billing = -1;
        this.mopub = 0;
        this.admob = 0;
        this.startapp = new Rect();
    }

    public C0637l(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.loadAd = false;
        this.crashlytics = 0;
        this.amazon = 0;
        this.purchase = -1;
        this.billing = -1;
        this.mopub = 0;
        this.admob = 0;
        this.startapp = new Rect();
    }
}
