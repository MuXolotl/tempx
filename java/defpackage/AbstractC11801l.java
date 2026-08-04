package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؙِْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11801l extends AbstractC2484l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Object f23626l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public Object f23627l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ int f23628l;

    public AbstractC11801l(int i) {
        this.f23628l = i;
        switch (i) {
            case 1:
                break;
            default:
                this.f23627l = new C15700l();
                this.f23626l = "";
                break;
        }
    }

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public void appmetrica() {
        Object c18435l;
        switch (this.f23628l) {
            case 0:
                super.appmetrica();
                try {
                    c18435l = this.f5280l;
                    if (c18435l == null) {
                        c18435l = null;
                    }
                    if (!(c18435l != null)) {
                        c18435l = null;
                    }
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                ComposeView composeView = (ComposeView) ((View) (c18435l instanceof C18435l ? null : c18435l));
                if (composeView != null) {
                    composeView.purchase();
                }
                break;
            default:
                super.appmetrica();
                Iterator it = mo649goto().iterator();
                while (it.hasNext()) {
                    ((AbstractC17777l) it.next()).appmetrica();
                }
                break;
        }
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public AbstractC14412l mo647case() {
        switch (this.f23628l) {
            case 0:
                return new C7511l();
            default:
                return new C3497l(this, false, false, 126);
        }
    }

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC15988l
    /* JADX INFO: renamed from: catch */
    public View mo1141catch(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f23628l) {
            case 0:
                this.f5279l = new C7511l();
                View viewMo1149switch = mo1149switch(viewGroup.getContext(), layoutInflater);
                this.f5280l = viewMo1149switch;
                viewMo1149switch.setBackgroundColor(AbstractC13209l.yandex(R.attr.windowBackground));
                View view = this.f5280l;
                if (view != null) {
                    return view;
                }
                return null;
            default:
                return super.mo1141catch(layoutInflater, viewGroup);
        }
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue */
    public String mo648continue() {
        return (String) this.f23626l;
    }

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC15988l
    /* JADX INFO: renamed from: extends */
    public void mo1144extends(int i) {
        switch (this.f23628l) {
            case 0:
                ((C15700l) this.f23627l).loadAd.subs(i);
                break;
            default:
                super.mo1144extends(i);
                break;
        }
    }

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC15988l
    /* JADX INFO: renamed from: for */
    public void mo1145for(int i) {
        switch (this.f23628l) {
            case 0:
                ((C15700l) this.f23627l).yandex.subs(i);
                break;
            default:
                super.mo1145for(i);
                break;
        }
    }

    /* JADX INFO: renamed from: goto */
    public abstract List mo649goto();

    @Override // defpackage.AbstractC17777l
    public void inmobi() {
        switch (this.f23628l) {
            case 1:
                super.inmobi();
                Iterator it = mo649goto().iterator();
                while (it.hasNext()) {
                    ((AbstractC17777l) it.next()).inmobi();
                }
                break;
            default:
                super.inmobi();
                break;
        }
    }

    /* JADX INFO: renamed from: new */
    public abstract void mo271new(C6956l c6956l, int i);

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: strictfp */
    public final void mo1148strictfp() {
        switch (this.f23628l) {
            case 0:
                super.mo1148strictfp();
                C15700l c15700l = (C15700l) this.f23627l;
                c15700l.amazon.setValue(Boolean.valueOf(AbstractC13209l.purchase.crashlytics));
                c15700l.crashlytics.setValue(AbstractC7252l.purchase(AbstractC13209l.purchase.crashlytics));
                break;
            default:
                super.mo1148strictfp();
                Iterator it = mo649goto().iterator();
                while (it.hasNext()) {
                    ((AbstractC2484l) it.next()).mo1148strictfp();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: super */
    public abstract List mo650super();

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: switch */
    public final View mo1149switch(Context context, LayoutInflater layoutInflater) {
        int i = 0;
        switch (this.f23628l) {
            case 0:
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setViewCompositionStrategy(new C7972l(29, this.f34614l));
                C15700l c15700l = (C15700l) this.f23627l;
                c15700l.amazon.setValue(Boolean.valueOf(AbstractC13209l.purchase.crashlytics));
                c15700l.crashlytics.setValue(AbstractC7252l.purchase(AbstractC13209l.purchase.crashlytics));
                composeView.setContent(new C15578l(-388723397, true, new C6484l(this, this, i)));
                return composeView;
            default:
                if (mo649goto().size() != mo650super().size()) {
                    C8339l.metrica("fragments.size != titles.size");
                    return null;
                }
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setFocusable(true);
                linearLayout.setClickable(true);
                Activity activity = (Activity) context;
                C1194l c1194l = new C1194l(activity);
                this.f23627l = c1194l;
                c1194l.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                C1194l c1194l2 = (C1194l) this.f23627l;
                if (c1194l2 == null) {
                    c1194l2 = null;
                }
                c1194l2.setId(ua.itaysonlab.vkx.R.id.tablayout);
                C1194l c1194l3 = (C1194l) this.f23627l;
                if (c1194l3 == null) {
                    c1194l3 = null;
                }
                c1194l3.setTabIndicatorFullWidth(false);
                c1194l3.setTabMode(0);
                c1194l3.setTabGravity(2);
                c1194l3.refreshTheme();
                C6831l c6831l = new C6831l(activity, null);
                c6831l.f14275l = true;
                this.f23626l = c6831l;
                c6831l.setId(ua.itaysonlab.vkx.R.id.viewpager);
                C6831l c6831l2 = (C6831l) this.f23626l;
                if (c6831l2 == null) {
                    c6831l2 = null;
                }
                c6831l2.setOffscreenPageLimit(mo649goto().size());
                C1194l c1194l4 = (C1194l) this.f23627l;
                if (c1194l4 == null) {
                    c1194l4 = null;
                }
                linearLayout.addView(c1194l4);
                C6831l c6831l3 = (C6831l) this.f23626l;
                if (c6831l3 == null) {
                    c6831l3 = null;
                }
                linearLayout.addView(c6831l3);
                if (mo649goto().size() == 1) {
                    C1194l c1194l5 = (C1194l) this.f23627l;
                    if (c1194l5 == null) {
                        c1194l5 = null;
                    }
                    c1194l5.setVisibility(8);
                }
                C12291l c12291l = new C12291l(this);
                C6831l c6831l4 = (C6831l) this.f23626l;
                if (c6831l4 == null) {
                    c6831l4 = null;
                }
                c6831l4.setAdapter(c12291l);
                C1194l c1194l6 = (C1194l) this.f23627l;
                if (c1194l6 == null) {
                    c1194l6 = null;
                }
                C6831l c6831l5 = (C6831l) this.f23626l;
                c1194l6.setupWithViewPager(c6831l5 != null ? c6831l5 : null);
                return linearLayout;
        }
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: synchronized */
    public void mo2208synchronized() {
        switch (this.f23628l) {
            case 1:
                super.mo2208synchronized();
                Iterator it = mo649goto().iterator();
                while (it.hasNext()) {
                    ((AbstractC17777l) it.next()).mo2208synchronized();
                }
                break;
            default:
                super.mo2208synchronized();
                break;
        }
    }
}
