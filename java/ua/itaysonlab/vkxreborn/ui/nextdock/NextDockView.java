package ua.itaysonlab.vkxreborn.ui.nextdock;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.AbstractC13209l;
import defpackage.AbstractC1753l;
import defpackage.AbstractC8576l;
import defpackage.C10038l;
import defpackage.C12513l;
import defpackage.C12616l;
import defpackage.C1306l;
import defpackage.C17572l;
import defpackage.C6541l;
import defpackage.C8688l;
import defpackage.C9359l;
import defpackage.C9871l;
import defpackage.InterfaceC8959l;
import defpackage.RunnableC10505l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class NextDockView extends LinearLayout implements InterfaceC8959l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f36847l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f36848l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f36849l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8688l f36850l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Function2 f36851l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Function1 f36852l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f36853l;

    public NextDockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36850l = new C8688l(new C9871l(context, 4));
        this.f36849l = new ArrayList();
        this.f36848l = -1;
        this.f36852l = new C1306l(3);
        this.f36851l = new C12513l((byte) 0, 29);
    }

    private final LayoutInflater getLayoutInflater() {
        return (LayoutInflater) this.f36850l.getValue();
    }

    public final FrameLayout getCurrentFrameView() {
        int i = this.f36848l;
        if (i < 0) {
            i = 0;
        }
        return (FrameLayout) ((C9359l) this.f36849l.get(i)).loadAd.f20465l;
    }

    public final void loadAd(String str, boolean z, boolean z2) {
        Iterator it = this.f36849l.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC8576l.yandex(((C9359l) it.next()).yandex.yandex, str)) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            post(new RunnableC10505l(numValueOf.intValue(), this, z2, z));
        }
    }

    @Override // defpackage.InterfaceC8959l
    public final void refreshTheme() {
        for (C9359l c9359l : this.f36849l) {
            NextDockView nextDockView = c9359l.crashlytics;
            int iYandex = 0;
            boolean z = nextDockView.f36849l.indexOf(c9359l) == nextDockView.f36848l;
            int iYandex2 = AbstractC13209l.yandex(z ? R.attr.global_accent : R.attr.text_secondary);
            if (z) {
                iYandex = AbstractC13209l.yandex(R.attr.global_accent);
            }
            c9359l.yandex(iYandex2, iYandex);
        }
    }

    public final void setLegacyMode(boolean z) {
        this.f36853l = z;
        for (C9359l c9359l : this.f36849l) {
            NextDockView nextDockView = c9359l.crashlytics;
            if (nextDockView.f36848l == nextDockView.f36849l.indexOf(c9359l)) {
                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(nextDockView.f36853l ? AbstractC13209l.yandex(R.attr.global_accent) : 0, nextDockView.f36853l ? 0 : AbstractC13209l.yandex(R.attr.global_accent));
                valueAnimatorOfArgb.setDuration(350L);
                valueAnimatorOfArgb.addUpdateListener(new C12616l(c9359l, 2));
                valueAnimatorOfArgb.start();
            }
        }
    }

    public final void setOnItemClickListener(Function1<? super String, Boolean> function1) {
        this.f36852l = function1;
    }

    public final void setOnLongItemClickListener(Function2<? super String, ? super View, Unit> function2) {
        this.f36851l = function2;
    }

    public final void yandex(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17572l c17572l = (C17572l) it.next();
            ArrayList arrayList2 = this.f36849l;
            int size = arrayList2.size();
            View viewInflate = getLayoutInflater().inflate(R.layout.v6_nextdock_item, (ViewGroup) this, false);
            int i = R.id.additional_clickZone;
            View viewSmaato = AbstractC8576l.smaato(viewInflate, R.id.additional_clickZone);
            if (viewSmaato != null) {
                i = R.id.icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC8576l.smaato(viewInflate, R.id.icon);
                if (appCompatImageView != null) {
                    i = R.id.selected_frame;
                    FrameLayout frameLayout = (FrameLayout) AbstractC8576l.smaato(viewInflate, R.id.selected_frame);
                    if (frameLayout != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        C10038l c10038l = new C10038l(frameLayout2, viewSmaato, appCompatImageView, frameLayout, 29);
                        addView(frameLayout2, size);
                        Unit unit = Unit.INSTANCE;
                        arrayList2.add(size, new C9359l(this, c17572l, c10038l));
                        setWeightSum(arrayList2.size());
                    }
                }
            }
            C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return;
        }
    }

    public NextDockView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NextDockView(Context context, AttributeSet attributeSet, int i, AbstractC1753l abstractC1753l) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
