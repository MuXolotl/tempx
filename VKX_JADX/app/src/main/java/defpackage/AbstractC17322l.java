package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: lؙٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17322l extends View {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Context f33626l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public HashMap f33627l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f33628l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int[] f33629l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f33630l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C0051l f33631l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f33632l;

    public final int amazon(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f33626l.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final void crashlytics(String str) {
        if (str.length() == 0 || this.f33626l == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C8950l) && strTrim.equals(((C8950l) layoutParams).f18439final)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    loadAd(childAt.getId());
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f33629l, this.f33628l);
    }

    public final void loadAd(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f33628l + 1;
        int[] iArr = this.f33629l;
        if (i2 > iArr.length) {
            this.f33629l = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f33629l;
        int i3 = this.f33628l;
        iArr2[i3] = i;
        this.f33628l = i3 + 1;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f33630l;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f33632l;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void purchase() {
        if (this.f33631l == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C8950l) {
            ((C8950l) layoutParams).f18453return = this.f33631l;
        }
    }

    public void setIds(String str) {
        this.f33630l = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f33628l = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                yandex(str.substring(i));
                return;
            } else {
                yandex(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f33632l = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f33628l = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                crashlytics(str.substring(i));
                return;
            } else {
                crashlytics(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f33630l = null;
        this.f33628l = 0;
        for (int i : iArr) {
            loadAd(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f33630l == null) {
            loadAd(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    public final void yandex(String str) {
        int identifier;
        HashMap map;
        Context context = this.f33626l;
        if (str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (AbstractC2812l.advert(strTrim) && (map = constraintLayout.f341l) != null && map.containsKey(strTrim)) ? constraintLayout.f341l.get(strTrim) : null;
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = amazon(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC15049l.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f33627l.put(Integer.valueOf(identifier), strTrim);
            loadAd(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
