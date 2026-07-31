package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lۣؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0664l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f2136l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f2137l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2138l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f2139l;

    public /* synthetic */ ViewOnClickListenerC0664l(C10038l c10038l, Activity activity, AudioTrack audioTrack, C17251l c17251l) {
        this.f2138l = 2;
        this.f2137l = c10038l;
        this.f2136l = activity;
        this.f2139l = audioTrack;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        int i = this.f2138l;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 0;
        Object obj = this.f2139l;
        Object obj2 = this.f2136l;
        Object obj3 = this.f2137l;
        switch (i) {
            case 0:
                Catalog2Button catalog2Button = (Catalog2Button) obj;
                Context context = ((C10390l) obj2).f21208l.getContext();
                AbstractC9694l abstractC9694l = ((C13983l) obj3).f27282l;
                if (catalog2Button != null) {
                    AbstractC10774l.ads(context, abstractC9694l, catalog2Button);
                    break;
                }
                break;
            case 1:
                C13983l c13983l = (C13983l) obj3;
                C10390l c10390l = (C10390l) obj2;
                AbstractC9033l.loadAd(c13983l, c10390l.f21208l.getContext(), false, new C7641l((VKProfile) obj, c13983l, c10390l, (InterfaceC14029l) null, 27));
                break;
            case 2:
                C10038l c10038l = (C10038l) obj3;
                Context context2 = (Context) obj2;
                AudioTrack audioTrack = (AudioTrack) obj;
                TextInputEditText textInputEditText = (TextInputEditText) c10038l.f20465l;
                TextInputEditText textInputEditText2 = (TextInputEditText) c10038l.f20462l;
                Editable text2 = textInputEditText.getText();
                if (text2 == null || text2.length() == 0 || (text = textInputEditText2.getText()) == null || text.length() == 0) {
                    Toast.makeText(context2, "Оба поля должны быть заполнены!", 1).show();
                } else {
                    ((MaterialButton) c10038l.f20466l).setEnabled(false);
                    AbstractC8189l.purchase(new C16534l(audioTrack, String.valueOf(textInputEditText.getText()), String.valueOf(textInputEditText2.getText())));
                    String.valueOf(textInputEditText.getText());
                    String.valueOf(textInputEditText2.getText());
                    Unit unit = Unit.INSTANCE;
                    ((DialogInterfaceC13913l) AbstractC1760l.admob.get()).dismiss();
                    AbstractC1760l.admob = null;
                }
                break;
            case 3:
                AbstractC9033l.crashlytics((AppActivity) C9967l.mopub(view.getContext()), new C4647l((C9122l) obj3, (C9916l) obj2, (C17015l) obj, (InterfaceC14029l) null, 20));
                break;
            case 4:
                Catalog2Button catalog2Button2 = (Catalog2Button) obj;
                C9916l c9916l = (C9916l) obj3;
                C10868l c10868l = (C10868l) obj2;
                Catalog2ButtonAction catalog2ButtonAction = catalog2Button2.yandex;
                if (catalog2ButtonAction instanceof C10329l) {
                    new C0228l(new C3005l(c9916l, view, 19), null, null, 14).Signature((Activity) view.getContext());
                    break;
                } else if (!(catalog2ButtonAction instanceof C9588l) && !(catalog2ButtonAction instanceof C0146l)) {
                    if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
                        ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).amazon.invoke(view.getContext());
                    }
                    break;
                } else {
                    Context context3 = c10868l.f21971l.getContext();
                    AbstractC9694l abstractC9694l2 = c9916l.f20190l;
                    if (abstractC9694l2 != null) {
                        AbstractC10774l.ads(context3, abstractC9694l2, catalog2Button2);
                        break;
                    }
                }
                break;
            default:
                final C11830l c11830l = (C11830l) obj3;
                final C13109l c13109l = (C13109l) obj2;
                final C17398l c17398l = c11830l.f23664l;
                int iOrdinal = ((EnumC13576l) obj).ordinal();
                int i3 = 4;
                switch (iOrdinal) {
                    case 0:
                        AbstractC9033l.loadAd(c17398l, c17398l.isVip(), false, new C13901l(c17398l, interfaceC14029l, i2));
                        break;
                    case 1:
                        C9312l c9312l = new C9312l(c17398l.isVip());
                        C14225l c14225l = (C14225l) c9312l.f28907l;
                        c14225l.amazon = c14225l.yandex.getText(R.string.confirm);
                        c14225l.billing = AbstractC0653l.ads(new StringBuilder("Удалить \""), c17398l.f33899l.mopub, "\"?");
                        c9312l.appmetrica(R.string.remove, new DialogInterfaceOnClickListenerC5488l(0, c17398l));
                        c9312l.applovin(R.string.cancel, new DialogInterfaceOnClickListenerC0609l(3));
                        c9312l.isVip();
                        break;
                    case 2:
                        C17398l.m4321protected(c17398l, new C4449l(c17398l, i3));
                        break;
                    case 3:
                        C9312l c9312l2 = new C9312l(c17398l.isVip());
                        C14225l c14225l2 = (C14225l) c9312l2.f28907l;
                        c14225l2.amazon = c14225l2.yandex.getText(R.string.confirm);
                        c14225l2.billing = c17398l.isVip().getString(R.string.cache_remove_playlist_desc, c17398l.f33899l.mopub);
                        c9312l2.appmetrica(R.string.remove, new DialogInterface.OnClickListener() { // from class: lْؔۧ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                dialogInterface.dismiss();
                                C17398l c17398l2 = c17398l;
                                AppActivity appActivity = (AppActivity) c17398l2.isVip();
                                AbstractC9033l.loadAd(AbstractC11990l.firebase(appActivity), appActivity, true, new C0932l(c17398l2, c11830l, c13109l, (InterfaceC14029l) null, 10));
                            }
                        });
                        DialogInterfaceOnClickListenerC5488l dialogInterfaceOnClickListenerC5488l = new DialogInterfaceOnClickListenerC5488l(1, c17398l);
                        c14225l2.firebase = c14225l2.yandex.getText(R.string.playlist_cache_update);
                        c14225l2.smaato = dialogInterfaceOnClickListenerC5488l;
                        c9312l2.applovin(R.string.cancel, new DialogInterfaceOnClickListenerC0609l(4));
                        c9312l2.isVip();
                        break;
                    case 4:
                        C17398l.m4321protected(c17398l, new C4449l(c17398l, 5));
                        break;
                    case 5:
                        new C2157l(new C9080l(c17398l.f33899l)).Signature(c17398l.isVip());
                        break;
                    case 6:
                        C17398l.m4321protected(c17398l, new C4449l(c17398l, 6));
                        break;
                    case 7:
                        C17398l.m4321protected(c17398l, new C4449l(c17398l, 7));
                        break;
                    default:
                        C18725l.billing();
                        break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0664l(Object obj, Object obj2, Object obj3, int i) {
        this.f2138l = i;
        this.f2137l = obj;
        this.f2136l = obj2;
        this.f2139l = obj3;
    }

    public /* synthetic */ ViewOnClickListenerC0664l(Catalog2Button catalog2Button, C9916l c9916l, C10868l c10868l) {
        this.f2138l = 4;
        this.f2139l = catalog2Button;
        this.f2137l = c9916l;
        this.f2136l = c10868l;
    }
}
