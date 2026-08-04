package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٕؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3899l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0858l f8039l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8040l;

    public /* synthetic */ C3899l(C0858l c0858l, int i) {
        this.f8040l = i;
        this.f8039l = c0858l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DialogInterfaceC13913l dialogInterfaceC13913l;
        int i = this.f8040l;
        ?? r6 = 0;
        C0858l c0858l = this.f8039l;
        switch (i) {
            case 0:
                C4456l c4456l = (C4456l) obj;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                c16076l.yandex(Collections.singletonList(c0858l.f2514l), true);
                Activity activity = c4456l.f5081l;
                AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
                if (appActivity != null) {
                    Integer numValueOf = Integer.valueOf(R.drawable.ic_list_add_outline_28);
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    C6666l.yandex(appActivity, new C10734l(numValueOf, (vKXApplication != null ? vKXApplication : 0).getString(R.string.play_next_ok), null, null, null, 212));
                }
                c4456l.purchase();
                return Unit.INSTANCE;
            case 1:
                C4456l c4456l2 = (C4456l) obj;
                new C9231l(c0858l.f2514l).Signature(c4456l2.f5081l);
                c4456l2.purchase();
                return Unit.INSTANCE;
            case 2:
                C4456l c4456l3 = (C4456l) obj;
                AbstractC1213l.billing(c4456l3.f5081l, new C15288l(c0858l.f2514l.yandex));
                c4456l3.m1548package();
                return Unit.INSTANCE;
            case 3:
                C4456l c4456l4 = (C4456l) obj;
                Activity activity2 = c4456l4.f5081l;
                AudioTrack audioTrack = c0858l.f2514l;
                C17251l c17251l = new C17251l(0);
                WeakReference weakReference = AbstractC1760l.admob;
                if (weakReference != null && (dialogInterfaceC13913l = (DialogInterfaceC13913l) weakReference.get()) != null) {
                    dialogInterfaceC13913l.dismiss();
                }
                AbstractC1760l.admob = null;
                C9312l c9312l = new C9312l(activity2);
                C14225l c14225l = (C14225l) c9312l.f28907l;
                c14225l.amazon = c14225l.yandex.getText(R.string.edit_audio_dialog);
                View viewInflate = LayoutInflater.from(activity2).inflate(R.layout.sconnect_edit_audio, (ViewGroup) null, false);
                int i2 = R.id.artist;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC8576l.smaato(viewInflate, R.id.artist);
                if (textInputEditText != null) {
                    i2 = R.id.artist_root;
                    if (((TextInputLayout) AbstractC8576l.smaato(viewInflate, R.id.artist_root)) != null) {
                        i2 = R.id.save;
                        MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.save);
                        if (materialButton != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            i2 = R.id.title;
                            TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC8576l.smaato(viewInflate, R.id.title);
                            if (textInputEditText2 != null) {
                                i2 = R.id.title_root;
                                if (((TextInputLayout) AbstractC8576l.smaato(viewInflate, R.id.title_root)) != null) {
                                    C10038l c10038l = new C10038l(linearLayout, textInputEditText, materialButton, textInputEditText2, 23);
                                    textInputEditText2.setText(audioTrack.amazon);
                                    textInputEditText.setText(audioTrack.yandex);
                                    materialButton.setOnClickListener(new ViewOnClickListenerC0664l(c10038l, activity2, audioTrack, c17251l));
                                    c14225l.startapp = linearLayout;
                                    AbstractC1760l.admob = new WeakReference(c9312l.isVip());
                                    c4456l4.purchase();
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
                C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            case 4:
                C4456l c4456l5 = (C4456l) obj;
                Activity activity3 = c4456l5.f5081l;
                AudioTrack audioTrack2 = c0858l.f2514l;
                VKXApplication.Companion companion = VKXApplication.f36628l;
                AbstractC1213l.billing(activity3, new C5718l(VKXApplication.Companion.loadAd(R.string.tab_recommendations), new C6298l(AbstractC16676l.billing(audioTrack2), audioTrack2.yandex + " - " + audioTrack2.amazon)));
                c4456l5.m1548package();
                return Unit.INSTANCE;
            case 5:
                C4456l c4456l6 = (C4456l) obj;
                Activity activity4 = c4456l6.f5081l;
                AbstractC9033l.crashlytics((AppActivity) activity4, new C5945l(c0858l, activity4, null));
                c4456l6.purchase();
                return Unit.INSTANCE;
            case 6:
                C4456l c4456l7 = (C4456l) obj;
                new C11249l(c0858l.f2514l, null).Signature(c4456l7.f5081l);
                c4456l7.purchase();
                return Unit.INSTANCE;
            case 7:
                C4456l c4456l8 = (C4456l) obj;
                AppActivity appActivity2 = (AppActivity) c4456l8.f5081l;
                AudioTrack audioTrack3 = c0858l.f2514l;
                AbstractC11397l.mopub(appActivity2, new C11704l(audioTrack3, 4));
                AppActivity appActivity3 = (AppActivity) c4456l8.f5081l;
                Integer numValueOf2 = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion2 = VKXApplication.f36628l;
                C6666l.yandex(appActivity3, new C10734l(numValueOf2, VKXApplication.Companion.loadAd(R.string.sn_track_added_to_cache), audioTrack3.yandex + " - " + audioTrack3.amazon, null, null, 248));
                c4456l8.purchase();
                return Unit.INSTANCE;
            case 8:
                C4456l c4456l9 = (C4456l) obj;
                C7268l c7268l = C7268l.f15111l;
                AppActivity appActivity4 = (AppActivity) c4456l9.f5081l;
                AudioTrack audioTrack4 = c0858l.f2514l;
                c7268l.getClass();
                C15478l.purchase.getClass();
                AbstractC0532l.loadAd(new C9810l(appActivity4, audioTrack4, 18), appActivity4);
                AppActivity appActivity5 = (AppActivity) c4456l9.f5081l;
                Integer numValueOf3 = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion3 = VKXApplication.f36628l;
                C6666l.yandex(appActivity5, new C10734l(numValueOf3, VKXApplication.Companion.loadAd(R.string.sn_track_added_to_cache), audioTrack4.yandex + " - " + audioTrack4.amazon, null, null, 248));
                c4456l9.purchase();
                return Unit.INSTANCE;
            case 9:
                C4456l c4456l10 = (C4456l) obj;
                new C2157l(new C0399l(c0858l.f2514l)).Signature(c4456l10.f5081l);
                c4456l10.purchase();
                return Unit.INSTANCE;
            case 10:
                AudioTrack audioTrack5 = c0858l.f2514l;
                ((AppActivity) ((Activity) obj)).license(new C17398l(audioTrack5.vip.yandex.intValue(), 8, audioTrack5.vip.loadAd.longValue(), audioTrack5.vip.crashlytics));
                return Unit.INSTANCE;
            default:
                C4456l c4456l11 = (C4456l) obj;
                C16076l c16076l2 = VKXApplication.f36632l;
                if (c16076l2 == null) {
                    c16076l2 = null;
                }
                AudioTrack audioTrack6 = c0858l.f2514l;
                c16076l2.getClass();
                c16076l2.subs(new C17949l(c16076l2, audioTrack6, r6, 7));
                Activity activity5 = c4456l11.f5081l;
                AppActivity appActivity6 = activity5 instanceof AppActivity ? (AppActivity) activity5 : null;
                if (appActivity6 != null) {
                    Integer numValueOf4 = Integer.valueOf(R.drawable.ic_list_add_outline_28);
                    VKXApplication vKXApplication2 = VKXApplication.f36631l;
                    C6666l.yandex(appActivity6, new C10734l(numValueOf4, (vKXApplication2 != null ? vKXApplication2 : null).getString(R.string.play_next_ok), null, null, null, 212));
                }
                c4456l11.purchase();
                return Unit.INSTANCE;
        }
    }
}
