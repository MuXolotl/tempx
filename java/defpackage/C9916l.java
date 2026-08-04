package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍۣۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9916l extends AbstractC5555l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final List f20188l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f20189l = AbstractC11990l.loadAd();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC9694l f20190l;

    public C9916l(AbstractC9694l abstractC9694l, List list) {
        this.f20190l = abstractC9694l;
        this.f20188l = list;
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        Object obj;
        Object next;
        List<Catalog2Button> list = this.f20188l;
        final int i2 = 0;
        final int i3 = 1;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Catalog2Button) next).yandex instanceof C9588l));
            if (next != null) {
                for (Object obj2 : list) {
                    if (((Catalog2Button) obj2).yandex instanceof C0146l) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj != null) {
                    final C1356l c1356l = (C1356l) interfaceC0589l;
                    for (final Catalog2Button catalog2Button : list) {
                        if (catalog2Button.yandex instanceof C9588l) {
                            for (final Catalog2Button catalog2Button2 : list) {
                                if (catalog2Button2.yandex instanceof C0146l) {
                                    c1356l.f3480l.setOnClickListener(new View.OnClickListener(this) { // from class: lٍؓؕ

                                        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                        public final /* synthetic */ C9916l f4133l;

                                        {
                                            this.f4133l = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i4 = i2;
                                            Catalog2Button catalog2Button3 = catalog2Button;
                                            C1356l c1356l2 = c1356l;
                                            C9916l c9916l = this.f4133l;
                                            switch (i4) {
                                                case 0:
                                                    Context context = c1356l2.f3481l.getContext();
                                                    AbstractC9694l abstractC9694l = c9916l.f20190l;
                                                    if (abstractC9694l != null) {
                                                        AbstractC10774l.ads(context, abstractC9694l, catalog2Button3);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Context context2 = c1356l2.f3481l.getContext();
                                                    AbstractC9694l abstractC9694l2 = c9916l.f20190l;
                                                    if (abstractC9694l2 != null) {
                                                        AbstractC10774l.ads(context2, abstractC9694l2, catalog2Button3);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    c1356l.f3479l.setOnClickListener(new View.OnClickListener(this) { // from class: lٍؓؕ

                                        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                                        public final /* synthetic */ C9916l f4133l;

                                        {
                                            this.f4133l = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i4 = i3;
                                            Catalog2Button catalog2Button3 = catalog2Button2;
                                            C1356l c1356l2 = c1356l;
                                            C9916l c9916l = this.f4133l;
                                            switch (i4) {
                                                case 0:
                                                    Context context = c1356l2.f3481l.getContext();
                                                    AbstractC9694l abstractC9694l = c9916l.f20190l;
                                                    if (abstractC9694l != null) {
                                                        AbstractC10774l.ads(context, abstractC9694l, catalog2Button3);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    Context context2 = c1356l2.f3481l.getContext();
                                                    AbstractC9694l abstractC9694l2 = c9916l.f20190l;
                                                    if (abstractC9694l2 != null) {
                                                        AbstractC10774l.ads(context2, abstractC9694l2, catalog2Button3);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            C1759l.firebase("Collection contains no element matching the predicate.");
                            return;
                        }
                    }
                    C1759l.firebase("Collection contains no element matching the predicate.");
                    return;
                }
            }
        }
        if (((Catalog2Button) list.get(0)).yandex instanceof C7125l) {
            C9122l c9122l = new C9122l();
            boolean zYandex = AbstractC8576l.yandex(((Catalog2Button) list.get(0)).smaato, Boolean.TRUE);
            c9122l.f18750l = zYandex;
            C11071l c11071l = (C11071l) interfaceC0589l;
            C17015l c17015l = new C17015l(i2, c11071l);
            c17015l.invoke(Boolean.valueOf(zYandex));
            c11071l.f22281l.setOnClickListener(new ViewOnClickListenerC0664l(c9122l, this, c17015l, 3));
            return;
        }
        if ((((Catalog2Button) list.get(0)).yandex instanceof C2173l) || (((Catalog2Button) list.get(0)).yandex instanceof Catalog2ButtonAction.OpenUrl)) {
            C2358l c2358l = (C2358l) interfaceC0589l;
            c2358l.f5121l.setText(((Catalog2Button) list.get(0)).isPro);
            c2358l.f5122l.setOnClickListener(new ViewOnClickListenerC9657l(4, this));
            return;
        }
        C10868l c10868l = (C10868l) interfaceC0589l;
        FrameLayout frameLayout = c10868l.f21970l;
        TextView textView = c10868l.f21972l;
        TextView textView2 = c10868l.f21973l;
        ImageView imageView = c10868l.f21969l;
        Catalog2Button catalog2Button3 = (Catalog2Button) list.get(0);
        Catalog2ButtonAction catalog2ButtonAction = catalog2Button3.yandex;
        if (catalog2ButtonAction instanceof C10329l) {
            textView.setText(R.string.playlist_create_title);
            AbstractC5833l.purchase(textView2);
            imageView.setImageResource(R.drawable.ic_list_add_outline_28);
            VKXApplication.Companion companion = VKXApplication.f36628l;
            int iYandex = VKXApplication.Companion.yandex(16.0f);
            imageView.setPadding(iYandex, iYandex, iYandex, iYandex);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int iYandex2 = VKXApplication.Companion.yandex(64.0f);
            layoutParams.height = iYandex2;
            layoutParams.width = iYandex2;
        } else if (catalog2ButtonAction instanceof C9588l) {
            textView.setText(R.string.mab_play);
            AbstractC5833l.purchase(textView2);
            imageView.setImageResource(R.drawable.player_play);
            VKXApplication.Companion companion2 = VKXApplication.f36628l;
            int iYandex3 = VKXApplication.Companion.yandex(10.0f);
            imageView.setPadding(iYandex3, iYandex3, iYandex3, iYandex3);
        } else if (catalog2ButtonAction instanceof C0146l) {
            textView.setText(R.string.shuffle);
            AbstractC5833l.purchase(textView2);
            imageView.setImageResource(R.drawable.ic_shuffle_outline_28);
            VKXApplication.Companion companion3 = VKXApplication.f36628l;
            int iYandex4 = VKXApplication.Companion.yandex(10.0f);
            imageView.setPadding(iYandex4, iYandex4, iYandex4, iYandex4);
        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
            textView.setText(((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).yandex);
            Catalog2ButtonAction.SynthCustomAction synthCustomAction = (Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction;
            textView2.setText(synthCustomAction.loadAd);
            String str = synthCustomAction.loadAd;
            if (str == null || str.length() == 0) {
                AbstractC5833l.purchase(textView2);
            } else {
                AbstractC5833l.subs(textView2);
            }
            imageView.setImageResource(synthCustomAction.crashlytics);
            VKXApplication.Companion companion4 = VKXApplication.f36628l;
            int iYandex5 = VKXApplication.Companion.yandex(10.0f);
            imageView.setPadding(iYandex5, iYandex5, iYandex5, iYandex5);
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            int iYandex6 = VKXApplication.Companion.yandex(48.0f);
            layoutParams2.height = iYandex6;
            layoutParams2.width = iYandex6;
        }
        c10868l.f21971l.setOnClickListener(new ViewOnClickListenerC0664l(catalog2Button3, this, c10868l));
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        Object obj;
        Object next;
        List list = this.f20188l;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Catalog2Button) next).yandex instanceof C9588l));
            if (next != null) {
                for (Object obj2 : list) {
                    if (((Catalog2Button) obj2).yandex instanceof C0146l) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj != null) {
                    return R.layout.v5_shuffler;
                }
            }
        }
        if (((Catalog2Button) list.get(0)).yandex instanceof C7125l) {
            return R.layout.c3_follow_owner;
        }
        return ((((Catalog2Button) list.get(0)).yandex instanceof C2173l) || (((Catalog2Button) list.get(0)).yandex instanceof Catalog2ButtonAction.OpenUrl)) ? R.layout.c3_button_mini : R.layout.c3_buttons_shuffle;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object next;
        Object next2;
        List list = this.f20188l;
        if (list.size() > 1) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Catalog2Button) next).yandex instanceof C9588l));
            if (next != null) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(((Catalog2Button) next2).yandex instanceof C0146l));
                if (next2 != null) {
                    View viewInflate = layoutInflater.inflate(R.layout.v5_shuffler, viewGroup, false);
                    int i = R.id.play_normal;
                    MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.play_normal);
                    if (materialButton != null) {
                        i = R.id.play_shuffle;
                        MaterialButton materialButton2 = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.play_shuffle);
                        if (materialButton2 != null) {
                            return new C1356l((LinearLayout) viewInflate, materialButton, materialButton2);
                        }
                    }
                    C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                    return null;
                }
            }
        }
        if (((Catalog2Button) list.get(0)).yandex instanceof C7125l) {
            View viewInflate2 = layoutInflater.inflate(R.layout.c3_follow_owner, viewGroup, false);
            if (viewInflate2 != null) {
                return new C11071l((MaterialButton) viewInflate2);
            }
            C6541l.subs("rootView");
            return null;
        }
        if ((((Catalog2Button) list.get(0)).yandex instanceof C2173l) || (((Catalog2Button) list.get(0)).yandex instanceof Catalog2ButtonAction.OpenUrl)) {
            View viewInflate3 = layoutInflater.inflate(R.layout.c3_button_mini, viewGroup, false);
            FrameLayout frameLayout = (FrameLayout) viewInflate3;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate3, R.id.text);
            if (textView != null) {
                return new C2358l(frameLayout, textView);
            }
            C6541l.subs("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(R.id.text)));
            return null;
        }
        View viewInflate4 = layoutInflater.inflate(R.layout.c3_buttons_shuffle, viewGroup, false);
        int i2 = R.id.card;
        FrameLayout frameLayout2 = (FrameLayout) AbstractC8576l.smaato(viewInflate4, R.id.card);
        if (frameLayout2 != null) {
            i2 = R.id.shuffle_btn;
            ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate4, R.id.shuffle_btn);
            if (imageView != null) {
                i2 = R.id.shuffle_desc;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate4, R.id.shuffle_desc);
                if (textView2 != null) {
                    i2 = R.id.shuffle_txt;
                    TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate4, R.id.shuffle_txt);
                    if (textView3 != null) {
                        return new C10868l((LinearLayout) viewInflate4, frameLayout2, imageView, textView2, textView3);
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f20189l.f36440l;
    }
}
