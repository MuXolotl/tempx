package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٍٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC9657l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19696l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19697l;

    public /* synthetic */ ViewOnClickListenerC9657l(int i, Object obj) {
        this.f19697l = i;
        this.f19696l = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC2484l c15288l;
        IBinder windowToken;
        int i = this.f19697l;
        InterfaceC14029l interfaceC14029l = null;
        int i2 = 2;
        int i3 = 0;
        Object obj = this.f19696l;
        switch (i) {
            case 0:
                AbstractC2338l abstractC2338l = (AbstractC2338l) obj;
                if (!abstractC2338l.f5079l) {
                    abstractC2338l.purchase();
                }
                break;
            case 1:
                C1500l c1500l = (C1500l) obj;
                EditText editText = c1500l.subs;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c1500l.startapp();
                    break;
                }
                break;
            case 2:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vk.com/club" + ((VKProfile) obj).yandex)));
                break;
            case 3:
                ((C0602l) obj).tapsense();
                break;
            case 4:
                List list = ((C9916l) obj).f20188l;
                if (!(((Catalog2Button) list.get(0)).yandex instanceof Catalog2ButtonAction.OpenUrl)) {
                    String str = ((Catalog2Button) list.get(0)).loadAd;
                    C8688l c8688l = C10328l.purchase;
                    AbstractC1213l.crashlytics(view, new C15191l(str, new C9810l(str, AbstractC10409l.crashlytics().amazon.ads(), i3)));
                } else {
                    C8183l.yandex.loadAd(((Catalog2ButtonAction.OpenUrl) ((Catalog2Button) list.get(0)).yandex).yandex);
                }
                break;
            case 5:
                C7711l c7711l = (C7711l) obj;
                C10740l c10740l = c7711l.f16189l;
                if (c10740l != null) {
                    ((C18480l) c10740l.f21748l).admob();
                }
                c7711l.m2197abstract();
                break;
            case 6:
                C2145l c2145l = (C2145l) obj;
                EditText editText2 = c2145l.billing;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c2145l.billing;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        i3 = 1;
                    }
                    EditText editText4 = c2145l.billing;
                    if (i3 != 0) {
                        editText4.setTransformationMethod(null);
                    } else {
                        editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        c2145l.billing.setSelection(selectionEnd);
                    }
                    c2145l.startapp();
                    break;
                }
                break;
            case 7:
                AbstractC9033l.loadAd((C0258l) obj, view.getContext(), false, new C17972l(i2, interfaceC14029l));
                break;
            case 8:
                ((Function1) obj).invoke(view);
                break;
            default:
                SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
                AppActivity appActivity = (AppActivity) view.getContext();
                InputMethodManager inputMethodManager = (InputMethodManager) appActivity.getSystemService("input_method");
                View currentFocus = appActivity.getCurrentFocus();
                if (currentFocus != null && (windowToken = currentFocus.getWindowToken()) != null) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
                }
                boolean zYandex = AbstractC8576l.yandex(smartSuggestion.crashlytics, "synth_fc");
                String str2 = smartSuggestion.yandex;
                if (zYandex) {
                    c15288l = new C15191l(str2, 4);
                } else {
                    if (str2 == null) {
                        str2 = "";
                    }
                    c15288l = new C15288l(smartSuggestion.amazon, str2);
                }
                AbstractC1213l.crashlytics(view, c15288l);
                break;
        }
    }
}
