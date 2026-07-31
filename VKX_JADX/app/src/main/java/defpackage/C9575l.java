package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libcatalog.blocks.adapters.RecommendedPlaylistsAdapter$bindHolder$3;
import com.google.android.material.card.MaterialCardView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.RecommendedPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9575l extends AbstractC14630l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Object f19514l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f19515l;

    public /* synthetic */ C9575l(int i, Object obj) {
        this.f19515l = i;
        this.f19514l = obj;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        switch (this.f19515l) {
            case 0:
                return R.layout.c3_recomm_playlist;
            case 1:
                return R.layout.list_item_playlist_horizontal;
            default:
                return R.layout.c3_link_vertical;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) throws IOException {
        String str;
        Catalog2Button catalog2Button;
        int i2 = this.f19515l;
        Object obj2 = this.f19514l;
        switch (i2) {
            case 0:
                RecommendedPlaylist recommendedPlaylist = (RecommendedPlaylist) obj;
                C4786l c4786l = (C4786l) interfaceC0589l;
                C9554l c9554l = (C9554l) obj2;
                RecyclerView recyclerView = c4786l.f9818l;
                TextView textView = c4786l.f9824l;
                StringBuilder sb = new StringBuilder();
                Float f = recommendedPlaylist.crashlytics;
                sb.append((int) ((f != null ? f.floatValue() : 1.0f) * 100.0f));
                sb.append('%');
                textView.setText(sb.toString());
                c4786l.f9816l.setText(" • " + recommendedPlaylist.amazon);
                AudioPlaylist audioPlaylist = (AudioPlaylist) c9554l.loadAd.get(recommendedPlaylist.getYandex());
                c4786l.f9822l.setText(audioPlaylist != null ? audioPlaylist.mopub : null);
                ImageView imageView = c4786l.f9823l;
                String strValueOf = recommendedPlaylist.billing;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(audioPlaylist != null ? AbstractC14770l.purchase(audioPlaylist) : null);
                }
                C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
                C9477l c9477l = new C9477l(imageView.getContext());
                c9477l.crashlytics = strValueOf;
                AbstractC10413l.amazon(c9477l, imageView);
                c13177lYandex.yandex(c9477l.yandex());
                VKProfile vKProfile = (VKProfile) c9554l.admob.get(String.valueOf(recommendedPlaylist.loadAd));
                c4786l.f9820l.setText(vKProfile != null ? vKProfile.yandex() : null);
                ImageView imageView2 = c4786l.f9815l;
                str = vKProfile != null ? vKProfile.amazon : null;
                C13177l c13177lYandex2 = AbstractC2952l.yandex(imageView2.getContext());
                C9477l c9477l2 = new C9477l(imageView2.getContext());
                c9477l2.crashlytics = str;
                AbstractC10413l.amazon(c9477l2, imageView2);
                AbstractC12872l.crashlytics(c9477l2, new C2192l());
                c13177lYandex2.yandex(c9477l2.yandex());
                c4786l.f9817l.setOnClickListener(new ViewOnClickListenerC9663l(this, audioPlaylist, vKProfile));
                c4786l.f9819l.getContext();
                recyclerView.setLayoutManager(new RecommendedPlaylistsAdapter$bindHolder$3(1));
                C14451l c14451l = new C14451l(false, false, 0, null, null, null, 95);
                c14451l.f28311l = new C8854l(this, c4786l, audioPlaylist, vKProfile);
                List list = recommendedPlaylist.purchase;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AudioTrack audioTrack = (AudioTrack) c9554l.yandex.get((String) it.next());
                    if (audioTrack != null) {
                        arrayList.add(audioTrack);
                    }
                }
                c14451l.appmetrica(arrayList);
                recyclerView.setAdapter(c14451l);
                c4786l.f9821l.setOnClickListener(new ViewOnClickListenerC9663l(audioPlaylist, 3));
                break;
            case 1:
                RecommendedPlaylist recommendedPlaylist2 = (RecommendedPlaylist) obj;
                C15896l c15896l = (C15896l) interfaceC0589l;
                C9554l c9554l2 = (C9554l) obj2;
                TextView textView2 = c15896l.f31176l;
                StringBuilder sb2 = new StringBuilder();
                Float f2 = recommendedPlaylist2.crashlytics;
                sb2.append((int) ((f2 != null ? f2.floatValue() : 1.0f) * 100.0f));
                sb2.append("% • ");
                sb2.append(recommendedPlaylist2.amazon);
                textView2.setText(sb2.toString());
                AudioPlaylist audioPlaylist2 = (AudioPlaylist) c9554l2.loadAd.get(recommendedPlaylist2.getYandex());
                c15896l.f31178l.setText(audioPlaylist2 != null ? audioPlaylist2.mopub : null);
                AbstractC3282l.loadAd(c15896l.f31177l, audioPlaylist2, 3, 6);
                VKProfile vKProfile2 = (VKProfile) c9554l2.admob.get(String.valueOf(recommendedPlaylist2.loadAd));
                c15896l.f31174l.setText(vKProfile2 != null ? vKProfile2.yandex() : null);
                AbstractC5833l.purchase(c15896l.f31173l);
                c15896l.f31175l.setOnClickListener(new ViewOnClickListenerC9663l(audioPlaylist2, 4));
                break;
            default:
                AudioBook audioBook = (AudioBook) obj;
                C15544l c15544l = (C15544l) interfaceC0589l;
                LinearLayout linearLayout = c15544l.f30384l;
                TextView textView3 = c15544l.f30382l;
                Catalog2Block catalog2Block = (Catalog2Block) obj2;
                List crashlytics = catalog2Block.getCrashlytics();
                if (crashlytics == null) {
                    crashlytics = C2580l.f5619l;
                }
                Catalog2Button catalog2Button2 = (Catalog2Button) AbstractC16901l.m4217extends(crashlytics);
                AbstractC17891l.crashlytics(c15544l.f30383l, AbstractC8320l.crashlytics(audioBook.adcel), Integer.valueOf(R.drawable.placeholder_link), new C10923l(new C16849l(), 6));
                TextView textView4 = c15544l.f30385l;
                str = catalog2Button2 != null ? catalog2Button2.isPro : null;
                if (str == null) {
                    str = "";
                }
                textView4.setText(str);
                textView3.setText(audioBook.admob);
                AbstractC5833l.subs(textView3);
                AbstractC0977l.yandex(linearLayout);
                List crashlytics2 = catalog2Block.getCrashlytics();
                if (crashlytics2 != null && (catalog2Button = (Catalog2Button) AbstractC16901l.m4217extends(crashlytics2)) != null) {
                    linearLayout.setOnClickListener(new ViewOnClickListenerC18156l(c15544l, catalog2Button, 0));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f19515l) {
            case 0:
                View viewInflate = layoutInflater.inflate(R.layout.c3_recomm_playlist, viewGroup, false);
                int i = R.id.audios;
                RecyclerView recyclerView = (RecyclerView) AbstractC8576l.smaato(viewInflate, R.id.audios);
                if (recyclerView != null) {
                    i = R.id.avatar;
                    ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.avatar);
                    if (imageView != null) {
                        MaterialCardView materialCardView = (MaterialCardView) viewInflate;
                        i = R.id.common;
                        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.common);
                        if (textView != null) {
                            i = R.id.header;
                            RelativeLayout relativeLayout = (RelativeLayout) AbstractC8576l.smaato(viewInflate, R.id.header);
                            if (relativeLayout != null) {
                                i = R.id.percent;
                                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.percent);
                                if (textView2 != null) {
                                    i = R.id.percent_text;
                                    TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.percent_text);
                                    if (textView3 != null) {
                                        i = R.id.play;
                                        ImageView imageView2 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.play);
                                        if (imageView2 != null) {
                                            i = R.id.playlist_image;
                                            ImageView imageView3 = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.playlist_image);
                                            if (imageView3 != null) {
                                                i = R.id.user;
                                                TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.user);
                                                if (textView4 != null) {
                                                    return new C4786l(materialCardView, recyclerView, imageView, textView, relativeLayout, textView2, textView3, imageView2, imageView3, textView4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            case 1:
                return C15896l.yandex(layoutInflater, viewGroup);
            default:
                return C15544l.yandex(layoutInflater, viewGroup);
        }
    }
}
