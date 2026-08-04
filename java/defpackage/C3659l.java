package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.IOException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕؕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3659l extends AbstractC14412l {
    public final String amazon;
    public AppBarLayout billing;
    public final long crashlytics;
    public final String purchase;

    public C3659l(long j, String str, String str2) {
        this.crashlytics = j;
        this.amazon = str;
        this.purchase = str2;
    }

    @Override // defpackage.AbstractC14412l
    public final void admob(int i) {
        AppBarLayout appBarLayout = this.billing;
        if (appBarLayout == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appBarLayout.getLayoutParams();
        marginLayoutParams.topMargin = i;
        AppBarLayout appBarLayout2 = this.billing;
        if (appBarLayout2 == null) {
            appBarLayout2 = null;
        }
        appBarLayout2.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.AbstractC14412l
    public final View amazon(Context context, ViewGroup viewGroup) throws IOException {
        final int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.vkxui_toolbar_user, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) viewInflate;
        int i2 = R.id.avatar;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.avatar);
        if (imageView != null) {
            i2 = R.id.massaction;
            ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.massaction);
            if (imageView2 != null) {
                i2 = R.id.profile;
                TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.profile);
                if (textView != null) {
                    i2 = R.id.profile_subtitle;
                    TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.profile_subtitle);
                    if (textView2 != null) {
                        i2 = R.id.search;
                        ImageView imageView3 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.search);
                        if (imageView3 != null) {
                            i2 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) AbstractC8576l.smaato(viewInflate, R.id.toolbar);
                            if (materialToolbar != null) {
                                C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
                                C9477l c9477l = new C9477l(imageView.getContext());
                                c9477l.crashlytics = this.amazon;
                                AbstractC10413l.amazon(c9477l, imageView);
                                final int i3 = 1;
                                AbstractC12872l.crashlytics(c9477l, new C2192l());
                                c13177lYandex.yandex(c9477l.yandex());
                                textView.setText(this.purchase);
                                materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC18105l(context, 0));
                                AbstractC5833l.purchase(textView2);
                                imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: lُ۠ؐ

                                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                    public final /* synthetic */ C3659l f22948l;

                                    {
                                        this.f22948l = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i;
                                        C3659l c3659l = this.f22948l;
                                        switch (i4) {
                                            case 0:
                                                AbstractC1213l.crashlytics(view, new C4817l(c3659l.crashlytics));
                                                break;
                                            default:
                                                new C10038l(view, new C0464l(c3659l, view, 11)).m2854l();
                                                break;
                                        }
                                    }
                                });
                                imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: lُ۠ؐ

                                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                    public final /* synthetic */ C3659l f22948l;

                                    {
                                        this.f22948l = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i3;
                                        C3659l c3659l = this.f22948l;
                                        switch (i4) {
                                            case 0:
                                                AbstractC1213l.crashlytics(view, new C4817l(c3659l.crashlytics));
                                                break;
                                            default:
                                                new C10038l(view, new C0464l(c3659l, view, 11)).m2854l();
                                                break;
                                        }
                                    }
                                });
                                this.billing = appBarLayout;
                                C12448l c12448l = new C12448l();
                                c12448l.yandex = 0;
                                appBarLayout.setLayoutParams(c12448l);
                                AppBarLayout appBarLayout2 = this.billing;
                                if (appBarLayout2 == null) {
                                    return null;
                                }
                                return appBarLayout2;
                            }
                        }
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.AbstractC14412l
    public final View purchase() {
        AppBarLayout appBarLayout = this.billing;
        if (appBarLayout == null) {
            return null;
        }
        return appBarLayout;
    }

    @Override // defpackage.AbstractC14412l
    public final void mopub(String str) {
    }
}
