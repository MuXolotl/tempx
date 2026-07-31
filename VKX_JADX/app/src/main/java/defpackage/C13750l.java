package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;

/* JADX INFO: renamed from: lْۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13750l {
    public final ArrayList loadAd = new ArrayList();
    public int yandex;

    static {
        final int i = 0;
        AbstractC13015l.loadAd(R.attr.textColor, TextView.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i2) {
                switch (i) {
                    case 0:
                        ((TextView) view).setTextColor(i2);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i2));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i2);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i2));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i2));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i2);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i2);
                        return;
                    case 7:
                        view.setBackgroundColor(i2);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i2);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i2);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i2);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i2, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i2, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i2);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i2);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i2);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i2));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i2));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i2));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i2));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i2));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i2));
                        return;
                }
            }
        });
        final int i2 = 2;
        AbstractC13015l.loadAd(R.attr.textColorHint, TextView.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i3) {
                switch (i2) {
                    case 0:
                        ((TextView) view).setTextColor(i3);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i3));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i3);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i3));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i3));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i3);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i3);
                        return;
                    case 7:
                        view.setBackgroundColor(i3);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i3);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i3);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i3);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i3, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i3, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i3);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i3);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i3);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i3));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i3));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i3));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i3));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i3));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i3));
                        return;
                }
            }
        });
        final int i3 = 5;
        AbstractC13015l.loadAd(R.attr.textColorLink, TextView.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i4) {
                switch (i3) {
                    case 0:
                        ((TextView) view).setTextColor(i4);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i4));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i4);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i4));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i4));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i4);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i4);
                        return;
                    case 7:
                        view.setBackgroundColor(i4);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i4);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i4);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i4);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i4, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i4, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i4);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i4);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i4);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i4));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i4));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i4));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i4));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i4));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i4));
                        return;
                }
            }
        });
        final int i4 = 6;
        AbstractC13015l.loadAd(R.attr.textColorHighlight, TextView.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i5) {
                switch (i4) {
                    case 0:
                        ((TextView) view).setTextColor(i5);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i5));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i5);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i5));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i5));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i5);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i5);
                        return;
                    case 7:
                        view.setBackgroundColor(i5);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i5);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i5);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i5);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i5, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i5, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i5);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i5);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i5);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i5));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i5));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i5));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i5));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i5));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i5));
                        return;
                }
            }
        });
        final int i5 = 7;
        AbstractC13015l.yandex(R.attr.background, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i6) {
                switch (i5) {
                    case 0:
                        ((TextView) view).setTextColor(i6);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i6));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i6);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i6));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i6));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i6);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i6);
                        return;
                    case 7:
                        view.setBackgroundColor(i6);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i6);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i6);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i6);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i6, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i6, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i6);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i6);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i6);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i6));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i6));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i6));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i6));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i6));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i6));
                        return;
                }
            }
        });
        final int i6 = 8;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.titleTextColor, Toolbar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i7) {
                switch (i6) {
                    case 0:
                        ((TextView) view).setTextColor(i7);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i7));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i7);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i7));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i7));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i7);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i7);
                        return;
                    case 7:
                        view.setBackgroundColor(i7);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i7);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i7);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i7);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i7, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i7, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i7);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i7);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i7);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i7));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i7));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i7));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i7));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i7));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i7));
                        return;
                }
            }
        });
        final int i7 = 9;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.subtitleTextColor, Toolbar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i8) {
                switch (i7) {
                    case 0:
                        ((TextView) view).setTextColor(i8);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i8));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i8);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i8));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i8));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i8);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i8);
                        return;
                    case 7:
                        view.setBackgroundColor(i8);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i8);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i8);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i8);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i8, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i8, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i8);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i8);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i8);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i8));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i8));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i8));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i8));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i8));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i8));
                        return;
                }
            }
        });
        final int i8 = 11;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.trackTint, SwitchCompat.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i9) {
                switch (i8) {
                    case 0:
                        ((TextView) view).setTextColor(i9);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i9));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i9);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i9));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i9));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i9);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i9);
                        return;
                    case 7:
                        view.setBackgroundColor(i9);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i9);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i9);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i9);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i9, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i9, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i9);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i9);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i9);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i9));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i9));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i9));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i9));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i9));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i9));
                        return;
                }
            }
        });
        final int i9 = 12;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.thumbTint, SwitchCompat.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i10) {
                switch (i9) {
                    case 0:
                        ((TextView) view).setTextColor(i10);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i10));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i10);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i10));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i10));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i10);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i10);
                        return;
                    case 7:
                        view.setBackgroundColor(i10);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i10);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i10);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i10);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i10, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i10, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i10);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i10);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i10);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i10));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i10));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i10));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i10));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i10));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i10));
                        return;
                }
            }
        });
        final int i10 = 13;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.strokeColor, MaterialCardView.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i11) {
                switch (i10) {
                    case 0:
                        ((TextView) view).setTextColor(i11);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i11));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i11);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i11));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i11));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i11);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i11);
                        return;
                    case 7:
                        view.setBackgroundColor(i11);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i11);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i11);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i11);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i11, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i11, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i11);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i11);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i11);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i11));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i11));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i11));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i11));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i11));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i11));
                        return;
                }
            }
        });
        final int i11 = 10;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.cardBackgroundColor, AbstractC2568l.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i12) {
                switch (i11) {
                    case 0:
                        ((TextView) view).setTextColor(i12);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i12));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i12);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i12));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i12));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i12);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i12);
                        return;
                    case 7:
                        view.setBackgroundColor(i12);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i12);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i12);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i12);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i12, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i12, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i12);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i12);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i12);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i12));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i12));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i12));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i12));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i12));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i12));
                        return;
                }
            }
        });
        final int i12 = 14;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.chipBackgroundColor, AbstractC11622l.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i13) {
                switch (i12) {
                    case 0:
                        ((TextView) view).setTextColor(i13);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i13));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i13);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i13));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i13));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i13);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i13);
                        return;
                    case 7:
                        view.setBackgroundColor(i13);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i13);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i13);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i13);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i13, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i13, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i13);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i13);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i13);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i13));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i13));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i13));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i13));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i13));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i13));
                        return;
                }
            }
        });
        final int i13 = 15;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.closeIconTint, AbstractC11622l.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i14) {
                switch (i13) {
                    case 0:
                        ((TextView) view).setTextColor(i14);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i14));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i14);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i14));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i14));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i14);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i14);
                        return;
                    case 7:
                        view.setBackgroundColor(i14);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i14);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i14);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i14);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i14, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i14, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i14);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i14);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i14);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i14));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i14));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i14));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i14));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i14));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i14));
                        return;
                }
            }
        });
        final int i14 = 16;
        AbstractC13015l.yandex(R.attr.backgroundTint, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i15) {
                switch (i14) {
                    case 0:
                        ((TextView) view).setTextColor(i15);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i15));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i15);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i15));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i15));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i15);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i15);
                        return;
                    case 7:
                        view.setBackgroundColor(i15);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i15);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i15);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i15);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i15, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i15, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i15);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i15);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i15);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i15));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i15));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i15));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i15));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i15));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i15));
                        return;
                }
            }
        });
        final int i15 = 17;
        AbstractC13015l.yandex(ua.itaysonlab.vkx.R.attr.backgroundTint, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i16) {
                switch (i15) {
                    case 0:
                        ((TextView) view).setTextColor(i16);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i16));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i16);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i16));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i16));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i16);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i16);
                        return;
                    case 7:
                        view.setBackgroundColor(i16);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i16);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i16);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i16);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i16, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i16, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i16);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i16);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i16);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i16));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i16));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i16));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i16));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i16));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i16));
                        return;
                }
            }
        });
        final int i16 = 18;
        AbstractC13015l.yandex(R.attr.tint, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i17) {
                switch (i16) {
                    case 0:
                        ((TextView) view).setTextColor(i17);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i17));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i17);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i17));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i17));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i17);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i17);
                        return;
                    case 7:
                        view.setBackgroundColor(i17);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i17);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i17);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i17);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i17, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i17, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i17);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i17);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i17);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i17));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i17));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i17));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i17));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i17));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i17));
                        return;
                }
            }
        });
        final int i17 = 19;
        AbstractC13015l.loadAd(R.attr.indeterminateTint, ProgressBar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i18) {
                switch (i17) {
                    case 0:
                        ((TextView) view).setTextColor(i18);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i18));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i18);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i18));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i18));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i18);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i18);
                        return;
                    case 7:
                        view.setBackgroundColor(i18);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i18);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i18);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i18);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i18, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i18, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i18);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i18);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i18);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i18));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i18));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i18));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i18));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i18));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i18));
                        return;
                }
            }
        });
        final int i18 = 20;
        AbstractC13015l.loadAd(R.attr.progressTint, ProgressBar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i19) {
                switch (i18) {
                    case 0:
                        ((TextView) view).setTextColor(i19);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i19));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i19);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i19));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i19));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i19);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i19);
                        return;
                    case 7:
                        view.setBackgroundColor(i19);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i19);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i19);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i19);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i19, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i19, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i19);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i19);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i19);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i19));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i19));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i19));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i19));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i19));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i19));
                        return;
                }
            }
        });
        final int i19 = 21;
        AbstractC13015l.loadAd(R.attr.progressBackgroundTint, ProgressBar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i110) {
                switch (i19) {
                    case 0:
                        ((TextView) view).setTextColor(i110);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i110);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i110);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i110);
                        return;
                    case 7:
                        view.setBackgroundColor(i110);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i110);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i110);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i110);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i110, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i110, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i110);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i110));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i110));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                }
            }
        });
        final int i20 = 1;
        AbstractC13015l.loadAd(R.attr.secondaryProgressTint, ProgressBar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i110) {
                switch (i20) {
                    case 0:
                        ((TextView) view).setTextColor(i110);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i110);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i110);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i110);
                        return;
                    case 7:
                        view.setBackgroundColor(i110);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i110);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i110);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i110);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i110, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i110, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i110);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i110));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i110));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                }
            }
        });
        final int i21 = 3;
        AbstractC13015l.loadAd(ua.itaysonlab.vkx.R.attr.thumbTint, SeekBar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i110) {
                switch (i21) {
                    case 0:
                        ((TextView) view).setTextColor(i110);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i110);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i110);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i110);
                        return;
                    case 7:
                        view.setBackgroundColor(i110);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i110);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i110);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i110);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i110, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i110, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i110);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i110));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i110));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                }
            }
        });
        final int i22 = 4;
        AbstractC13015l.loadAd(R.attr.thumbTint, SeekBar.class, new InterfaceC6697l() { // from class: lٜؓٛ
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i110) {
                switch (i22) {
                    case 0:
                        ((TextView) view).setTextColor(i110);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i110);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i110));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i110);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i110);
                        return;
                    case 7:
                        view.setBackgroundColor(i110);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i110);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i110);
                        return;
                    case 10:
                        ((AbstractC2568l) view).setCardBackgroundColor(i110);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC14093l.subs(i110, 119), AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i110, AbstractC14093l.subs(AbstractC13209l.yandex(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i110);
                        return;
                    case 14:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 15:
                        if (view != null) {
                            throw new ClassCastException();
                        }
                        ColorStateList.valueOf(i110);
                        throw null;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i110));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i110));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i110));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i110));
                        return;
                }
            }
        });
        InterfaceC6697l.loadAd.put(1077215232L, new C1740l());
    }
}
