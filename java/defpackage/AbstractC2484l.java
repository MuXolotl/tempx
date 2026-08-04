package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Unit;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2484l extends AbstractC15988l implements InterfaceC17515l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f5278l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public AbstractC14412l f5279l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public View f5280l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f5281l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public View f5282l;

    public AbstractC2484l() {
        super(new Object[0]);
        this.f5281l = 800;
    }

    @Override // defpackage.AbstractC17777l
    public void appmetrica() {
        this.f34611l = null;
        C5268l c5268l = this.f34614l;
        if (c5268l.subs != EnumC8981l.f18522l) {
            c5268l.purchase(EnumC14812l.ON_STOP);
            c5268l.purchase(EnumC14812l.ON_DESTROY);
        }
        Activity activityIsVip = isVip();
        boolean z = activityIsVip != null && activityIsVip.isChangingConfigurations();
        C15018l c15018l = this.f34615l;
        if (c15018l != null && !z) {
            c15018l.yandex();
        }
        this.f34617l = null;
        this.f5282l = null;
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l != null) {
            (abstractC14412l != null ? abstractC14412l : null).getClass();
        }
    }

    /* JADX INFO: renamed from: case */
    public abstract AbstractC14412l mo647case();

    @Override // defpackage.AbstractC15988l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public View mo1141catch(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup frameLayout;
        AbstractC14412l abstractC14412l;
        AbstractC14412l abstractC14412l2;
        if (mo1142class()) {
            frameLayout = new FrameLayout(isVip());
        } else {
            LinearLayout linearLayout = new LinearLayout(isVip());
            linearLayout.setOrientation(1);
            frameLayout = linearLayout;
        }
        frameLayout.setBackgroundColor(AbstractC13209l.yandex(R.attr.windowBackground));
        this.f5279l = mo647case();
        View viewMo1149switch = mo1149switch(isVip(), layoutInflater);
        this.f5280l = viewMo1149switch;
        frameLayout.addView(viewMo1149switch);
        if (mo1142class()) {
            AbstractC14412l abstractC14412l3 = this.f5279l;
            if (abstractC14412l3 == null) {
                abstractC14412l2 = abstractC14412l3;
                abstractC14412l2 = null;
            }
            abstractC14412l2 = abstractC14412l3;
            View viewAmazon = abstractC14412l2.amazon(isVip(), frameLayout);
            if (viewAmazon != null) {
                if (viewAmazon instanceof AppBarLayout) {
                    AppBarLayout appBarLayout = (AppBarLayout) viewAmazon;
                    C0637l c0637l = new C0637l(-1);
                    c0637l.loadAd(new AppBarLayout.Behavior());
                    appBarLayout.setLayoutParams(c0637l);
                    appBarLayout.setElevation(0.0f);
                }
                mo852final();
                frameLayout.addView(viewAmazon);
            }
            Unit unit = Unit.INSTANCE;
            AbstractC14412l abstractC14412l4 = this.f5279l;
            ((InterfaceC9857l) (abstractC14412l4 != null ? abstractC14412l4 : null)).yandex(0.0f);
        }
        int i = this.f5278l;
        if (i > 0 && (abstractC14412l = this.f5279l) != null) {
            abstractC14412l.admob(i);
        }
        return frameLayout;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public boolean mo1142class() {
        return false;
    }

    /* JADX INFO: renamed from: continue */
    public abstract String mo648continue();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void mo1143default() {
        isVip().onBackPressed();
    }

    @Override // defpackage.AbstractC15988l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void mo1144extends(int i) {
        View view = this.f34611l;
        if (view != null) {
            view.setPadding(0, 0, 0, i);
        }
    }

    @Override // defpackage.AbstractC15988l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void mo1145for(int i) {
        this.f5278l = i;
        if (this.f5279l == null || i <= 0 || !mo1142class()) {
            return;
        }
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        abstractC14412l.admob(i);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final int m1146interface() {
        if (!m1147static()) {
            return -1;
        }
        Activity activityIsVip = isVip();
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Resources resources = vKXApplication.getResources();
        TypedValue typedValue = new TypedValue();
        activityIsVip.getTheme().resolveAttribute(ua.itaysonlab.vkx.R.attr.actionBarSize, typedValue, true);
        return resources.getDimensionPixelSize(typedValue.resourceId);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final boolean m1147static() {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        return ((abstractC14412l instanceof C7511l) || mo1142class()) ? false : true;
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void mo1148strictfp() {
        View view = this.f34611l;
        if (view != null) {
            view.setBackgroundColor(AbstractC13209l.yandex(R.attr.windowBackground));
        }
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l != null) {
            if (abstractC14412l == null) {
                abstractC14412l = null;
            }
            abstractC14412l.billing();
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public abstract View mo1149switch(Context context, LayoutInflater layoutInflater);

    /* JADX INFO: renamed from: final */
    public void mo852final() {
    }
}
