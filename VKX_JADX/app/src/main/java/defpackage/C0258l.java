package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.io.IOException;
import java.text.DecimalFormat;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0258l extends AbstractC14630l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C18662l f1252l = AbstractC11990l.loadAd();

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.podcast_slider_item;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) throws IOException {
        final PodcastCatalogSliderItem podcastCatalogSliderItem = (PodcastCatalogSliderItem) obj;
        C4014l c4014l = (C4014l) interfaceC0589l;
        ImageView imageView = c4014l.f8240l;
        MaterialButton materialButton = c4014l.f8238l;
        MaterialCardView materialCardView = c4014l.f8239l;
        TextView textView = c4014l.f8237l;
        TextView textView2 = c4014l.f8241l;
        final int i2 = 1;
        if (!(podcastCatalogSliderItem instanceof PodcastCatalogSliderItem.EpisodeItem)) {
            if (!(podcastCatalogSliderItem instanceof PodcastCatalogSliderItem.RandomButtonItem)) {
                C18725l.billing();
                return;
            }
            materialCardView.setOnClickListener(null);
            materialButton.setOnClickListener(new ViewOnClickListenerC9657l(7, this));
            int iCrashlytics = AbstractC14093l.crashlytics(AbstractC13209l.yandex(R.attr.global_accent), 0.2f, -16777216);
            Integer numValueOf = Integer.valueOf(R.drawable.placeholder_shuffle);
            C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
            C9477l c9477l = new C9477l(imageView.getContext());
            c9477l.crashlytics = numValueOf;
            AbstractC10413l.amazon(c9477l, imageView);
            c13177lYandex.yandex(c9477l.yandex());
            materialCardView.setCardBackgroundColor(iCrashlytics);
            textView2.setText("Вам повезет!");
            textView.setText("Попробуйте послушать случайный эпизод");
            textView2.setMaxLines(1);
            textView.setMaxLines(2);
            int i3 = AbstractC14093l.purchase(iCrashlytics) <= 0.75d ? -1 : -16777216;
            textView2.setTextColor(i3);
            textView.setTextColor(AbstractC14093l.subs(i3, 178));
            return;
        }
        final int i4 = 0;
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: lٍۗؐ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                PodcastCatalogSliderItem podcastCatalogSliderItem2 = podcastCatalogSliderItem;
                switch (i5) {
                    case 0:
                        AudioTrack audioTrack = ((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem2).loadAd;
                        AbstractC1213l.crashlytics(view, new C6038l(audioTrack.loadAd, audioTrack.crashlytics));
                        break;
                    default:
                        AbstractC9092l.amazon(view.getContext(), new C7839l(((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem2).loadAd));
                        break;
                }
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: lٍۗؐ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                PodcastCatalogSliderItem podcastCatalogSliderItem2 = podcastCatalogSliderItem;
                switch (i5) {
                    case 0:
                        AudioTrack audioTrack = ((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem2).loadAd;
                        AbstractC1213l.crashlytics(view, new C6038l(audioTrack.loadAd, audioTrack.crashlytics));
                        break;
                    default:
                        AbstractC9092l.amazon(view.getContext(), new C7839l(((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem2).loadAd));
                        break;
                }
            }
        });
        AudioTrack audioTrack = ((PodcastCatalogSliderItem.EpisodeItem) podcastCatalogSliderItem).loadAd;
        String strYandex = AbstractC16676l.yandex(audioTrack);
        C13177l c13177lYandex2 = AbstractC2952l.yandex(imageView.getContext());
        C9477l c9477l2 = new C9477l(imageView.getContext());
        c9477l2.crashlytics = strYandex;
        AbstractC10413l.amazon(c9477l2, imageView);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        AbstractC12872l.crashlytics(c9477l2, new C1061l(VKXApplication.Companion.yandex(8.0f)));
        c13177lYandex2.yandex(c9477l2.yandex());
        materialCardView.setCardBackgroundColor(AbstractC13209l.yandex(R.attr.bg_primary));
        textView2.setText(audioTrack.amazon);
        Context context = materialCardView.getContext();
        String str = audioTrack.yandex;
        DecimalFormat decimalFormat = C15638l.yandex;
        textView.setText(context.getString(R.string.separator_strings, str, AbstractC14205l.amazon(audioTrack.purchase, false)));
        textView2.setMaxLines(2);
        textView.setMaxLines(1);
        textView2.setTextColor(AbstractC13209l.yandex(R.attr.text_primary));
        textView.setTextColor(AbstractC13209l.yandex(R.attr.text_secondary));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.podcast_slider_item, viewGroup, false);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate;
        int i = R.id.listen;
        MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.listen);
        if (materialButton != null) {
            i = R.id.slider_text;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.slider_text);
            if (textView != null) {
                i = R.id.slider_title;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.slider_title);
                if (textView2 != null) {
                    i = R.id.song_album;
                    ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.song_album);
                    if (imageView != null) {
                        return new C4014l(imageView, textView, textView2, materialButton, materialCardView);
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f1252l.f36440l;
    }
}
