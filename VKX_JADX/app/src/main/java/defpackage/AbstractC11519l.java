package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.isPro;
import androidx.recyclerview.widget.subs;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxreborn.ui.ThemedRecyclerView;

/* JADX INFO: renamed from: lُُۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11519l extends AbstractC2484l implements InterfaceC9909l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public ThemedRecyclerView f23157l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public FrameLayout f23158l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public ProgressBar f23159l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f23163l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public subs f23165l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f23167l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public float f23168l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f23171l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public ComposeView f23172l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final ArrayList f23170l = new ArrayList();

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f23161l = 40;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f23164l = true;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f23160l = true;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f23162l = AbstractC8020l.smaato(C18058l.yandex);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public Function0 f23166l = new C7480l(this, 0);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10086l f23169l = AbstractC8020l.smaato(Boolean.TRUE);

    /* JADX INFO: renamed from: abstract */
    public abstract void mo1337abstract(int i);

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public AbstractC14412l mo647case() {
        return new C3497l(this, false, false, 126);
    }

    @Override // defpackage.AbstractC15988l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void mo3092else(View view) {
        subs subsVar = this.f23165l;
        InterfaceC14029l interfaceC14029l = null;
        if (subsVar == null) {
            subsVar = null;
        }
        int i = 0;
        if (subsVar instanceof C14451l) {
            C0857l c0857l = new C0857l(this, interfaceC14029l, i);
            C8490l c8490l = AbstractC6025l.yandex;
            C8084l c8084l = AbstractC6025l.loadAd;
            int i2 = 24;
            int i3 = 2;
            C2347l c2347l = new C2347l(new C10424l(c8084l, 23), new C15559l(c0857l, interfaceC14029l, i2), i3);
            C5268l c5268l = this.f34614l;
            EnumC8981l enumC8981l = EnumC8981l.f18524l;
            AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
            AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, i2), new C15559l(new C0857l(this, interfaceC14029l, 1), interfaceC14029l, 26), i3), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        }
        if (this.f23171l) {
            return;
        }
        if (this.f23163l) {
            m3093instanceof();
        } else {
            mo1337abstract(0);
        }
    }

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC15988l
    /* JADX INFO: renamed from: extends */
    public final void mo1144extends(int i) {
        ThemedRecyclerView themedRecyclerView = this.f23157l;
        if (themedRecyclerView != null) {
            themedRecyclerView.setPadding(0, 0, 0, i);
        }
    }

    /* JADX INFO: renamed from: finally */
    public void mo2421finally() {
        ThemedRecyclerView themedRecyclerView = this.f23157l;
        if (themedRecyclerView == null) {
            themedRecyclerView = null;
        }
        isPro layoutManager = themedRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && !this.f23171l && linearLayoutManager.m75l() >= this.f23170l.size() - 1 && this.f23160l) {
            int iMo853goto = mo853goto() + this.f23167l;
            this.f23167l = iMo853goto;
            mo1337abstract(iMo853goto);
        }
    }

    /* JADX INFO: renamed from: goto */
    public int mo853goto() {
        return this.f23161l;
    }

    /* JADX INFO: renamed from: import */
    public void mo2721import(Throwable th) {
        th.printStackTrace();
        this.f23162l.setValue(C6168l.metrica(th));
        this.f23166l = new C7480l(this, 1);
        FrameLayout frameLayout = this.f23158l;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
        ComposeView composeView = this.f23172l;
        if (composeView == null) {
            composeView = null;
        }
        composeView.setVisibility(0);
        View view = this.f5280l;
        ((C12656l) (view != null ? view : null)).setRefreshing(false);
        this.f23163l = true;
        this.f23171l = false;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m3093instanceof() {
        subs subsVar = this.f23165l;
        if (subsVar == null) {
            subsVar = null;
        }
        subsVar.isPro();
        View view = this.f5280l;
        if (view == null) {
            view = null;
        }
        ((C12656l) view).setRefreshing(false);
        FrameLayout frameLayout = this.f23158l;
        (frameLayout != null ? frameLayout : null).setVisibility(8);
    }

    /* JADX INFO: renamed from: new */
    public abstract subs mo1270new();

    @Override // defpackage.InterfaceC9909l
    public final void pro() {
        try {
            ThemedRecyclerView themedRecyclerView = this.f23157l;
            if (themedRecyclerView == null) {
                themedRecyclerView = null;
            }
            themedRecyclerView.smoothScrollToPosition(0);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m3094public() {
        View view = this.f5280l;
        if (view == null) {
            view = null;
        }
        ((C12656l) view).setRefreshing(false);
        FrameLayout frameLayout = this.f23158l;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(8);
        ComposeView composeView = this.f23172l;
        (composeView != null ? composeView : null).setVisibility(8);
    }

    @Override // defpackage.AbstractC2484l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: strictfp */
    public final void mo1148strictfp() {
        super.mo1148strictfp();
        FrameLayout frameLayout = this.f23158l;
        if (frameLayout != null) {
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.setBackgroundColor(AbstractC13209l.yandex(R.attr.windowBackground));
        }
    }

    /* JADX INFO: renamed from: super */
    public abstract void mo1271super();

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: switch */
    public final View mo1149switch(Context context, LayoutInflater layoutInflater) {
        View view;
        C12656l c12656l = new C12656l((Activity) context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ThemedRecyclerView themedRecyclerView = new ThemedRecyclerView(isVip(), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        this.f23165l = mo1270new();
        isVip();
        int i = 1;
        themedRecyclerView.setLayoutManager(new LinearLayoutManager(1));
        themedRecyclerView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        subs subsVar = this.f23165l;
        if (subsVar == null) {
            subsVar = null;
        }
        themedRecyclerView.setAdapter(subsVar);
        themedRecyclerView.setId(ua.itaysonlab.vkx.R.id.loader_recycler);
        themedRecyclerView.addOnScrollListener(new C12520l(i, this));
        int i2 = 0;
        themedRecyclerView.setClipToPadding(false);
        this.f23157l = themedRecyclerView;
        relativeLayout.addView(themedRecyclerView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23158l = frameLayout;
        frameLayout.setBackgroundColor(AbstractC13209l.yandex(R.attr.windowBackground));
        FrameLayout frameLayout2 = this.f23158l;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        frameLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        this.f23159l = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(AbstractC13209l.yandex(ua.itaysonlab.vkx.R.attr.global_accent)));
        ProgressBar progressBar2 = this.f23159l;
        if (progressBar2 == null) {
            progressBar2 = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar2.setLayoutParams(layoutParams);
        FrameLayout frameLayout3 = this.f23158l;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        ProgressBar progressBar3 = this.f23159l;
        if (progressBar3 == null) {
            progressBar3 = null;
        }
        frameLayout3.addView(progressBar3);
        View view2 = this.f23158l;
        relativeLayout.addView(view2 != null ? view2 : null);
        C5268l c5268l = this.f34614l;
        if (c5268l.subs == EnumC8981l.f18522l) {
            view = new View(relativeLayout.getContext());
        } else {
            ComposeView composeView = new ComposeView(relativeLayout.getContext(), null, 0, 6, null);
            composeView.setViewCompositionStrategy(new C7972l(29, c5268l));
            composeView.setContent(new C15578l(1163434782, true, new C16893l(this, i2)));
            this.f23172l = composeView;
            view = composeView;
        }
        relativeLayout.addView(view);
        c12656l.addView(relativeLayout);
        c12656l.setOnRefreshListener(new C6536l(10, this));
        if (!this.f23164l) {
            c12656l.setEnabled(false);
        }
        return c12656l;
    }

    public void tapsense() {
        mo782this();
    }

    /* JADX INFO: renamed from: this */
    public void mo782this() {
        if (this.f23171l) {
            return;
        }
        try {
            FrameLayout frameLayout = this.f23158l;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.setVisibility(0);
            ComposeView composeView = this.f23172l;
            if (composeView == null) {
                composeView = null;
            }
            composeView.setVisibility(8);
        } catch (Exception unused) {
        }
        this.f23167l = 0;
        this.f23160l = true;
        this.f23170l.clear();
        ThemedRecyclerView themedRecyclerView = this.f23157l;
        (themedRecyclerView != null ? themedRecyclerView : null).post(new RunnableC11297l(14, this));
        mo1271super();
        mo1337abstract(0);
    }
}
